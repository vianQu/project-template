/*
   Deluxe Menu Data File
   Created by Deluxe Tuner v2.4
   http://deluxe-menu.com
*/


// -- Deluxe Tuner Style Names
var itemStylesNames = ["Top Item",];
var menuStylesNames = ["Top Menu",];
// -- End of Deluxe Tuner Style Names

//--- Common
var isHorizontal = 1;
var smColumns = 1;
var smOrientation = 0;
var smViewType = 0;
var dmRTL = 0;
var pressedItem = -2;
var itemCursor = "default";
var itemTarget = "_self";
var statusString = "link";
var blankImage = "images/blank.gif";

//--- Dimensions
var menuWidth = "";
var menuHeight = "";
var smWidth = "";
var smHeight = "";

//--- Positioning
var absolutePos = 0;
var posX = "0";
var posY = "0";
var topDX = 0;
var topDY = 1;
var DX = 1;
var DY = 0;

//--- Font
var fontStyle = "normal 10px Trebuchet MS, Tahoma";
var fontColor = ["#000000","#FFFFFF"];
var fontDecoration = ["none","none"];
var fontColorDisabled = "#84C4E6";

//--- Appearance
var menuBackColor = "#CDE7F3";
var menuBackImage = "";
var menuBackRepeat = "repeat";
var menuBorderColor = "#1B536D";
var menuBorderWidth = 1;
var menuBorderStyle = "solid";

//--- Item Appearance
var itemBackColor = ["#CDE7F3","#4FA9D5"];
var itemBackImage = ["",""];
var itemBorderWidth = 2;
var itemBorderColor = ["#CDE7F3","#CDE7F3"];
var itemBorderStyle = ["solid","groove"];
var itemSpacing = 2;
var itemPadding = "2px 5px 2px 10px";
var itemAlignTop = "left";
var itemAlign = "left";
var subMenuAlign = "";

//--- Icons
var iconTopWidth = 16;
var iconTopHeight = 16;
var iconWidth = 16;
var iconHeight = 16;
var arrowWidth = 7;
var arrowHeight = 7;
var arrowImageMain = ["arrv_black.gif",""];
var arrowImageSub = ["arr_black.gif","arr_white.gif"];

//--- Separators
var separatorImage = "";
var separatorWidth = "100%";
var separatorHeight = "3";
var separatorAlignment = "left";
var separatorVImage = "";
var separatorVWidth = "3";
var separatorVHeight = "100%";
var separatorPadding = "0px";

//--- Floatable Menu
var floatable = 0;
var floatIterations = 6;
var floatableX = 1;
var floatableY = 1;

//--- Movable Menu
var movable = 0;
var moveWidth = 12;
var moveHeight = 20;
var moveColor = "#DECA9A";
var moveImage = "";
var moveCursor = "default";
var smMovable = 0;
var closeBtnW = 15;
var closeBtnH = 15;
var closeBtn = "";

//--- Transitional Effects & Filters
var transparency = "85";
var transition = 32;
var transOptions = "";
var transDuration = 350;
var transDuration2 = 200;
var shadowLen = 3;
var shadowColor = "#B1B1B1";
var shadowTop = 0;

//--- CSS Support (CSS-based Menu)
var cssStyle = 0;
var cssSubmenu = "";
var cssItem = ["",""];
var cssItemText = ["",""];

//--- Advanced
var dmObjectsCheck = 0;
var saveNavigationPath = 1;
var showByClick = 0;
var noWrap = 1;
var pathPrefix_img = "../images/vista2/";
var pathPrefix_link = "";
var smShowPause = 200;
var smHidePause = 1000;
var smSmartScroll = 1;
var topSmartScroll = 0;
var smHideOnClick = 1;
var dm_writeAll = 0;

//--- AJAX-like Technology
var dmAJAX = 0;
var dmAJAXCount = 0;

//--- Dynamic Menu
var dynamic = 0;

//--- Keystrokes Support
var keystrokes = 1;
var dm_focus = 1;
var dm_actKey = 113;

var itemStyles = [
    ["itemWidth=92px","itemHeight=21px","itemBackColor=transparent,transparent","itemBorderWidth=0","fontStyle=bold 9px Tahoma","fontColor=#13141C,#000000","itemBackImage=btn5_blue.gif,btn5_white.gif"],
];
var menuStyles = [
    ["menuBackColor=transparent","menuBorderWidth=0","itemSpacing=1","itemPadding=0px 5px 0px 5px"],
];


var menuItems = [

    ["Keuangan","", , , , , "0", "0", , ],
    ["|Akuntansi","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Jenis Biaya","/simpat-pelindo4/anggaranakuntansi/jenisbiaya/jenisBiaya_input.action", , , , , , , , ],
    ["|||Mata Uang","/simpat-pelindo4/anggaranakuntansi/matauang/mataUang_input.action", , , , , , , , ],
    ["|||Kurs","/simpat-pelindo4/anggaranakuntansi/kurs/kurs_input.action", , , , , , , , ],
    ["|||Master","/simpat-pelindo4/anggaranakuntansi/master/master_input.action", , , , , , , , ],
    ["|||Sumber Dana","/simpat-pelindo4/anggaranakuntansi/sumberdana/sumberDana_input.action", , , , , , , , ],
    ["|||Tipe Jurnal","/simpat-pelindo4/anggaranakuntansi/tipejurnal/tipeJurnal_input.action", , , , , , , , ],
    ["|||Kode Rekening","/simpat-pelindo4/anggaranakuntansi/koderekening/kodeRekening_input.action", , , , , , , , ],
    ["|||Pembagian Biaya","/simpat-pelindo4/anggaranakuntansi/pembagianbiaya/pembagianBiaya_input.action", , , , , , , , ],
    ["|||Pembagian Laba Rugi","/simpat-pelindo4/anggaranakuntansi/pembagianlabarugi/pembagianLabaRugi_input.action", , , , , , , , ],
    ["|||Set Laba Rugi","/simpat-pelindo4/anggaranakuntansi/setrugilaba/setRugiLaba.action", , , , , , , , ],
    ["|||Set Parameter Neraca","/simpat-pelindo4/anggaranakuntansi/setparameterneraca/setParameterNeraca.action", , , , , , , , ],
    ["|||Set Parameter2","/simpat-pelindo4/anggaranakuntansi/setparameter2/setParameter2.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Jurnal","/simpat-pelindo4/anggaranakuntansi/jurnal/jurnal_input.action", , , , , , , , ],
    ["|||Tutup Jurnal","/simpat-pelindo4/anggaranakuntansi/tutupjurnal/tutupJurnal_input.action", , , , , , , , ],
    ["||Registrasi Kas","", , , , , , , , ],
    ["|||Registrasi SPUM","/simpat-pelindo4/anggaranakuntansi/registrasikas/spum_input.action", , , , , , , , ],
    ["|||Registrasi Jurnal","/simpat-pelindo4/anggaranakuntansi/registrasikas/transaksiJurnal_input.action", , , , , , , , ],
    ["|||Penerimaan Kas-Bank (JKM)","/simpat-pelindo4/anggaranakuntansi/registrasikas/jurnalKasMasuk_input.action", , , , , , , , ],
    ["|||Pengeluaran Kas-Bank (JKK)","/simpat-pelindo4/anggaranakuntansi/registrasikas/jurnalKasKeluar_input.action", , , , , , , , ],
    ["|||Pembukuan Rupa-Rupa (JRR)","/simpat-pelindo4/anggaranakuntansi/registrasikas/jurnalRupaRupa_input.action", , , , , , , , ],
    ["|||Cetak SPP","/simpat-pelindo4/anggaranakuntansi/pengantarpenagihan/suratPengantarPenagihan_input.action", , , , , , , , ],
    ["|||Jurnal yang Belum Teregistrasi","/simpat-pelindo4/anggaranakuntansi/registrasikas/jurnalRegistration_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|||Harian","", , , , , , , , ],
    ["||||Mutasi Harian Kas Bank","/simpat-pelindo4/anggaranakuntansi/mutasihariankasbank/mutasiHarianKasBank_input.action", , , , , , , , ],
    ["|||Bulanan","", , , , , , , , ],
    ["||||Kartu Buku Besar per Buku Bantu","/simpat-pelindo4/anggaranakuntansi/kartubukubesarperbukubantu/kartuBukuBesarPerBukuBantu_.action", , , , , , , , ],
    ["||||Neraca Saldo","/simpat-pelindo4/anggaranakuntansi/neraca/neracaSaldo_input.action", , , , , , , , ],
    ["||||Neraca Mutasi","/simpat-pelindo4/anggaranakuntansi/neraca/neracaMutasi_input.action", , , , , , , , ],
    ["||||Faktur Pajak","/simpat-pelindo4/anggaranakuntansi/fakturpajak/fakturPajak_input.action", , , , , , , , ],
    ["||||Perhitungan Laba-Rugi Per Jenis Biaya","/simpat-pelindo4/anggaranakuntansi/perhitlabrugijnsbiaya/perhitLabRugi_input.action", , , , , , , , ],
    ["||||Perhitungan Laba-Rugi Per Pusat Pelayanan","/simpat-pelindo4/anggaranakuntansi/perhitlabrugipusatpelayanan/perhitLabRugiPelayanan_input.action", , , , , , , , ],
    ["||||Aging","", , , , , , , , ],
    ["|||||Aging Piutang Usaha","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=piutang_usaha", , , , , , , , ],
    ["|||||Aging Uang Panjar / UPER","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=uper", , , , , , , , ],
    ["|||||Aging Sisa UPER","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=utip", , , , , , , , ],
    ["|||||Aging Piutang Pegawai","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=piutang_pegawai", , , , , , , , ],
    ["|||||Aging Uang Muka","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=uang_muka", , , , , , , , ],
    ["|||||Aging Hutang Usaha","/simpat-pelindo4/anggaranakuntansi/aging/aging_input.action?reportName=hutang_usaha", , , , , , , , ],
    ["||||Mutasi","", , , , , , , , ],
    ["|||||Mutasi Penerimaan Kas Bank","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=1", , , , , , , , ],
    ["|||||Mutasi Pengeluaran Kas Bank","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=2", , , , , , , , ],
    ["|||||Mutasi Jurnal Rupa Rupa","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=6", , , , , , , , ],
    ["|||||Mutasi Jurnal Konversi Kurs","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=7", , , , , , , , ],
    ["|||||Mutasi Jurnal Pembelian/Pemborongan","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=3", , , , , , , , ],
    ["|||||Mutasi Jurnal Persediaan Barang","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=4", , , , , , , , ],
    ["|||||Mutasi Jurnal Antar Buku Bantu","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=5", , , , , , , , ],
    ["|||||Mutasi Jurnal Pelayanan Kapal","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=A", , , , , , , , ],
    ["|||||Mutasi Jurnal Penumpukan Barang","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=B", , , , , , , , ],
    ["|||||Mutasi Jurnal Pelayanan Alat","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=C", , , , , , , , ],
    ["|||||Mutasi Jurnal Pelayanan User B/M","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=D", , , , , , , , ],
    ["|||||Mutasi Pengeluaran Fasilitas TBAL","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=E", , , , , , , , ],
    ["|||||Mutasi Jurnal Pelayanan T.Peti Kemas","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=F", , , , , , , , ],
    ["|||||Mutasi Jurnal Fasilitas Rupa-Rupa Usaha","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=G", , , , , , , , ],
    ["|||||Mutasi Jurnal Kawasan Paotre","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=H", , , , , , , , ],
    ["|||||Mutasi Jurnal Kas Masuk User(DUT)","/simpat-pelindo4/anggaranakuntansi/mutasijurnal/mutasiJurnal_input.action?jurnalType=X", , , , , , , , ],
    ["||||Ikhtisar","", , , , , , , , ],
    ["|||||Ikhtisar Buku Besar per Buku Bantu","/simpat-pelindo4/anggaranakuntansi/ikhtisarbukubesar/ikhtisarBesarPerBantu_input.action", , , , , , , , ],
    ["|||||Ikhtisar Uang Muka","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=uang_muka", , , , , , , , ],
    ["|||||Ikhtisar PPN Masukan","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=ppn_masukan", , , , , , , , ],
    ["|||||Ikhtisar Piutang Pegawai","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=piutang_pegawai", , , , , , , , ],
    ["|||||Ikhtisar Piutang Pegawai Jangka Panjang","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=piutang_pegawai_jangka_panjang", , , , , , , , ],
    ["|||||Ikhtisar Piutang Usaha","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=piutang_usaha", , , , , , , , ],
    ["|||||Ikhtisar Hutang Usaha","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=hutang_usaha", , , , , , , , ],
    ["|||||Ikhtisar Hutang Reduksi Pendapatan","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=hutang_reduksi_pendapatan", , , , , , , , ],
    ["|||||Ikhtisar Uang Panjar(Uper)","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=uper", , , , , , , , ],
    ["|||||Ikhtisar Uang Titipan(Utip)","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=utip", , , , , , , , ],
    ["|||||Ikhtisar Hutang Pajak Lainnya","/simpat-pelindo4/anggaranakuntansi/ikhtisar/ikhtisar_input.action?reportName=hutang_pajak_lainnya", , , , , , , , ],
    ["|||||Ikhtisar Pendapatan","/simpat-pelindo4/anggaranakuntansi/ikhtisarpendapatan/ikhtisarPendapatan_input.action", , , , , , , , ],
    ["|||||Ikhtisar Penerimaan Kas Bank","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=1", , , , , , , , ],
    ["|||||Ikhtisar Pengeluaran Kas Bank","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=2", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Rupa Rupa","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=6", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Konversi Kurs","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=7", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Pembelian/Pemborongan","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=3", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Persediaan Barang","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=4", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Antar Buku Bantu","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=5", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Pelayanan Kapal","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=A", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Penumpukan Barang","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=B", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Pelayanan Alat","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=C", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Pelayanan User B/M","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=D", , , , , , , , ],
    ["|||||Ikhtisar Pengeluaran Fasilitas TBAL","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=E", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Pelayanan T.Peti Kemas","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=F", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Fasilitas Rupa-Rupa Usaha","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=G", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Kawasan Paotre","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=H", , , , , , , , ],
    ["|||||Ikhtisar Jurnal Kas Masuk User(DUT)","/simpat-pelindo4/anggaranakuntansi/ikhtisarjurnal/ikhtisarJurnal_input.action?jurnalType=X", , , , , , , , ],
    ["|||||Ikhtisar Biaya / Jenis Biaya","/simpat-pelindo4/anggaranakuntansi/ikhtisarbiayajnsbiaya/ikhtisarBiayaJns_input.action", , , , , , , , ],
    ["|||||Ikhtisar Biaya / Pusat Pelayanan","/simpat-pelindo4/anggaranakuntansi/ikhtisarbiaya/ikhtisarBiaya_input.action", , , , , , , , ],
    ["|Aktiva Tetap","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Aktiva Tetap","/simpat-pelindo4/aktivatetap/aktivatetap/aktivaTetap_input.action", , , , , , , , ],
    ["|||Jenis Aktiva Tetap","/simpat-pelindo4/aktivatetap/jenisaktivatetap/dataSearch_input.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Penambahan Nilai Aktiva Tetap","/simpat-pelindo4/aktivatetap/penambahannilaiaktivatetap/penambahanNilaiAktivaTetapSearch_input.action", , , , , , , , ],
    ["|||Penjualan Aktiva Tetap","/simpat-pelindo4/aktivatetap/penjualanaktivatetap/penjualanAktivaTetapSearch_input.action", , , , , , , , ],
    ["|Akuntansi Biaya","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Master Akutansi Biaya Kode Rekening","/simpat-pelindo4/akuntansibiaya/master/akbikoderek/akbiKoderek_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|||General Report","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusi_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Kapal","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiKapal_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Barang","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiBarang_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Alat","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiAlat_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Aneka Usaha","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiAnekaUsaha_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Peti Kemas","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiPetikemas_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Dermaga Khusus / Pelabuhan Khusus","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiDersusPelsus_input.action", , , , , , , , ],
    ["|||Laporan Kontribusi Kerjasama","/simpat-pelindo4/akuntansibiaya/report/laporanKontribusiKerjasama_input.action", , , , , , , , ],
    ["Operasional","", , , , , "0", , , ],
    ["|Kapal","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Cara Pengisian Air","/simpat-pelindo4/pelayanankapal/pengisianair/caraPengisianAir_input.action", , , , , , , , ],
    ["|||Agen Pelayaran","/simpat-pelindo4/pelayanankapal/agenpelayaran/agenpelayaran_input.action", , , , , , , , ],
    ["|||Kapal","/simpat-pelindo4/pelayanankapal/kapal/MstKapal_input.action", , , , , , , , ],
    ["|||Gerakan Kapal","/simpat-pelindo4/pelayanankapal/master/gerakankapal/gerakanKapal_input.action", , , , , , , , ],
    ["|||Kapal Kepil","/simpat-pelindo4/KapalKepil/initsearchKepil.action", , , , , , , , ],
    ["|||Kapal Pandu","/simpat-pelindo4/KapalPandu/initsearchPandu.action", , , , , , , , ],
    ["|||Kapal Tunda","/simpat-pelindo4/KapalTunda/initsearchTunda.action", , , , , , , , ],
    ["|||Pelabuhan","/simpat-pelindo4/pelayanankapal/pelabuhan/pelabuhan_input.action", , , , , , , , ],
    ["|||Pandu","/simpat-pelindo4/MasterTable/initsearchPandu.action", , , , , , , , ],
    ["|||Tarif Labuh","/simpat-pelindo4/mastertariflabuh/MasterTarifLabuh/initsearchTLabuh.action", , , , , , , , ],
    ["|||Tarif Tambat","/simpat-pelindo4/pelayanankapal/tariftambat/tariftambat_input.action", , , , , , , , ],
    ["|||Tarif Pandu","/simpat-pelindo4/PelayananKPL/initJasaPandu.action", , , , , , , , ],
    ["|||Tarif Tunda","/simpat-pelindo4/PelayananKPL/initJasaTunda.action", , , , , , , , ],
    ["|||Tarif Tunda Kawal","/simpat-pelindo4/PelayananKPL/initKawal.action", , , , , , , , ],
    ["|||Tarif Pengisian Air","/simpat-pelindo4/pelayanankapal/tarifpengisianair/tarifPengisianAir_input.action", , , , , , , , ],
    ["|||Masa Tambat","/simpat-pelindo4/pelayanankapal/masatambat/masaTambat_input.action", , , , , , , , ],
    ["|||Tabel Universal","/simpat-pelindo4/pelayanankapal/TabelUniversal/tabelUniversal_input.action", , , , , , , , ],
    ["|||Tabel Referensi Kapal","testlink.html", , , , , , , , ],
    ["|||Tabel Universal","/simpat-pelindo4/pelayanankapal/TabelReferensiKapal/tabelReferensi_input.action", , , , , , , , ],
    ["|||Parameter Kapal","/simpat-pelindo4/pelayanankapal/master/parameterkapal/parameterKapal_input.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Permohonan 1A","/simpat-pelindo4/pelayanankapal/permohonan1a/transPermohonan1A_input.action", , , , , , , , ],
    ["|||Permohonan 1A1(Pandu-Tunda)","/simpat-pelindo4/pelayanankapal/transaksi/permintaan1a1/permintaan1a1Main_input.action", , , , , , , , ],
    ["|||Permohonan 1A2(Labuh-Tambat)","/simpat-pelindo4/pelayanankapal/permohonan1a2/transPermohonan1A2_input.action", , , , , , , , ],
    ["|||Permohonan 1A3(Air)","/simpat-pelindo4/pelayanankapal/bentuk1a3/bentuk1A3_input.action", , , , , , , , ],
    ["|||Bukti 2A1(Pandu-Tunda)","/simpat-pelindo4/pelayanankapal/transaksi/bentuk2a1/Bentuk2A1Main_input.action", , , , , , , , ],
    ["|||Bukti 2A2(Labuh-Tambat)","/simpat-pelindo4/pelayanankapal/bentuk2a2/bentuk2A2_input.action", , , , , , , , ],
    ["|||Bukti 2A3(Air)","/simpat-pelindo4/pelayanankapal/bentuk2a3/bentuk2A3_input.action", , , , , , , , ],
    ["|||Nota 3A1(Pandu-Tunda)","/simpat-pelindo4/pelayanankapal/nota/nota3a1/nota3A1Main_input.action", , , , , , , , ],
    ["|||Nota 3A2(Labuh-Tambat)","/simpat-pelindo4/pelayanankapal/nota3a2/nota3A2_input.action", , , , , , , , ],
    ["|||Nota 3A3(Air)","/simpat-pelindo4/pelayanankapal/nota/3A3/nota3A3_input.action", , , , , , , , ],
    ["|||Nota 4A","/simpat-pelindo4/pelayanankapal/nota/nota4a/nota4AMain_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|Barang","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Parameter Barang","/simpat-pelindo4/penumpukanbarang/parameterbarang/parameterBarang_input.action", , , , , , , , ],
    ["|||Barang","/simpat-pelindo4/penumpukanbarang/barang/barang_input.action", , , , , , , , ],
    ["|||Jenis Barang","/simpat-pelindo4/penumpukanbarang/jenisbarang/jenisBarang_input.action", , , , , , , , ],
    ["|||Tuslag","/simpat-pelindo4/penumpukanbarang/tuslag/tuslag_input.action", , , , , , , , ],
    ["|||Dermaga","/simpat-pelindo4/penumpukanbarang/dermaga/dermaga_input.action", , , , , , , , ],
    ["|||Dermaga KSO","/simpat-pelindo4/penumpukanbarang/dermagakso/dermagaKso_input.action", , , , , , , , ],
    ["|||Tarif Dermaga","/simpat-pelindo4/penumpukanbarang/tarifdermaga/tarifdermaga_input.action", , , , , , , , ],
    ["|||Lokasi Penumpukan","/simpat-pelindo4/penumpukanbarang/lokasipenumpukan/lokasipenumpukan_input.action", , , , , , , , ],
    ["|||Masa Penumpukan","/simpat-pelindo4/penumpukanbarang/masapenumpukan/masaPenumpukan_input.action", , , , , , , , ],
    ["|||Tarif Penumpukan","/simpat-pelindo4/penumpukanbarang/tarifpenumpukan/tarifPenumpukan_input.action", , , , , , , , ],
    ["|||Tipe Pas","/simpat-pelindo4/penumpukanbarang/tipepas/tipePas_input.action", , , , , , , , ],
    ["|||Jenis Pas","/simpat-pelindo4/penumpukanbarang/jenispas/jenispas_input.action", , , , , , , , ],
    ["|||Jenis Komoditi","/simpat-pelindo4/penumpukanbarang/jeniskomoditi/jenisKomoditi_input.action", , , , , , , , ],
    ["|||Jenis Kemasan","/simpat-pelindo4/penumpukanbarang/jeniskemasan/jenisKemasan_input.action", , , , , , , , ],
    ["|||Tabel Referensi Barang","/simpat-pelindo4/referensibarang/referensiBarang_input.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Permohonan 1B","/simpat-pelindo4/penumpukanbarang/transaksi/permohonan1b/permohonan1b_input.action", , , , , , , , ],
    ["|||Bukti 2B1","/simpat-pelindo4/penumpukanbarang/transaksi/penumpukan2b1/penumpukan2b1_input.action", , , , , , , , ],
    ["|||Bukti 2B2","/simpat-pelindo4/penumpukanbarang/transaksi/bukti2b2/bukti2b2_input.action", , , , , , , , ],
    ["|||Pembatalan Keluar Barang","/simpat-pelindo4/penumpukanbarang/transaksi/pembatalanpengeluaranbarang/pembatalanPengeluaranBarang_input.action", , , , , , , , ],
    ["|||Keluar Barang Susulan","/simpat-pelindo4/penumpukanbarang/transaksi/pengeluaranbarangsusulan/pengeluaranBarangSusulan_input.action", , , , , , , , ],
    ["|||Nota 3B","/simpat-pelindo4/penumpukanbarang/transaksi/nota3b/nota3b_input.action", , , , , , , , ],
    ["|||Nota 3B Susulan","/simpat-pelindo4/penumpukanbarang/transaksi/nota3bsusulan/nota3bSusulan_reset.action", , , , , , , , ],
    ["|||Nota 4B","/simpat-pelindo4/penumpukanbarang/transaksi/nota4b/nota4b_input.action", , , , , , , , ],
    ["|||Nota 4B Susulan","/simpat-pelindo4/penumpukanbarang/transaksi/nota4bsusulan/nota4bSusulan_reset.action", , , , , , , , ],
    ["|||Pembatalan Transaksi","/simpat-pelindo4/penumpukanbarang/transaksi/pembatalantransaksibarang/pembatalanTransaksiBarang_input.action", , , , , , , , ],
    ["|||Monitoring Barang","", , , , , , , , ],
    ["||||Monitoring Barang","/simpat-pelindo4/penumpukanbarang/monitoring/monitoringbarang/monitoringBarang_input.action", , , , , , , , ],
    ["||||Monitoring Barang Susulan","/simpat-pelindo4/penumpukanbarang/monitoring/monitoringbarangsusul/monitoringBarangSusul_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|||Listing 1B","/simpat-pelindo4/penumpukanbarang/listing1b/report1b_input.action", , , , , , , , ],
    ["|||Aktivitas Barang","/simpat-pelindo4/penumpukanbarang/aktivitasbarang/aktivitasBarang_input.action", , , , , , , , ],
    ["|||Daftar Penumpukan","/simpat-pelindo4/penumpukanbarang/daftarpenumpukan/daftarPenumpukan_input.action", , , , , , , , ],
    ["|||Produksi Dermaga","/simpat-pelindo4/penumpukanbarang/laprodermaga/laproDermaga_input.action", , , , , , , , ],
    ["|||Produksi Penumpukan","/simpat-pelindo4/penumpukanbarang/laprodpenumpukan/laProdPenumpukan_input.action", , , , , , , , ],
    ["|||Rekap Jurnal Penjualan","/simpat-pelindo4/penumpukanbarang/rkpjurnalpenjualan/rkpJurnalPenjualan_input.action", , , , , , , , ],
    ["|||Rekap Uang Dermaga & Penumpang","/simpat-pelindo4/penumpukanbarang/rkpuangdermagapenp/rkpUangDermagaPenp_input.action", , , , , , , , ],
    ["|||Daftar Pranota Barang","/simpat-pelindo4/penumpukanbarang/daftarpranotabarang/daftarPranotaBarang_input.action", , , , , , , , ],
    ["|Alat","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Alat","/simpat-pelindo4/penyewaanalat/alat/alat_input.action", , , , , , , , ],
    ["|||Lokasi Alat","/simpat-pelindo4/penyewaanalat/lokasialat/lokasiAlat_input.action", , , , , , , , ],
    ["|||Jenis Group Alat","/simpat-pelindo4/penyewaanalat/jenisgroupalat/jenisGroupAlat_input.action", , , , , , , , ],
    ["|||Pelanggan","/simpat-pelindo4/penyewaanalat/pelanggan/pelanggan_input.action", , , , , , , , ],
    ["|||Jam Istirahat","/simpat-pelindo4/penyewaanalat/jamistirahat/jamIstirahat_viewTable.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Permohonan 1C","/simpat-pelindo4/penyewaanalat/permohonan1c/permohonan1c_input.action", , , , , , , , ],
    ["|||Penetapan 1C","/simpat-pelindo4/penyewaanalat/penetapan1c/penetapan1c_input.action", , , , , , , , ],
    ["|||Bukti 2C","/simpat-pelindo4/penyewaanalat/bukti2c/bukti2c_input.action", , , , , , , , ],
    ["|||Nota 3C","/simpat-pelindo4/penyewaanalat/nota3c/nota3c_input.action", , , , , , , , ],
    ["|||Nota 4C","/simpat-pelindo4/penyewaanalat/nota4c/nota4c_input.action", , , , , , , , ],
    ["|||Ketidaksiapan Alat","/simpat-pelindo4/penyewaanalat/ketidaksiapanalat/ketidaksiapanAlat_input.action", , , , , , , , ],
    ["|||Hambatan Alat","/simpat-pelindo4/penyewaanalat/hambatanalat/hambatanAlat_input.action", , , , , , , , ],
    ["|||Tambah Waktu Alat","/simpat-pelindo4/penyewaanalat/tambahwaktualat/tambahWaktuAlat_input.action", , , , , , , , ],
    ["|||Pembatalan Transaksi","/simpat-pelindo4/penyewaanalat/pembatalantransaksialat/pembatalanTransaksiAlat_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|||Listing Permohonan 1C","/simpat-pelindo4/penyewaanalat/listing1c/report1C_input.action", , , , , , , , ],
    ["|||Listing Penetapan 1C","/simpat-pelindo4/penyewaanalat/listingPenetapan1c/reportPenetapan1C_input.action", , , , , , , , ],
    ["|||Listing Bukti 2C","/simpat-pelindo4/penyewaanalat/listing2c/report2C_input.action", , , , , , , , ],
    ["|||Daftar Pranota Alat","/simpat-pelindo4/penyewaanalat/report/daftarpranotaalat/daftarPranotaAlat_input.action", , , , , , , , ],
    ["|Peti Kemas","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Jasa PetiKemas","/simpat-pelindo4/petikemas/master/mjasapetikemas/MJasaPetiKemasSearch_input.action", , , , , , , , ],
    ["|||Paket PetiKemas","/simpat-pelindo4/petikemas/master/mpaketpetikemas/MPaketPetiKemasSearch_input.action", , , , , , , , ],
    ["|||PetiKemas","/simpat-pelindo4/petikemas/master/mpetikemas/MPetiKemasSearch_input.action", , , , , , , , ],
    ["|||Parameter PetiKemas","/simpat-pelindo4/petikemas/master/parameterpetikemas/parameterPetiKemas_input.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Peti Kemas Usaha","/simpat-pelindo4/petikemas/konvensional/petiKemasSearch_input.action", , , , , , , , ],
    ["|||Perhitungan Peti Kemas Usaha","/simpat-pelindo4/petikemas/konvensional/petiKemasEnquiry_input.action", , , , , , , , ],
    ["||Report","", , , , , , , , ],
    ["|||Cetak Pranota/Nota","/simpat-pelindo4/petikemas/nota/nota3/notaPetiKemas_input.action", , , , , , , , ],
    ["|||Cetak Ulang Pranota/Nota","/simpat-pelindo4/petikemas/nota/nota3/notaCetakUlangPetiKemas_input.action", , , , , , , , ],
    ["|||Rekapitulasi Produksi & Pendapatan","/simpat-pelindo4/petikemas/konvensional/petiKemasEnquiry_input.action", , , , , , , , ],
    ["|Aneka Usaha","", , , , , , , , ],
    ["||Master","", , , , , , , , ],
    ["|||Parameter Aneka Usaha","/simpat-pelindo4/anekausaha/master/parameteranekausaha/parameterAnekaUsaha_input.action", , , , , , , , ],
    ["|||Parameter Pas","/simpat-pelindo4/anekausaha/master/parameterpas/parameterPas_input.action", , , , , , , , ],
    ["|||Parameter Pas Pelabuhan","/simpat-pelindo4/anekausaha/master/parameterpaspelabuhan/parameterPasPelabuhan_input.action", , , , , , , , ],
    ["|||Referensi Aneka Usaha","/simpat-pelindo4/anekausaha/master/referensiau/referensiAu_input.action", , , , , , , , ],
    ["|||Usaha Lain","/simpat-pelindo4/anekausaha/master/masterusahalain/masterUsahaLain_input.action", , , , , , , , ],
    ["|||Master Bola Lampu","/simpat-pelindo4/anekausaha/master/masterbolalampu/masterBolaLampu_input.action", , , , , , , , ],
    ["|||Master Jenis BM Kendaraan","/simpat-pelindo4/anekausaha/master/masterjenisbmkendaraan/masterJenisBmKendaraan_input.action", , , , , , , , ],
    ["|||Master Meteran Listrik","/simpat-pelindo4/anekausaha/master/mastermeteranlistrik/masterMeteranListrik_input.action", , , , , , , , ],
    ["|||Master Jasa PBM","/simpat-pelindo4/anekausaha/master/masterjasapbm/masterJasaPbm_input.action", , , , , , , , ],
    ["||Transaksi","", , , , , , , , ],
    ["|||Penyewaan Lahan","/simpat-pelindo4/anekausaha/transaksi/sewalahan/sewaLahan_input.action", , , , , , , , ],
    ["|||Nota 4E Penyewaan Lahan","/simpat-pelindo4/anekausaha/transaksi/nota4eautb/nota4eAuTb_input.action", , , , , , , , ],
    ["|||Permohonan Air","/simpat-pelindo4/anekausaha/transaksi/permohonanair/permohonanAir_input.action", , , , , , , , ],
    ["|||Nota 4E Permohonan Air","/simpat-pelindo4/anekausaha/transaksi/nota4eauair/nota4eAuAir_input.action", , , , , , , , ],
    ["|||Penyewaan Listrik","/simpat-pelindo4/anekausaha/transaksi/sewalistrik/sewaListrik_input.action", , , , , , , , ],
    ["|||Nota 4E Penyewaan Listrik","/simpat-pelindo4/anekausaha/transaksi/nota4eaulistrik/nota4eAuListrik_input.action", , , , , , , , ],
    ["|||Uang Pas","/simpat-pelindo4/anekausaha/transaksi/uangpas/uangPas_input.action", , , , , , , , ],
    ["|||Usaha Lain","/simpat-pelindo4/anekausaha/transaksi/usahalain/usahaLain_input.action", , , , , , , , ],
    ["|||Nota 4G Usaha Lain","/simpat-pelindo4/anekausaha/transaksi/nota4eaulain/nota4eAuLain_input.action", , , , , , , , ],
    ["|||Pas Pelabuhan","/simpat-pelindo4/anekausaha/transaksi/tiketpas/addTiketPas_input.action", , , , , , , , ],
    ["|||Kegiatan BM Kendaraan","/simpat-pelindo4/anekausaha/transaksi/bmkendaraan/bmKendaraan_input.action", , , , , , , , ],
    ["|||Pranota Kegiatan BM","/simpat-pelindo4/anekausaha/transaksi/pranotabmkendaraan/pranotaBmKendaraan_input.action", , , , , , , , ],
    ["|||Nota 4G Kegiatan BM","/simpat-pelindo4/anekausaha/transaksi/nota4eaubmkendaraan/nota4eAuBmKendaraan_input.action", , , , , , , , ],
    ["|||Meteran Listrik","/simpat-pelindo4/anekausaha/transaksi/meteranlistrik/meteranListrik_input.action", , , , , , , , ],
    ["|||Nota 4E Penyewaan Meteran Listrik","/simpat-pelindo4/anekausaha/transaksi/nota4eaumeteranlistrik/nota4eAuMeteranListrik_input.action", , , , , , , , ],
    ["|||Jasa PBM","/simpat-pelindo4/anekausaha/transaksi/jasapbm/jasaPbm_input.action", , , , , , , , ],
    ["|||Pranota Jasa PBM","/simpat-pelindo4/anekausaha/transaksi/pranotajasapbm/pranotaJasaPbm_input.action", , , , , , , , ],
    ["|||Nota 4G Jasa PBM","/simpat-pelindo4/anekausaha/transaksi/nota4gaujasapbm/nota4gAuJasaPbm_input.action", , , , , , , , ],
    ["|||Pembatalan Nota","/simpat-pelindo4/anekausaha/transaksi/pembatalannotaau/pembatalanNotaAu_input.action", , , , , , , , ],
    ["||Laporan","", , , , , , , , ],
    ["|||Laporan Aneka Usaha per Transaksi","/simpat-pelindo4/anekausaha/laporan/LaporanAnekaUsaha_input.action", , , , , , , , ],
    ["|||Laporan Aneka Usaha per Agen","/simpat-pelindo4/anekausaha/laporan/LaporanAnekaUsahaAgen_input.action", , , , , , , , ],
    ["|SIMOPPEL","/simpat-pelindo4/simoppel/report/laporanSimoppel_input.action", , , , , , , , ],
    ["User","", , , , , "0", , , ],
    ["|Ubah Password","", , , , , , , , ],
    ["|Detail","", , , , , , , , ],
    ["|Detail","", , , , , , , , ],
    ["Sign Out", , , , , , "0", , , ],

];

//dm_init();
//dm_initFrame("frmSet", 0, 1, 0);