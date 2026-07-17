/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fcb implements oob {
    private asb field_d;
    private bmb field_c;
    private asb field_e;
    private asb field_i;
    private asb field_j;
    private asb field_l;
    private asb field_f;
    private asb field_h;
    private asb field_b;
    private asb field_m;
    private asb field_k;
    private asb field_a;
    static String field_g;

    final void b(byte param0) {
        asb var3 = null;
        asb var4 = null;
        L0: {
          fka.a("Very start of requestdata", (byte) -56);
          if (esb.field_j == null) {
            break L0;
          } else {
            aib.a((byte) -100, esb.field_j);
            esb.field_j = null;
            fkb.a(param0 + 2095);
            break L0;
          }
        }
        L1: {
          sl.field_b = true;
          fka.a("common wordpackj", (byte) -102);
          ((fcb) this).field_f = bea.a((int) param0, gn.field_k.field_a);
          fka.a("graphicsj", (byte) -103);
          ((fcb) this).field_i = bea.a((int) param0, 16);
          fka.a("fontmetricsj", (byte) -66);
          ((fcb) this).field_e = bea.a(1, 17);
          fka.a("jagfxj", (byte) -93);
          ((fcb) this).field_l = bea.a((int) param0, 18);
          fka.a("vorbisj", (byte) -64);
          ((fcb) this).field_k = bea.a(1, 19);
          fka.a("patchesj", (byte) -106);
          ((fcb) this).field_j = bea.a((int) param0, 20);
          fka.a("midij", (byte) -100);
          ((fcb) this).field_h = bea.a(1, 21);
          fka.a("common quickchatj", (byte) -64);
          ((fcb) this).field_b = bea.a(1, eva.field_o.field_a);
          fka.a("texturemetricsj", (byte) -108);
          ((fcb) this).field_m = bea.a((int) param0, 24);
          fka.a("texturesj", (byte) -91);
          ((fcb) this).field_a = bea.a(1, 25);
          fka.a("jpegj", (byte) -52);
          ((fcb) this).field_d = bea.a((int) param0, 26);
          var4 = kwa.field_o;
          var3 = jta.field_r;
          fka.a("creating request queue", (byte) -84);
          rab.field_m = new wsb(82);
          fka.a("requesting basic common graphics group", (byte) -68);
          rab.field_m.a(var4, drb.field_k, false, "basic", wea.field_o);
          fka.a("requesting common arialish12", (byte) -66);
          rab.field_m.a(var4, am.field_p, false, "arialish12", wqb.field_b);
          fka.a("requesting common arialish12 fontmetric", (byte) -59);
          rab.field_m.a(var3, am.field_p, false, "arialish12", wqb.field_b);
          fka.a("requesting common lobbyfont", (byte) -79);
          rab.field_m.a(var4, am.field_p, false, "lobby", wqb.field_b);
          fka.a("requesting common lobbyfont metric", (byte) -72);
          rab.field_m.a(var3, am.field_p, false, "lobby", wqb.field_b);
          fka.a("requesting jfx sounds", (byte) -66);
          rab.field_m.a(wnb.field_r, -1, ou.field_p, ((fcb) this).field_l);
          fka.a("requesting vorbis sounds", (byte) -53);
          rab.field_m.a(wnb.field_r, -1, ou.field_p, ((fcb) this).field_k);
          fka.a("requesting patches", (byte) -112);
          rab.field_m.a(ttb.field_z, param0 ^ -2, jca.field_p, ((fcb) this).field_j);
          fka.a("requesting midis", (byte) -113);
          rab.field_m.a(jmb.field_o, -1, vfb.field_a, ((fcb) this).field_h);
          fka.a("requesting basic graphics", (byte) -108);
          if (param0 == 1) {
            break L1;
          } else {
            ((fcb) this).field_a = null;
            break L1;
          }
        }
        rab.field_m.a(((fcb) this).field_i, drb.field_k, false, "basic", wea.field_o);
        fka.a("requesting jpeg graphics", (byte) -87);
        rab.field_m.a(wea.field_o, -1, wea.field_o, ((fcb) this).field_d);
        fka.a("requesting font graphics", (byte) -64);
        rab.field_m.a(((fcb) this).field_e, am.field_p, false, "basic", wqb.field_b);
        fka.a("requesting textures", (byte) -107);
        rab.field_m.a(ipa.field_p, -1, koa.field_k, ((fcb) this).field_a);
        fka.a("requesting texturemetrics", (byte) -66);
        rab.field_m.a(ipa.field_p, -1, koa.field_k, ((fcb) this).field_m);
        fka.a("requesting extradata1", (byte) -94);
        rab.field_m.a(lwa.field_vb, -1, ltb.field_q, ((fcb) this).field_f);
        fka.a("requesting extradata2", (byte) -77);
        rab.field_m.a(lwa.field_vb, -1, ltb.field_q, ((fcb) this).field_b);
        fka.a("end of requestdata", (byte) -98);
    }

    final boolean a(byte param0) {
        Object var3 = null;
        int var4_int = 0;
        ii var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        phb[][] var9 = null;
        caa[] var10 = null;
        asb var11 = null;
        asb var12 = null;
        phb[][] var14 = null;
        caa[] var15 = null;
        int[] var16 = null;
        int[] var19 = null;
        L0: {
          var8 = VoidHunters.field_G;
          fka.a("Inside unpack", (byte) -111);
          int discarded$14 = -99;
          nra.b();
          var11 = kwa.field_o;
          var12 = jta.field_r;
          if (((fcb) this).field_l == null) {
            break L0;
          } else {
            if (((fcb) this).field_k == null) {
              break L0;
            } else {
              fka.a("Unpacking sounds", (byte) -104);
              int discarded$15 = 4410;
              dfb.a();
              uoa.a(bva.field_e, param0 ^ -69, 82.0f);
              mab.field_a.d(param0 + -187);
              ((fcb) this).field_c = new bmb(((fcb) this).field_l, ((fcb) this).field_k);
              fa.field_d[0] = ((fcb) this).field_c.a("", "vh_menu_mouseover", (byte) 113);
              fa.field_d[1] = ((fcb) this).field_c.a("", "vh_menu_mouseover", (byte) 72);
              fa.field_d[2] = ((fcb) this).field_c.a("", "vh boosters_loop", (byte) 95);
              fa.field_d[3] = ((fcb) this).field_c.a("", "vh plasma ball launch", (byte) 84);
              fa.field_d[4] = ((fcb) this).field_c.a("", "vh attaching parts", (byte) 83);
              fa.field_d[5] = ((fcb) this).field_c.a("", "vh chat recieved", (byte) 61);
              fa.field_d[6] = ((fcb) this).field_c.a("", "vh click button off", (byte) 69);
              fa.field_d[7] = ((fcb) this).field_c.a("", "vh click button on", (byte) 115);
              fa.field_d[8] = ((fcb) this).field_c.a("", "vh detaching parts", (byte) 96);
              fa.field_d[9] = ((fcb) this).field_c.a("", "vh enemy detected", (byte) 92);
              fa.field_d[10] = ((fcb) this).field_c.a("", "vh energy shutdown", (byte) 127);
              fa.field_d[11] = ((fcb) this).field_c.a("", "vh grapplinghook attach", (byte) 93);
              fa.field_d[12] = ((fcb) this).field_c.a("", "vh grapplinghook deploy", (byte) 79);
              fa.field_d[13] = ((fcb) this).field_c.a("", "vh grapplinghook detach", (byte) 127);
              fa.field_d[14] = ((fcb) this).field_c.a("", "vh grapplinghook reel-in", (byte) 63);
              fa.field_d[15] = ((fcb) this).field_c.a("", "vh health siren_loop", (byte) 93);
              fa.field_d[16] = ((fcb) this).field_c.a("", "vh low energy", (byte) 64);
              fa.field_d[17] = ((fcb) this).field_c.a("", "vh powerplant_loop", (byte) 89);
              fa.field_d[18] = ((fcb) this).field_c.a("", "vh reloaded", (byte) 90);
              fa.field_d[19] = ((fcb) this).field_c.a("", "vh repair spot1", (byte) 57);
              fa.field_d[20] = ((fcb) this).field_c.a("", "vh repair spot2", (byte) 125);
              fa.field_d[21] = ((fcb) this).field_c.a("", "vh repair spot3", (byte) 106);
              fa.field_d[22] = ((fcb) this).field_c.a("", "vh repair spot4", (byte) 69);
              fa.field_d[23] = ((fcb) this).field_c.a("", "vh repair spot5", (byte) 92);
              fa.field_d[24] = ((fcb) this).field_c.a("", "vh repair spot6", (byte) 50);
              fbb.field_j[19] = 6;
              fa.field_d[25] = ((fcb) this).field_c.a("", "vh shields off", (byte) 102);
              fa.field_d[26] = ((fcb) this).field_c.a("", "vh shields on", (byte) 104);
              fa.field_d[27] = ((fcb) this).field_c.a("", "vh bomblet spray1", (byte) 51);
              fa.field_d[28] = ((fcb) this).field_c.a("", "vh bomblet spray2", (byte) 77);
              fa.field_d[29] = ((fcb) this).field_c.a("", "vh bomblet spray3", (byte) 127);
              fa.field_d[30] = ((fcb) this).field_c.a("", "vh bomblet spray4", (byte) 116);
              fbb.field_j[27] = 4;
              fa.field_d[31] = ((fcb) this).field_c.a("", "vh laser beam1", (byte) 81);
              fa.field_d[32] = ((fcb) this).field_c.a("", "vh laser beam2", (byte) 109);
              fa.field_d[33] = ((fcb) this).field_c.a("", "vh laser beam3", (byte) 95);
              fa.field_d[34] = ((fcb) this).field_c.a("", "vh laser beam4", (byte) 111);
              fbb.field_j[31] = 4;
              fa.field_d[35] = ((fcb) this).field_c.a("", "vh mass driver1", (byte) 118);
              fa.field_d[36] = ((fcb) this).field_c.a("", "vh mass driver2", (byte) 62);
              fa.field_d[37] = ((fcb) this).field_c.a("", "vh mass driver3", (byte) 55);
              fa.field_d[38] = ((fcb) this).field_c.a("", "vh mass driver4", (byte) 76);
              fbb.field_j[35] = 4;
              fa.field_d[39] = ((fcb) this).field_c.a("", "vh missile launcher", (byte) 87);
              fa.field_d[40] = ((fcb) this).field_c.a("", "vh plasma ball_loop", (byte) 121);
              fa.field_d[41] = ((fcb) this).field_c.a("", "vh point defence laser loop", (byte) 98);
              fa.field_d[42] = ((fcb) this).field_c.a("", "vh railed sniper cannon1", (byte) 77);
              fa.field_d[43] = ((fcb) this).field_c.a("", "vh railed sniper cannon2", (byte) 79);
              fa.field_d[44] = ((fcb) this).field_c.a("", "vh railed sniper cannon3", (byte) 87);
              fa.field_d[45] = ((fcb) this).field_c.a("", "vh railed sniper cannon4", (byte) 104);
              fbb.field_j[42] = 4;
              fa.field_d[46] = ((fcb) this).field_c.a("", "vh saw damage_loop", (byte) 49);
              fa.field_d[47] = ((fcb) this).field_c.a("", "vh saw idle_loop", (byte) 82);
              fa.field_d[48] = ((fcb) this).field_c.a("", "vh damage collision1", (byte) 50);
              fa.field_d[49] = ((fcb) this).field_c.a("", "vh damage collision2", (byte) 97);
              fa.field_d[50] = ((fcb) this).field_c.a("", "vh damage collision3", (byte) 126);
              fbb.field_j[48] = 3;
              fa.field_d[51] = ((fcb) this).field_c.a("", "vh missile impact", (byte) 79);
              fa.field_d[52] = ((fcb) this).field_c.a("", "vh nodamage collision1", (byte) 126);
              fa.field_d[53] = ((fcb) this).field_c.a("", "vh nodamage collision2", (byte) 114);
              fa.field_d[54] = ((fcb) this).field_c.a("", "vh nodamage collision3", (byte) 102);
              fbb.field_j[52] = 3;
              fa.field_d[55] = ((fcb) this).field_c.a("", "vh powerplant explosion", (byte) 58);
              fa.field_d[56] = ((fcb) this).field_c.a("", "vh projectile impact 1", (byte) 92);
              fa.field_d[57] = ((fcb) this).field_c.a("", "vh projectile impact 2", (byte) 63);
              fa.field_d[58] = ((fcb) this).field_c.a("", "vh projectile impact 3", (byte) 59);
              fa.field_d[59] = ((fcb) this).field_c.a("", "vh projectile impact 4", (byte) 108);
              fbb.field_j[56] = 4;
              fa.field_d[60] = ((fcb) this).field_c.a("", "vh projectile impact nodamage 1", (byte) 49);
              fa.field_d[61] = ((fcb) this).field_c.a("", "vh projectile impact nodamage 2", (byte) 89);
              fa.field_d[62] = ((fcb) this).field_c.a("", "vh projectile impact nodamage 3", (byte) 52);
              fa.field_d[63] = ((fcb) this).field_c.a("", "vh projectile impact nodamage 4", (byte) 58);
              fbb.field_j[60] = 4;
              fa.field_d[64] = ((fcb) this).field_c.a("", "vh shield impact", (byte) 97);
              fa.field_d[65] = ((fcb) this).field_c.a("", "vh ship component explosion1", (byte) 89);
              fa.field_d[66] = ((fcb) this).field_c.a("", "vh ship component explosion2", (byte) 112);
              fa.field_d[67] = ((fcb) this).field_c.a("", "vh ship component explosion3", (byte) 105);
              fbb.field_j[65] = 3;
              fa.field_d[68] = ((fcb) this).field_c.a("", "vh ship final explosion", (byte) 74);
              fa.field_d[69] = ((fcb) this).field_c.a("", "vh thrusters colour_loop", (byte) 82);
              fa.field_d[70] = ((fcb) this).field_c.a("", "vh laser beam impact_loop", (byte) 60);
              fa.field_d[71] = ((fcb) this).field_c.a("", "vh missile scrambler", (byte) 112);
              fa.field_d[72] = ((fcb) this).field_c.a("", "vh repairmodeloop", (byte) 55);
              fa.field_d[73] = ((fcb) this).field_c.a("", "vh repairmodeloopelectrical", (byte) 120);
              fa.field_d[74] = ((fcb) this).field_c.a("", "vh tractor beam_loop", (byte) 102);
              fa.field_d[75] = ((fcb) this).field_c.a("", "vh menu woosh1", (byte) 96);
              fa.field_d[76] = ((fcb) this).field_c.a("", "vh menu woosh2", (byte) 115);
              fa.field_d[77] = ((fcb) this).field_c.a("", "vh projectile impact rock1", (byte) 97);
              fa.field_d[78] = ((fcb) this).field_c.a("", "vh projectile impact rock2", (byte) 85);
              fa.field_d[79] = ((fcb) this).field_c.a("", "vh projectile impact rock3", (byte) 66);
              fa.field_d[80] = ((fcb) this).field_c.a("", "vh projectile impact rock4", (byte) 60);
              fbb.field_j[77] = 4;
              fa.field_d[81] = ((fcb) this).field_c.a("", "vh missile shot down", (byte) 113);
              fa.field_d[82] = ((fcb) this).field_c.a("", "vh countdown beep", (byte) 89);
              fa.field_d[83] = ((fcb) this).field_c.a("", "vh self destruct arm", (byte) 65);
              fa.field_d[84] = ((fcb) this).field_c.a("", "vh self destruct activated", (byte) 50);
              fa.field_d[85] = ((fcb) this).field_c.a("", "vh self destruct countdown", (byte) 61);
              fa.field_d[86] = ((fcb) this).field_c.a("", "vh missile lock_loop", (byte) 126);
              fa.field_d[87] = ((fcb) this).field_c.a("", "vh_fighter_deployed_1", (byte) 108);
              fa.field_d[88] = ((fcb) this).field_c.a("", "vh_fighter_deployed_2", (byte) 98);
              fa.field_d[89] = ((fcb) this).field_c.a("", "vh_fighter_deployed_3", (byte) 109);
              fbb.field_j[87] = 3;
              fa.field_d[90] = ((fcb) this).field_c.a("", "vh_fighter_hit_1", (byte) 81);
              fa.field_d[91] = ((fcb) this).field_c.a("", "vh_fighter_hit_2", (byte) 65);
              fa.field_d[92] = ((fcb) this).field_c.a("", "vh_fighter_hit_3", (byte) 90);
              fa.field_d[93] = ((fcb) this).field_c.a("", "vh_fighter_hit_4", (byte) 96);
              fbb.field_j[90] = 4;
              fa.field_d[94] = ((fcb) this).field_c.a("", "vh_fighter_chatter_a_01", (byte) 102);
              fa.field_d[95] = ((fcb) this).field_c.a("", "vh_fighter_chatter_a_02", (byte) 95);
              fa.field_d[96] = ((fcb) this).field_c.a("", "vh_fighter_chatter_a_03", (byte) 66);
              fa.field_d[97] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_01", (byte) 90);
              fa.field_d[98] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_02", (byte) 95);
              fa.field_d[99] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_03", (byte) 120);
              fa.field_d[100] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_04", (byte) 63);
              fa.field_d[101] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_05", (byte) 112);
              fa.field_d[102] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_06", (byte) 118);
              fa.field_d[103] = ((fcb) this).field_c.a("", "vh_fighter_chatter_b_07", (byte) 114);
              fa.field_d[104] = ((fcb) this).field_c.a("", "vh_fighter_chatter_c_01", (byte) 104);
              fa.field_d[105] = ((fcb) this).field_c.a("", "vh_fighter_chatter_c_02", (byte) 54);
              fa.field_d[106] = ((fcb) this).field_c.a("", "vh_fighter_chatter_c_03", (byte) 62);
              fa.field_d[107] = ((fcb) this).field_c.a("", "vh_fighter_chatter_c_04", (byte) 81);
              fa.field_d[108] = ((fcb) this).field_c.a("", "vh_fighter_chatter_c_05", (byte) 101);
              ((fcb) this).field_k = null;
              ((fcb) this).field_l = null;
              fbb.field_j[94] = 15;
              fkb.a(param0 ^ 2164);
              return false;
            }
          }
        }
        if (null != ((fcb) this).field_h) {
          fka.a("Unpacking music", (byte) -125);
          uoa.a(pp.field_p, -1, 88.0f);
          mab.field_a.d(-103);
          pab.field_k = new kka[4];
          pab.field_k[0] = kka.a(((fcb) this).field_h, "", "VH_Title_Music");
          pab.field_k[1] = kka.a(((fcb) this).field_h, "", "VH_Ingame_Music");
          pab.field_k[2] = kka.a(((fcb) this).field_h, "", "VH_Jingle_Win");
          pab.field_k[3] = kka.a(((fcb) this).field_h, "", "VH_Jingle_Lose");
          ((fcb) this).field_h = null;
          fkb.a(2096);
          return false;
        } else {
          if (null == ((fcb) this).field_j) {
            L1: {
              if (param0 == 68) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            L2: {
              if (null == ((fcb) this).field_e) {
                break L2;
              } else {
                if (((fcb) this).field_d != null) {
                  fka.a("Unpacking graphics", (byte) -113);
                  uoa.a(qi.field_o, -1, 90.0f);
                  mab.field_a.d(-112);
                  lhb.field_a = (no) (Object) fab.a(var12, "", 0, var11, "arialish12");
                  dsb.field_p = vda.a(0, "basic", ((fcb) this).field_i, ((fcb) this).field_e, "antigrav_18_graphics1");
                  kbb.a(var12, ((fcb) this).field_e, ((fcb) this).field_i, (byte) 88, var11);
                  cbb.a(((fcb) this).field_d, param0 ^ 57, ((fcb) this).field_i);
                  ko.field_e = ucb.a("frame", -124, "basic", ((fcb) this).field_i);
                  vfa.field_d = ucb.a("frame_filled", 52, "basic", ((fcb) this).field_i);
                  dra.field_v = ucb.a("button_frame", param0 ^ 21, "basic", ((fcb) this).field_i);
                  ck.field_o = ucb.a("button_raised", -95, "basic", ((fcb) this).field_i);
                  phb[] discarded$16 = ucb.a("button_depressed", 80, "basic", ((fcb) this).field_i);
                  lo.field_c = wjb.a(((fcb) this).field_i, true, "basic", "achievements_large");
                  int discarded$17 = 1;
                  ubb.field_j = gra.a(var11, "unachieved", "basic");
                  int discarded$18 = 1;
                  wu.field_h = gra.a(var11, "orbcoin", "basic");
                  un.a(ubb.field_j, 121);
                  un.a(wu.field_h, 126);
                  kua.field_a = new phb(32, 32);
                  kua.field_a.b();
                  wu.field_h.c(0, 0, 32, 32);
                  jl.field_q.a((byte) -108);
                  wu.field_h = null;
                  bpb.field_p = new phb[ei.field_i.length][];
                  var9 = new phb[ei.field_i.length][];
                  var14 = var9;
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= ei.field_i.length) {
                      dda.a(18090, false);
                      tna.a(gab.field_j, param0 + 29073);
                      var10 = qu.a(98, "basic", "extra_crowns", ((fcb) this).field_i);
                      var15 = var10;
                      var19 = new int[var10.length];
                      var7 = 0;
                      L4: while (true) {
                        if (var19.length <= var7) {
                          L5: {
                            cma.a(var12, var14, var19, true, (byte) -127, rba.field_g, ee.field_q, ms.field_A, fha.field_o, 8, bpb.field_p, var11, 1, ((fcb) this).field_b, var15, shb.field_o, ub.field_d);
                            int discarded$19 = 1;
                            kl.field_c = gra.a(((fcb) this).field_i, "lobby_game_logo", "basic");
                            int discarded$20 = -100;
                            int discarded$21 = 200;
                            hk.b();
                            eh.a(var11, param0 + -68, var12);
                            int discarded$22 = 0;
                            int discarded$23 = 0;
                            int discarded$24 = 16777215;
                            vk.a((java.applet.Applet) (Object) mab.field_a, 2141, cga.field_o);
                            var3 = null;
                            ((fcb) this).field_e = null;
                            fkb.a(param0 ^ 2164);
                            if (ssa.b(2)) {
                              int discarded$25 = 16;
                              nna.field_C = new djb(clb.a(), lhb.field_a, bm.field_o);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          fkb.a(2096);
                          return false;
                        } else {
                          var19[var7] = 9;
                          var7++;
                          continue L4;
                        }
                      }
                    } else {
                      bpb.field_p[var5] = wjb.a(((fcb) this).field_i, true, "basic", ei.field_i[var5]);
                      var9[var5] = bpb.field_p[var5];
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((fcb) this).field_f == null) {
              L6: {
                if (null != vq.field_x) {
                  break L6;
                } else {
                  fka.a("Creating textureprovider", (byte) -119);
                  var4 = new ii(((fcb) this).field_m, ((fcb) this).field_a, ((fcb) this).field_i);
                  fka.a("Creating tk manager", (byte) -80);
                  var16 = new int[]{eaa.field_q};
                  vq.field_x = new fab((d) (Object) var4, fja.a(var16, param0 + -66));
                  fka.a("Finished creating tk manager", (byte) -109);
                  break L6;
                }
              }
              if (vq.field_x.field_e == null) {
                return false;
              } else {
                return true;
              }
            } else {
              fka.a("Loading huffman wordpack", (byte) -123);
              spb.a((byte) -22, new dqb(((fcb) this).field_f.a("huffman", true, "")));
              ((fcb) this).field_f = null;
              fkb.a(2096);
              return false;
            }
          } else {
            fka.a("Unpacking patches", (byte) -123);
            var4_int = 0;
            L7: while (true) {
              if (var4_int >= 4) {
                ew.field_p.field_k.b(false);
                ((fcb) this).field_j = null;
                ((fcb) this).field_c = null;
                fkb.a(2096);
                return false;
              } else {
                if (pab.field_k[var4_int] != null) {
                  if (!ew.field_p.field_k.a(((fcb) this).field_c, -29476, ((fcb) this).field_j, 176400, pab.field_k[var4_int])) {
                    fkb.a(param0 ^ 2164);
                    return false;
                  } else {
                    var4_int++;
                    continue L7;
                  }
                } else {
                  var4_int++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_g = null;
        int var1 = 13;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          L1: {
            if (param3 < ob.field_j) {
              break L1;
            } else {
              if (mt.field_o < param4) {
                break L1;
              } else {
                if (lua.field_c > param2) {
                  break L1;
                } else {
                  if (param1 <= hab.field_i) {
                    nn.a(param3, param4, param2, 112, param0, param1);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          cl.a(-3518, param0, param1, param2, param4, param3);
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Defend your base";
    }
}
