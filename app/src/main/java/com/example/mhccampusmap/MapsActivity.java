package com.example.mhccampusmap;

import static com.example.mhccampusmap.R.menu.nav_menu;

import android.Manifest;
import android.app.SearchManager;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.mhccampusmap.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    public GoogleMap mMap;
    public ActivityMapsBinding binding;
    private EditText search_Bar;
    //listview object name
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private SupportMapFragment mapFragment;
    private View noResultsText;
    //array of building names (buildings)
    public String[] buildings = new String[]{
            //"COMMON SEARCHES",
            "Harriet Newhall Center of Admissions",
            "Community center",
            "Mary Woolley Hall (Chapin Auditorium)",
            "Equestrian Center",
            "Williston Library",
            "Willits-Hallowell Conference Center",
            "Blanchard Hall",
            //"ACADEMIC BUILDINGS",
            "Art Building and MHC Art Museum",
            "Carr Laboratory",
            "Ciruti Language Center",
            "Clapp laboratory (Hooker Auditorium)",
            "Cleveland Hall",
            "Dwight Hall",
            "Emeriti House / 1 Woodbridge St",
            "Gorse Children’s Center",
            "Kendade Hall",
            "Kendall Sports and Dance Complex",
            "Merrill House",
            "Porter Hall",
            "Pratt Music Hall",
            "Reese Psychology and Education Building",
            "Rooke Theatre",
            "Shattuck Hall",
            "Skinner Hall",
            "Talcott Greenhouse",
            "Williston Observatory",
            "25 Morgan Street",
            "8 Park Street",
            //"RESIDENCE HALLS",
            "1837 Hall",
            "Abbey Hall",
            "Brigham Hall",
            "Buckland Hall",
            "Creighton Hall",
            "Dickinson Hall",
            "Ham Hall",
            "MacGregor Hall",
            "Mandelle Hall",
            "Mead Hall",
            "Pearsons Hall (Annex)",
            "Porter Hall",
            "Prospect Hall",
            "Rockefeller Hall",
            "Safford Hall",
            "Torrey Hall",
            "Wilder Hall",
            //"OTHER",
            "Abbey Chapel",
            "Asian Center for Empowerment (ACE)",
            "Auxiliary Services",
            "Canoe House",
            "Community Boathouse",
            "Eliot House",
            "Five College Women’s Studies Research Center",
            "Gettell Amphitheater",
            "Groves Health Center",
            "Jeannette Marks Cultural Center",
            "Career Development Center (CDC)",
            "Skinner Museum",
            "Mary Lyon Hall",
            "Odyssey Bookshop",
            "Orchards Golf Club",
            "Ortega and Banteah Cultural Centers",
            "President’s House",
            "Public Safety",
            "Shabazz Cultural Center",
            //"POINTS OF INTEREST",
            "Field Gate",
            "Mary Lyon's grave",
            "Pageant Green",
            "Restoration Ecology Program’s Project Stream",
            "Skinner Green",
            //"FUN",
            "Six Flags New England",
            "IYA Sushi and Noodle Kitchen",
            "South Hadley's Tower Theaters",
            "Food 101 Bar and Bistro",
            "Thirsty Mind Coffee and Wine Bar",
            "Johnny's Bar and Grille",
            "Holyoke Mall",
            "JCPenney",
            "Stop and Shop",
            "Hampshire Mall",
            "Mom's House Chinese Market",
            "Insomnia Cookies"
    };

    public MapsActivity() {
    }

    public void zoomToBuildingLocation(String buildingName) {
        //COMMON SEARCHES
        if (buildingName.equals("Harriet Newhall Center of Admissions")) {

            // Add a marker in Harriet Newhall Center of Admissions and zoom in the camera
            LatLng admissions = new LatLng(42.257993763155035, -72.5763013521109);
            mMap.addMarker(new MarkerOptions().position(admissions).title("The Office of Admissions"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(admissions, 20.0f), 5000, null);
        }

        if (buildingName.equals("Community center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Communitycenter = new LatLng(42.25531086133059, -72.5741904231545);
            mMap.addMarker(new MarkerOptions().position(Communitycenter).title("Community center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Communitycenter, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mary Woolley Hall (Chapin Auditorium)")) {

            // Add a marker in Community center and zoom in the camera
            LatLng MaryWoolleyHall = new LatLng(42.254072906880296, -72.57655461455171);
            mMap.addMarker(new MarkerOptions().position(MaryWoolleyHall).title("Chapin Auditorium"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MaryWoolleyHall, 20.0f), 5000, null);
        }

        if (buildingName.equals("Equestrian Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng EquestrianCenter = new LatLng(42.25498453290508, -72.56540295583922);
            mMap.addMarker(new MarkerOptions().position(EquestrianCenter).title("Equestrian Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(EquestrianCenter, 20.0f), 5000, null);
        }

        if (buildingName.equals("Williston Library")) {

            // Add a marker in Community center and zoom in the camera
            LatLng WillistonLibrary = new LatLng(42.25771162681204, -72.57522590002047);
            mMap.addMarker(new MarkerOptions().position(WillistonLibrary).title("Williston Library"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(WillistonLibrary, 20.0f), 5000, null);
        }

        if (buildingName.equals("Willits-Hallowell Conference Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng ConferenceCenter = new LatLng(42.25711993584272, -72.57129028467547);
            mMap.addMarker(new MarkerOptions().position(ConferenceCenter).title("Willits-Hallowell Conference Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ConferenceCenter, 20.0f), 5000, null);
        }

        if (buildingName.equals("Blanchard Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng BlanchardHall = new LatLng(42.25529727578034, -72.57418205751225);
            mMap.addMarker(new MarkerOptions().position(BlanchardHall).title("Blanchard Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(BlanchardHall, 20.0f), 5000, null);
        }

        //ACADEMIC BUILDINGS
        if (buildingName.equals("Art Building and MHC Art Museum")) {

            // Add a marker in Community center and zoom in the camera
            LatLng art = new LatLng(42.256809047537836, -72.57256371972221);
            mMap.addMarker(new MarkerOptions().position(art).title("Art Building and MHC Art Museum"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(art, 20.0f), 5000, null);
        }

        if (buildingName.equals("Carr Laboratory")) {

            // Add a marker in Community center and zoom in the camera
            LatLng carr = new LatLng(42.257757852711805, -72.57357138652934);
            mMap.addMarker(new MarkerOptions().position(carr).title("Carr Laboratory"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(carr, 20.0f), 5000, null);
        }

        if (buildingName.equals("Ciruti Language Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng ciruti = new LatLng(42.25535474956312, -72.57332574049408);
            mMap.addMarker(new MarkerOptions().position(ciruti).title("Ciruti Language Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ciruti, 20.0f), 5000, null);
        }

        if (buildingName.equals("Clapp laboratory (Hooker Auditorium)")) {

            // Add a marker in Community center and zoom in the camera
            LatLng clapp = new LatLng(42.256907105698666, -72.57382461536564);
            mMap.addMarker(new MarkerOptions().position(clapp).title("Clapp laboratory (Hooker Auditorium)"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(clapp, 20.0f), 5000, null);
        }

        if (buildingName.equals("Cleveland Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Cleveland = new LatLng(42.2580210266116, -72.57368801536553);
            mMap.addMarker(new MarkerOptions().position(Cleveland).title("Cleveland Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Cleveland, 20.0f), 5000, null);
        }

        if (buildingName.equals("Dwight Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng dwight = new LatLng(42.258210688980704, -72.57507604605568);
            mMap.addMarker(new MarkerOptions().position(dwight).title("Dwight Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dwight, 20.0f), 5000, null);
        }

        if (buildingName.equals("Emeriti House / 1 Woodbridge St")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Emeriti = new LatLng(42.25904767298696, -72.57458411942439);
            mMap.addMarker(new MarkerOptions().position(Emeriti).title("Emeriti House"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Emeriti, 20.0f), 5000, null);
        }

        if (buildingName.equals("Gorse Children’s Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Gorse = new LatLng(42.2516368933629, -72.57519050106106);
            mMap.addMarker(new MarkerOptions().position(Gorse).title("Gorse Children’s Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Gorse, 20.0f), 5000, null);
        }

        if (buildingName.equals("Kendade Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Kendade = new LatLng(42.25766349001423, -72.57391467303812);
            mMap.addMarker(new MarkerOptions().position(Kendade).title("Kendade Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kendade, 20.0f), 5000, null);
        }

        if (buildingName.equals("Kendall Sports & Dance Complex")) {

            // Add a marker in Community center and zoom in the camera
            LatLng kendall = new LatLng(42.25959707225831, -72.57028200372821);
            mMap.addMarker(new MarkerOptions().position(kendall).title("Kendall Sports & Dance Complex"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kendall, 20.0f), 5000, null);
        }

        if (buildingName.equals("Merrill House")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Merrill = new LatLng(42.25815459495613, -72.57613968992302);
            mMap.addMarker(new MarkerOptions().position(Merrill).title("Merrill House"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Merrill, 20.0f), 5000, null);
        }

        if (buildingName.equals("Porter Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Porter = new LatLng(42.25588245242568, -72.57420960372832);
            mMap.addMarker(new MarkerOptions().position(Porter).title("Porter Hall "));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Porter, 20.0f), 5000, null);
        }

        if (buildingName.equals("Pratt Music Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Pratt = new LatLng(42.253594896003406, -72.57412909943152);
            mMap.addMarker(new MarkerOptions().position(Pratt).title("Pratt Music Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Pratt, 20.0f), 5000, null);
        }

        if (buildingName.equals("Reese Psychology and Education Building")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Reese = new LatLng(42.25780722676054, -72.57290464524083);
            mMap.addMarker(new MarkerOptions().position(Reese).title("Reese Psychology and Education Building"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Reese, 20.0f), 5000, null);
        }

        if (buildingName.equals("Rooke Theatre")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Rooke = new LatLng(42.253153457236586, -72.57531444420196);
            mMap.addMarker(new MarkerOptions().position(Rooke).title("Rooke Theatre"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Rooke, 20.0f), 5000, null);
        }

        if (buildingName.equals("Shattuck Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Shattuck = new LatLng(42.25797118943301, -72.57426204420184);
            mMap.addMarker(new MarkerOptions().position(Shattuck).title("Shattuck Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Shattuck, 20.0f), 5000, null);
        }

        if (buildingName.equals("Skinner Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Skinner = new LatLng(42.25541900719792, -72.57613135583921);
            mMap.addMarker(new MarkerOptions().position(Skinner).title("Skinner Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Skinner, 20.0f), 5000, null);
        }

        if (buildingName.equals("Talcott Greenhouse")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Talcott = new LatLng(42.2575101167725, -72.57208187688079);
            mMap.addMarker(new MarkerOptions().position(Talcott).title("Talcott Greenhouse"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Talcott, 20.0f), 5000, null);
        }

        if (buildingName.equals("Williston Observatory")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Williston = new LatLng(42.25617985248191, -72.57763383928442);
            mMap.addMarker(new MarkerOptions().position(Williston).title("Williston Observatory"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Williston, 20.0f), 5000, null);
        }

        if (buildingName.equals("25 Morgan Street")) {

            // Add a marker in Community center and zoom in the camera
            LatLng morgan = new LatLng(42.25246166538273, -72.5750388865295);
            mMap.addMarker(new MarkerOptions().position(morgan).title("25 Morgan Street"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(morgan, 20.0f), 5000, null);
        }

        if (buildingName.equals("8 Park Street")) {

            // Add a marker in Community center and zoom in the camera
            LatLng park = new LatLng(42.258693688068185, -72.57372297303813);
            mMap.addMarker(new MarkerOptions().position(park).title("8 Park Street"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(park, 20.0f), 5000, null);
        }

        //RESIDENCE HALLS
        if (buildingName.equals("1837 Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng eight = new LatLng(42.2540111733511, -72.57123879816676);
            mMap.addMarker(new MarkerOptions().position(eight).title("1837 Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(eight, 20.0f), 5000, null);
        }

        if (buildingName.equals("Abbey Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Abbey = new LatLng(42.253220198406716, -72.57666103071077);
            mMap.addMarker(new MarkerOptions().position(Abbey).title("Abbey Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Abbey, 20.0f), 5000, null);
        }

        if (buildingName.equals("Brigham Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Brigham = new LatLng(42.25614781564086, -72.57552197303814);
            mMap.addMarker(new MarkerOptions().position(Brigham).title("Brigham Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Brigham, 20.0f), 5000, null);
        }

        if (buildingName.equals("Buckland Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Buckland = new LatLng(42.253076956053555, -72.5759168010607);
            mMap.addMarker(new MarkerOptions().position(Buckland).title("Buckland Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Buckland, 20.0f), 5000, null);
        }

        if (buildingName.equals("Creighton Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Creighton = new LatLng(42.253265222174186, -72.57445471721955);
            mMap.addMarker(new MarkerOptions().position(Creighton).title("Creighton Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Creighton, 20.0f), 5000, null);
        }

        if (buildingName.equals("Dickinson Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Dickinson = new LatLng(42.2537468484226, -72.57929387222428);
            mMap.addMarker(new MarkerOptions().position(Dickinson).title("Dickinson Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Dickinson, 20.0f), 5000, null);
        }


        if (buildingName.equals("Ham Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Ham = new LatLng(42.25803724186919, -72.57012604605562);
            mMap.addMarker(new MarkerOptions().position(Ham).title("Ham Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Ham, 20.0f), 5000, null);
        }

        if (buildingName.equals("MacGregor Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng MacGregor = new LatLng(42.25764760130791, -72.56958522989585);
            mMap.addMarker(new MarkerOptions().position(MacGregor).title("MacGregor Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MacGregor, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mandelle Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Mandelle = new LatLng(42.25305317976872, -72.57185282282525);
            mMap.addMarker(new MarkerOptions().position(Mandelle).title("Mandelle Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mandelle, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mead Hall ")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Mead = new LatLng(42.2542955475241, -72.5752718857153);
            mMap.addMarker(new MarkerOptions().position(Mead).title("Mead Hall "));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mead, 20.0f), 5000, null);
        }

        if (buildingName.equals("Pearsons Hall (Annex)")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Pearsons = new LatLng(42.2574357464667, -72.57670817549487);
            mMap.addMarker(new MarkerOptions().position(Pearsons).title("Pearsons Hall (Annex)"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Pearsons, 20.0f), 5000, null);
        }

        if (buildingName.equals("Porter Hall ")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Porter = new LatLng(42.25591421617018, -72.5741452307107);
            mMap.addMarker(new MarkerOptions().position(Porter).title("Porter Hall "));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Porter, 20.0f), 5000, null);
        }

        if (buildingName.equals("Prospect Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Prospect = new LatLng(42.255813888711536, -72.5713813018745);
            mMap.addMarker(new MarkerOptions().position(Prospect).title("Prospect Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Prospect, 20.0f), 5000, null);
        }

        if (buildingName.equals("Rockefeller Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Rockefeller = new LatLng(42.313673478566116, -72.54701823100396);
            mMap.addMarker(new MarkerOptions().position(Rockefeller).title("Rockefeller Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Rockefeller, 20.0f), 5000, null);
        }

        if (buildingName.equals("Safford Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Safford = new LatLng(42.2560044428931, -72.5748253172195);
            mMap.addMarker(new MarkerOptions().position(Safford).title("Safford Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Safford, 20.0f), 5000, null);
        }

        if (buildingName.equals("Torrey Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Torrey = new LatLng(42.25860143192495, -72.57228277489206);
            mMap.addMarker(new MarkerOptions().position(Torrey).title("Torrey Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Torrey, 20.0f), 5000, null);
        }

        if (buildingName.equals("Wilder Hall ")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Wilder = new LatLng(42.254817052109225, -72.57480016058676);
            mMap.addMarker(new MarkerOptions().position(Wilder).title("Wilder Hall "));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Wilder, 20.0f), 5000, null);
        }

        //OTHER
        if (buildingName.equals("Abbey Chapel")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Abbey = new LatLng(42.2568405549065, -72.57572705954699);
            mMap.addMarker(new MarkerOptions().position(Abbey).title("Abbey Chapel"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Abbey, 20.0f), 5000, null);
        }

        if (buildingName.equals("Asian Center for Empowerment (ACE)")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Asian = new LatLng(42.260130795491456, -72.57321164524016);
            mMap.addMarker(new MarkerOptions().position(Asian).title("Asian Center for Empowerment (ACE)"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Asian, 20.0f), 5000, null);
        }

        if (buildingName.equals("Auxiliary Services")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Auxiliary = new LatLng(42.255654907060894, -72.57308516413774);
            mMap.addMarker(new MarkerOptions().position(Auxiliary).title("Auxiliary Services"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Auxiliary, 20.0f), 5000, null);
        }

        if (buildingName.equals("Canoe House")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Canoe = new LatLng(42.25898996270685, -72.56837760902098);
            mMap.addMarker(new MarkerOptions().position(Canoe).title("Canoe House"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Canoe, 20.0f), 5000, null);
        }

        if (buildingName.equals("Community Boathouse")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Boathouse = new LatLng(42.264920799595544, -72.59753844605551);
            mMap.addMarker(new MarkerOptions().position(Boathouse).title("Community Boathouse"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Boathouse, 20.0f), 5000, null);
        }

        if (buildingName.equals("Eliot House")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Eliot = new LatLng(42.256708650969244, -72.57328432885679);
            mMap.addMarker(new MarkerOptions().position(Eliot).title("Eliot House"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Eliot, 20.0f), 5000, null);
        }

        if (buildingName.equals("Five College Women’s Studies Research Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Five = new LatLng(42.253037205321796, -72.57808168652944);
            mMap.addMarker(new MarkerOptions().position(Five).title("Five College Women’s Studies Research Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Five, 20.0f), 5000, null);
        }

        if (buildingName.equals("Gettell Amphitheater")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Gettell = new LatLng(42.25643810121045, -72.57325988652931);
            mMap.addMarker(new MarkerOptions().position(Gettell).title("Gettell Amphitheater"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Gettell, 20.0f), 5000, null);
        }

        if (buildingName.equals("Groves Health Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Groves = new LatLng(42.259036590471936, -72.57277067012089);
            mMap.addMarker(new MarkerOptions().position(Groves).title("Groves Health Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Groves, 20.0f), 5000, null);
        }

        if (buildingName.equals("Jeannette Marks Cultural Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Jeannette = new LatLng(42.25415814364884, -72.5790038782913);
            mMap.addMarker(new MarkerOptions().position(Jeannette).title("Jeannette Marks Cultural Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Jeannette, 20.0f), 5000, null);
        }

        if (buildingName.equals("Career Development Center (CDC)")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Career = new LatLng(42.2586095855884, -72.57305652018293);
            mMap.addMarker(new MarkerOptions().position(Career).title("Career Development Center (CDC)"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Career, 20.0f), 5000, null);
        }

        if (buildingName.equals("Skinner Museum")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Skinner = new LatLng(42.262765060122696, -72.57152705954678);
            mMap.addMarker(new MarkerOptions().position(Skinner).title("Skinner Museum"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Skinner, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mary Lyon Hall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Mary = new LatLng(42.25672605093857, -72.57563050002052);
            mMap.addMarker(new MarkerOptions().position(Mary).title("Mary Lyon Hall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mary, 20.0f), 5000, null);
        }

        if (buildingName.equals("Odyssey Bookshop")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Odyssey = new LatLng(42.259246265440375, -72.57602000187428);
            mMap.addMarker(new MarkerOptions().position(Odyssey).title("Odyssey Bookshop"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Odyssey, 20.0f), 5000, null);
        }

        if (buildingName.equals("Orchards Golf Club")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Orchards = new LatLng(42.26557025588311, -72.56769400187414);
            mMap.addMarker(new MarkerOptions().position(Orchards).title("Orchards Golf Club"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Orchards, 20.0f), 5000, null);
        }

        if (buildingName.equals("Ortega and Banteah Cultural Centers")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Ortega = new LatLng(42.259380031701255, -72.57240164699378);
            mMap.addMarker(new MarkerOptions().position(Ortega).title("Ortega and Banteah Cultural Centers"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Ortega, 20.0f), 5000, null);
        }

        if (buildingName.equals("President’s House")) {

            // Add a marker in Community center and zoom in the camera
            LatLng President = new LatLng(42.257447668090805, -72.57752911621206);
            mMap.addMarker(new MarkerOptions().position(President).title("President’s House"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(President, 20.0f), 5000, null);
        }

        if (buildingName.equals("Public Safety")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Public = new LatLng(42.25877296804028, -72.57382077311136);
            mMap.addMarker(new MarkerOptions().position(Public).title("Public Safety"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Public, 20.0f), 5000, null);
        }

        if (buildingName.equals("Shabazz Cultural Center")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Shabazz = new LatLng(42.259530922797275, -72.57279113629721);
            mMap.addMarker(new MarkerOptions().position(Shabazz).title("Shabazz Cultural Center"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Shabazz, 20.0f), 5000, null);
        }


        //POINTS OF INTEREST
        if (buildingName.equals("Field Gate")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Field = new LatLng(42.25642891085523, -72.57615372666906);
            mMap.addMarker(new MarkerOptions().position(Field).title("Field Gate"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Field, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mary Lyon's grave")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Mary = new LatLng(42.25649594232484, -72.57408485081649);
            mMap.addMarker(new MarkerOptions().position(Mary).title("Mary Lyon's grave"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mary, 20.0f), 5000, null);
        }

        if (buildingName.equals("Pageant Green")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Pageant = new LatLng(42.256277317930795, -72.57283877794055);
            mMap.addMarker(new MarkerOptions().position(Pageant).title("Pageant Green"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Pageant, 20.0f), 5000, null);
        }

        if (buildingName.equals("Restoration Ecology Program’s Project Stream")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Restoration = new LatLng(42.25938176159167, -72.56824642702766);
            mMap.addMarker(new MarkerOptions().position(Restoration).title("Restoration Ecology Program’s Project Stream"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Restoration, 20.0f), 5000, null);
        }

        if (buildingName.equals("Skinner Green")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Skinner = new LatLng(42.25513399818443, -72.57537925534079);
            mMap.addMarker(new MarkerOptions().position(Skinner).title("Skinner Green"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Skinner, 20.0f), 5000, null);
        }


        //FUN
        if (buildingName.equals("Amherst College")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Amherst = new LatLng(42.37076763656455, -72.5171530200827);
            mMap.addMarker(new MarkerOptions().position(Amherst).title("Amherst College"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Amherst, 20.0f), 5000, null);
        }

        if (buildingName.equals("Six Flags New England")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Six = new LatLng(42.03806896318656, -72.61349178824887);
            mMap.addMarker(new MarkerOptions().position(Six).title("Six Flags New England"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Six, 20.0f), 5000, null);
        }

        if (buildingName.equals("IYA Sushi and Noodle Kitchen")) {

            // Add a marker in Community center and zoom in the camera
            LatLng IYA = new LatLng(42.25898435369834, -72.57570357711214);
            mMap.addMarker(new MarkerOptions().position(IYA).title("IYA Sushi and Noodle Kitchen"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(IYA, 20.0f), 5000, null);
        }

        if (buildingName.equals("South Hadley's Tower Theaters")) {

            // Add a marker in Community center and zoom in the camera
            LatLng South = new LatLng(42.258702361646094, -72.5760323565362);
            mMap.addMarker(new MarkerOptions().position(South).title("South Hadley's Tower Theaters"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(South, 20.0f), 5000, null);
        }

        if (buildingName.equals("Food 101 Bar & Bistro")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Food = new LatLng(42.25872667967682, -72.57635623327825);
            mMap.addMarker(new MarkerOptions().position(Food).title("Food 101 Bar & Bistro"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Food, 20.0f), 5000, null);
        }

        if (buildingName.equals("Thirsty Mind Coffee and Wine Bar")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Thirsty = new LatLng(42.25842841093108, -72.57627174369276);
            mMap.addMarker(new MarkerOptions().position(Thirsty).title("Thirsty Mind Coffee and Wine Bar"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Thirsty, 20.0f), 5000, null);
        }

        if (buildingName.equals("Johnny's Bar & Grille")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Johnny = new LatLng(42.25837977462994, -72.57627375534956);
            mMap.addMarker(new MarkerOptions().position(Johnny).title("Johnny's Bar & Grille"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Johnny, 20.0f), 5000, null);
        }

        if (buildingName.equals("Holyoke Mall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Holyoke = new LatLng(42.16766061192603, -72.64131175954961);
            mMap.addMarker(new MarkerOptions().position(Holyoke).title("Holyoke Mall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Holyoke, 20.0f), 5000, null);
        }

        if (buildingName.equals("JCPenney")) {

            // Add a marker in Community center and zoom in the camera
            LatLng JCPenney = new LatLng(42.355785834346065, -72.54947047303521);
            mMap.addMarker(new MarkerOptions().position(JCPenney).title("JCPenney"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(JCPenney, 20.0f), 5000, null);
        }

        if (buildingName.equals("Stop and Shop")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Stop = new LatLng(42.366079776771734, -72.53815761536222);
            mMap.addMarker(new MarkerOptions().position(Stop).title("Stop & Shop"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Stop, 20.0f), 5000, null);
        }

        if (buildingName.equals("Hampshire Mall")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Hampshire = new LatLng(42.356428811700084, -72.54763778716521);
            mMap.addMarker(new MarkerOptions().position(Hampshire).title("Hampshire Mall"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hampshire, 20.0f), 5000, null);
        }

        if (buildingName.equals("Mom's House Chinese Market")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Mom = new LatLng(42.37331534069703, -72.50325196307718);
            mMap.addMarker(new MarkerOptions().position(Mom).title("Mom's House Chinese Market"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mom, 20.0f), 5000, null);
        }

        if (buildingName.equals("Insomnia Cookies")) {

            // Add a marker in Community center and zoom in the camera
            LatLng Insomnia = new LatLng(42.37603470173799, -72.51913627303452);
            mMap.addMarker(new MarkerOptions().position(Insomnia).title("Insomnia Cookies"));

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Insomnia, 20.0f), 5000, null);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        noResultsText = findViewById(R.id.no_results_text);
        View mapView = findViewById(R.id.map);
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        //map doesn't show up until a building is searched or pressed
        mapFragment.getView().setVisibility(View.INVISIBLE);

        SearchView searchView = findViewById(R.id.search_bar);
        // Create a SimpleCursorAdapter for the suggestions
        String[] from = {SearchManager.SUGGEST_COLUMN_TEXT_1};
        int[] to = {android.R.id.text1};
        SimpleCursorAdapter adapter1 = new SimpleCursorAdapter(this,
                android.R.layout.simple_dropdown_item_1line, null, from, to, 0);
        searchView.setSuggestionsAdapter(adapter1);
        mapFragment.getView().setVisibility(View.INVISIBLE);
        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hide the map when the search bar is clicked
                mapFragment.getView().setVisibility(View.INVISIBLE);
            }
        });

//        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
//            @Override
//            public boolean onClose() {
//                // Show the list when the search bar is closed
//                listView.setVisibility(View.VISIBLE);
//                return false;
//            }
//        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Perform search or filtering logic here
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<String> suggestions = new ArrayList<>();
                for (String building : buildings) {
                    if (building.toLowerCase().contains(newText.toLowerCase())) {
                        suggestions.add(building);
                    }
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MapsActivity.this, android.R.layout.simple_list_item_1, suggestions);
                listView.setVisibility(View.VISIBLE);
                listView.setAdapter(adapter);
                return true;
            }
        });
// Handle suggestion click events
        searchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            @Override
            public boolean onSuggestionSelect(int position) {

                return false;
            }

            @Override
            public boolean onSuggestionClick(int position) {
                // Retrieve the clicked suggestion from the adapter
                String selectedBuilding = adapter.getItem(position);

                // Perform action when a suggestion is clicked (e.g., zoom to building location)
                zoomToBuildingLocation(selectedBuilding);

                // Clear the search query and close the search view
                searchView.setQuery("", false);
                searchView.setIconified(true);

                return true;
            }
        });
        //set layout manager on xml
        listView=(ListView)findViewById(R.id.myListview);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText.isEmpty()) {
                    listView.setVisibility(View.VISIBLE);
                    mapFragment.getView().setVisibility(View.GONE);
                } else {
                    listView.setVisibility(View.GONE);
                    mapFragment.getView().setVisibility(View.INVISIBLE);
                }
                return true;
            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, buildings);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(((parent, view, position, id) -> {
            mapFragment.getView().setVisibility(View.VISIBLE);
            listView.setVisibility(View.INVISIBLE);
            String buildingName= adapter.getItem(position);
            zoomToBuildingLocation(buildingName);
        }));

        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),buildings[position]+ "was selected.", Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){
                Toast.makeText(getApplicationContext(),"None Selected.", Toast.LENGTH_SHORT).show();

            }

        });
//        searchBar.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // Do nothing
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // Filter the list based on the search text
//                adapter.getFilter().filter(s);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                // Do nothing
//            }
//        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        mapFragment.getMapAsync(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(nav_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> filterList = new ArrayList<>();
                for(String tempbuildings : buildings){
                    //typed on search bar matches object in list //startsWith or contains
                    if(tempbuildings.toLowerCase().contains(newText.toLowerCase())){
                        filterList.add(tempbuildings);
                    }
                }
                ArrayAdapter<String> adapterwithFilteredList = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, filterList);
                listView.setAdapter(adapterwithFilteredList);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        googleMap.setTrafficEnabled(true);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
    }

}