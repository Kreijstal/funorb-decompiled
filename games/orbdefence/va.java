/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class va {
    static int field_c;
    static String field_a;
    static int field_d;
    static String[] field_b;

    final static hj a(int param0, int param1, ki param2, byte param3) {
        RuntimeException var4 = null;
        hj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hj stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -127) {
            stackIn_2_0 = (hj) null;
            return stackIn_2_0;
          }
          if (pk.a(-117, param0, param2, param1)) {
            stackIn_7_0 = tj.c(117);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (hj) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("va.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "va.toString()");
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
          return;
        }
        try {
          field_a = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "va.C(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
          int var2_int = 0;
          RuntimeException var2 = null;
          Throwable decompiledCaughtException = null;
          IOException var2_ref = null;
          try {
            if (cd.field_t.field_i >= param1) {
              return true;
            }
            if (null == p.field_d) {
              return false;
            }
            try {
              if (!param0) {
                field_a = (String) null;
              }
              var2_int = p.field_d.b((byte) 101);
              if (0 < var2_int) {
                if (var2_int > -cd.field_t.field_i + param1) {
                  var2_int = param1 - cd.field_t.field_i;
                }
                p.field_d.a(cd.field_t.field_i, var2_int, -24, cd.field_t.field_j);
                of.field_L = ji.b(-19);
                cd.field_t.field_i = cd.field_t.field_i + var2_int;
                if (cd.field_t.field_i < param1) {
                  return false;
                }
                cd.field_t.field_i = 0;
                return true;
              }
              if (var2_int < 0 ||
                !(ed.b(-1) <= 30000L)) {
                th.a(102);
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              th.a(110);
            }
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw dd.a((Throwable) ((Object) var2), "va.D(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ki param0, byte param1) {
        RuntimeException stackIn_664_0 = null;
        StringBuilder stackIn_664_1 = null;
        String stackIn_665_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        byte[] var2Lifetime178;
        byte[] var2Lifetime179;
        byte[] var2Lifetime180;
        byte[] var2Lifetime181;
        byte[] var2Lifetime182;
        byte[] var2Lifetime183;
        byte[] var2Lifetime184;
        byte[] var2Lifetime185;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          md.field_d = param0;
          var2 = jk.a(1, "orbisdeaded");
          if (null != var2) {
            fd.field_d = bk.a(var2, -12465);
          }
          var2Lifetime1 = jk.a(1, "toocostly");
          if (var2Lifetime1 != null) {
            ih.field_b = bk.a(var2Lifetime1, -12465);
          }
          var2Lifetime2 = jk.a(1, "cannotdoithere");
          if (null != var2Lifetime2) {
            aa.field_a = bk.a(var2Lifetime2, -12465);
          }
          var2Lifetime3 = jk.a(1, "barrierneedsedge");
          if (null != var2Lifetime3) {
            ue.field_J = bk.a(var2Lifetime3, -12465);
          }
          var2Lifetime4 = jk.a(1, "gamename");
          if (param1 < 23) {
            va.a(false, -87);
          }
          if (null != var2Lifetime4) {
            ui.field_e = bk.a(var2Lifetime4, -12465);
          }
          var2Lifetime5 = jk.a(1, "dosomethingtoquit");
          if (var2Lifetime5 != null) {
            oh.field_d = bk.a(var2Lifetime5, -12465);
          }
          var2Lifetime6 = jk.a(1, "wonthegame");
          if (var2Lifetime6 != null) {
            sl.field_Z = bk.a(var2Lifetime6, -12465);
          }
          var2Lifetime7 = jk.a(1, "spacenextwave");
          if (var2Lifetime7 != null) {
            p.field_b = bk.a(var2Lifetime7, -12465);
          }
          var2Lifetime8 = jk.a(1, "costtext");
          if (null != var2Lifetime8) {
            rh.field_a = bk.a(var2Lifetime8, -12465);
          }
          var2Lifetime9 = jk.a(1, "frztext");
          if (var2Lifetime9 != null) {
            t.field_k = bk.a(var2Lifetime9, -12465);
          }
          var2Lifetime10 = jk.a(1, "aoetext");
          if (var2Lifetime10 != null) {
            ei.field_b = bk.a(var2Lifetime10, -12465);
          }
          var2Lifetime11 = jk.a(1, "damtxt");
          if (null != var2Lifetime11) {
            sd.field_d = bk.a(var2Lifetime11, -12465);
          }
          var2Lifetime12 = jk.a(1, "rangetxt");
          if (var2Lifetime12 != null) {
            ed.field_e = bk.a(var2Lifetime12, -12465);
          }
          var2Lifetime13 = jk.a(1, "boltstxt");
          if (var2Lifetime13 != null) {
            ca.field_a = bk.a(var2Lifetime13, -12465);
          }
          var2Lifetime14 = jk.a(1, "barriertxt1");
          if (var2Lifetime14 != null) {
            wg.field_n = bk.a(var2Lifetime14, -12465);
          }
          var2Lifetime15 = jk.a(1, "barriertxt2");
          if (var2Lifetime15 != null) {
            ed.field_d = bk.a(var2Lifetime15, -12465);
          }
          var2Lifetime16 = jk.a(1, "tutorial_basic,0");
          if (null != var2Lifetime16) {
            pa.field_a[0] = bk.a(var2Lifetime16, -12465);
          }
          var2Lifetime17 = jk.a(1, "tutorial_basic,1");
          if (null != var2Lifetime17) {
            pa.field_a[1] = bk.a(var2Lifetime17, -12465);
          }
          var2Lifetime18 = jk.a(1, "tutorial_basic,2");
          if (var2Lifetime18 != null) {
            pa.field_a[2] = bk.a(var2Lifetime18, -12465);
          }
          var2Lifetime19 = jk.a(1, "tutorial_basic,3");
          if (null != var2Lifetime19) {
            pa.field_a[3] = bk.a(var2Lifetime19, -12465);
          }
          var2Lifetime20 = jk.a(1, "tutorial_basic,7");
          if (null != var2Lifetime20) {
            pa.field_a[7] = bk.a(var2Lifetime20, -12465);
          }
          var2Lifetime21 = jk.a(1, "tutorial_basic,8");
          if (var2Lifetime21 != null) {
            pa.field_a[8] = bk.a(var2Lifetime21, -12465);
          }
          var2Lifetime22 = jk.a(1, "tutorial_basic,9");
          if (var2Lifetime22 != null) {
            pa.field_a[9] = bk.a(var2Lifetime22, -12465);
          }
          var2Lifetime23 = jk.a(1, "tutorial_basic,10");
          if (var2Lifetime23 != null) {
            pa.field_a[10] = bk.a(var2Lifetime23, -12465);
          }
          var2Lifetime24 = jk.a(1, "tutorial_basic,11");
          if (var2Lifetime24 != null) {
            pa.field_a[11] = bk.a(var2Lifetime24, -12465);
          }
          var2Lifetime25 = jk.a(1, "tutorial_basic,12");
          if (null != var2Lifetime25) {
            pa.field_a[12] = bk.a(var2Lifetime25, -12465);
          }
          var2Lifetime26 = jk.a(1, "tutorial_basic,13");
          if (var2Lifetime26 != null) {
            pa.field_a[13] = bk.a(var2Lifetime26, -12465);
          }
          var2Lifetime27 = jk.a(1, "tutorial_basic,14");
          if (var2Lifetime27 != null) {
            pa.field_a[14] = bk.a(var2Lifetime27, -12465);
          }
          var2Lifetime28 = jk.a(1, "tutorial_basic,15");
          if (null != var2Lifetime28) {
            pa.field_a[15] = bk.a(var2Lifetime28, -12465);
          }
          var2Lifetime29 = jk.a(1, "tutorial_basic,16");
          if (null != var2Lifetime29) {
            pa.field_a[16] = bk.a(var2Lifetime29, -12465);
          }
          var2Lifetime30 = jk.a(1, "tutorial_basic,17");
          if (var2Lifetime30 != null) {
            pa.field_a[17] = bk.a(var2Lifetime30, -12465);
          }
          var2Lifetime31 = jk.a(1, "tutorial_basic,18");
          if (var2Lifetime31 != null) {
            pa.field_a[18] = bk.a(var2Lifetime31, -12465);
          }
          var2Lifetime32 = jk.a(1, "tutorial_advanced,0");
          if (var2Lifetime32 != null) {
            sa.field_d[0] = bk.a(var2Lifetime32, -12465);
          }
          var2Lifetime33 = jk.a(1, "tutorial_advanced,1");
          if (var2Lifetime33 != null) {
            sa.field_d[1] = bk.a(var2Lifetime33, -12465);
          }
          var2Lifetime34 = jk.a(1, "tutorial_advanced,2");
          if (null != var2Lifetime34) {
            sa.field_d[2] = bk.a(var2Lifetime34, -12465);
          }
          var2Lifetime35 = jk.a(1, "tutorial_advanced,3");
          if (var2Lifetime35 != null) {
            sa.field_d[3] = bk.a(var2Lifetime35, -12465);
          }
          var2Lifetime36 = jk.a(1, "tutorial_advanced,4");
          if (var2Lifetime36 != null) {
            sa.field_d[4] = bk.a(var2Lifetime36, -12465);
          }
          var2Lifetime37 = jk.a(1, "tutorial_advanced,5");
          if (var2Lifetime37 != null) {
            sa.field_d[5] = bk.a(var2Lifetime37, -12465);
          }
          var2Lifetime38 = jk.a(1, "tutorial_advanced,6");
          if (null != var2Lifetime38) {
            sa.field_d[6] = bk.a(var2Lifetime38, -12465);
          }
          var2Lifetime39 = jk.a(1, "tutorial_advanced,7");
          if (var2Lifetime39 != null) {
            sa.field_d[7] = bk.a(var2Lifetime39, -12465);
          }
          var2Lifetime40 = jk.a(1, "tutorial_advanced,8");
          if (null != var2Lifetime40) {
            sa.field_d[8] = bk.a(var2Lifetime40, -12465);
          }
          var2Lifetime41 = jk.a(1, "tutorial_advanced,9");
          if (null != var2Lifetime41) {
            sa.field_d[9] = bk.a(var2Lifetime41, -12465);
          }
          var2Lifetime42 = jk.a(1, "tutorial_advanced,10");
          if (var2Lifetime42 != null) {
            sa.field_d[10] = bk.a(var2Lifetime42, -12465);
          }
          var2Lifetime43 = jk.a(1, "tutorial_advanced,11");
          if (null != var2Lifetime43) {
            sa.field_d[11] = bk.a(var2Lifetime43, -12465);
          }
          var2Lifetime44 = jk.a(1, "tutorial_advanced,12");
          if (var2Lifetime44 != null) {
            sa.field_d[12] = bk.a(var2Lifetime44, -12465);
          }
          var2Lifetime45 = jk.a(1, "tutorial_advanced,13");
          if (var2Lifetime45 != null) {
            sa.field_d[13] = bk.a(var2Lifetime45, -12465);
          }
          var2Lifetime46 = jk.a(1, "tutorial_advanced,14");
          if (null != var2Lifetime46) {
            sa.field_d[14] = bk.a(var2Lifetime46, -12465);
          }
          var2Lifetime47 = jk.a(1, "tutorial_advanced,15");
          if (null != var2Lifetime47) {
            sa.field_d[15] = bk.a(var2Lifetime47, -12465);
          }
          var2Lifetime48 = jk.a(1, "tutorial_advanced,16");
          if (var2Lifetime48 != null) {
            sa.field_d[16] = bk.a(var2Lifetime48, -12465);
          }
          var2Lifetime49 = jk.a(1, "tutorial_advanced,17");
          if (null != var2Lifetime49) {
            sa.field_d[17] = bk.a(var2Lifetime49, -12465);
          }
          var2Lifetime50 = jk.a(1, "tutorial_advanced,18");
          if (var2Lifetime50 != null) {
            sa.field_d[18] = bk.a(var2Lifetime50, -12465);
          }
          var2Lifetime51 = jk.a(1, "overtenthousand");
          if (var2Lifetime51 != null) {
            ci.field_m = bk.a(var2Lifetime51, -12465);
          }
          var2Lifetime52 = jk.a(1, "thousand");
          if (var2Lifetime52 != null) {
            rf.field_H = bk.a(var2Lifetime52, -12465);
          }
          var2Lifetime53 = jk.a(1, "energyname");
          if (null != var2Lifetime53) {
            nh.field_a = bk.a(var2Lifetime53, -12465);
          }
          var2Lifetime54 = jk.a(1, "prepyourdef");
          if (var2Lifetime54 != null) {
            jm.field_c = bk.a(var2Lifetime54, -12465);
          }
          var2Lifetime55 = jk.a(1, "nextwavein");
          if (var2Lifetime55 != null) {
            nb.field_p = bk.a(var2Lifetime55, -12465);
          }
          var2Lifetime56 = jk.a(1, "wavecomp");
          if (null != var2Lifetime56) {
            nl.field_c = bk.a(var2Lifetime56, -12465);
          }
          var2Lifetime57 = jk.a(1, "norbstr");
          if (null != var2Lifetime57) {
            d.field_h = bk.a(var2Lifetime57, -12465);
          }
          var2Lifetime58 = jk.a(1, "beamblastname");
          if (null != var2Lifetime58) {
            q.field_c = bk.a(var2Lifetime58, -12465);
          }
          var2Lifetime59 = jk.a(1, "iceshotname");
          if (var2Lifetime59 != null) {
            fd.field_g = bk.a(var2Lifetime59, -12465);
          }
          var2Lifetime60 = jk.a(1, "bigshotname");
          if (var2Lifetime60 != null) {
            oj.field_o = bk.a(var2Lifetime60, -12465);
          }
          var2Lifetime61 = jk.a(1, "chainshotname");
          if (var2Lifetime61 != null) {
            am.field_g = bk.a(var2Lifetime61, -12465);
          }
          var2Lifetime62 = jk.a(1, "fastblastname");
          if (var2Lifetime62 != null) {
            jg.field_l = bk.a(var2Lifetime62, -12465);
          }
          var2Lifetime63 = jk.a(1, "electroshockername");
          if (var2Lifetime63 != null) {
            kg.field_l = bk.a(var2Lifetime63, -12465);
          }
          var2Lifetime64 = jk.a(1, "barriername");
          if (null != var2Lifetime64) {
            gl.field_c = bk.a(var2Lifetime64, -12465);
          }
          var2Lifetime65 = jk.a(1, "bonusscore");
          if (var2Lifetime65 != null) {
            rl.field_d = bk.a(var2Lifetime65, -12465);
          }
          var2Lifetime66 = jk.a(1, "scoreis");
          if (var2Lifetime66 != null) {
            ke.field_a = bk.a(var2Lifetime66, -12465);
          }
          var2Lifetime67 = jk.a(1, "timenom");
          if (var2Lifetime67 != null) {
            cf.field_g = bk.a(var2Lifetime67, -12465);
          }
          var2Lifetime68 = jk.a(1, "wave");
          if (null != var2Lifetime68) {
            gb.field_e = bk.a(var2Lifetime68, -12465);
          }
          var2Lifetime69 = jk.a(1, "thingboss");
          if (null != var2Lifetime69) {
            ia.field_e = bk.a(var2Lifetime69, -12465);
          }
          var2Lifetime70 = jk.a(1, "sneakoname");
          if (var2Lifetime70 != null) {
            k.field_a = bk.a(var2Lifetime70, -12465);
          }
          var2Lifetime71 = jk.a(1, "paniconame");
          if (var2Lifetime71 != null) {
            od.field_a = bk.a(var2Lifetime71, -12465);
          }
          var2Lifetime72 = jk.a(1, "splittoname");
          if (null != var2Lifetime72) {
            bi.field_a = bk.a(var2Lifetime72, -12465);
          }
          var2Lifetime73 = jk.a(1, "awesomeoname");
          if (null != var2Lifetime73) {
            bk.field_b = bk.a(var2Lifetime73, -12465);
          }
          var2Lifetime74 = jk.a(1, "irononame");
          if (var2Lifetime74 != null) {
            uh.field_c = bk.a(var2Lifetime74, -12465);
          }
          var2Lifetime75 = jk.a(1, "ghostoname");
          if (var2Lifetime75 != null) {
            jl.field_f = bk.a(var2Lifetime75, -12465);
          }
          var2Lifetime76 = jk.a(1, "blamboname");
          if (null != var2Lifetime76) {
            gd.field_a = bk.a(var2Lifetime76, -12465);
          }
          var2Lifetime77 = jk.a(1, "bomboname");
          if (null != var2Lifetime77) {
            jd.field_f = bk.a(var2Lifetime77, -12465);
          }
          var2Lifetime78 = jk.a(1, "flyboname");
          if (var2Lifetime78 != null) {
            re.field_g = bk.a(var2Lifetime78, -12465);
          }
          var2Lifetime79 = jk.a(1, "toughoname");
          if (var2Lifetime79 != null) {
            we.field_A = bk.a(var2Lifetime79, -12465);
          }
          var2Lifetime80 = jk.a(1, "speedoname");
          if (null != var2Lifetime80) {
            re.field_f = bk.a(var2Lifetime80, -12465);
          }
          var2Lifetime81 = jk.a(1, "swarmoname");
          if (var2Lifetime81 != null) {
            th.field_a = bk.a(var2Lifetime81, -12465);
          }
          var2Lifetime82 = jk.a(1, "normoname");
          if (null != var2Lifetime82) {
            ig.field_gb = bk.a(var2Lifetime82, -12465);
          }
          var2Lifetime83 = jk.a(1, "awesomewin");
          if (var2Lifetime83 != null) {
            mg.field_h = bk.a(var2Lifetime83, -12465);
          }
          var2Lifetime84 = jk.a(1, "blambolicouswin");
          if (null != var2Lifetime84) {
            nb.field_o = bk.a(var2Lifetime84, -12465);
          }
          var2Lifetime85 = jk.a(1, "norbsomewin");
          if (null != var2Lifetime85) {
            cc.field_r = bk.a(var2Lifetime85, -12465);
          }
          var2Lifetime86 = jk.a(1, "orbsomewin");
          if (null != var2Lifetime86) {
            oe.field_q = bk.a(var2Lifetime86, -12465);
          }
          var2Lifetime87 = jk.a(1, "youwon");
          if (null != var2Lifetime87) {
            bi.field_d = bk.a(var2Lifetime87, -12465);
          }
          var2Lifetime88 = jk.a(1, "institle");
          if (var2Lifetime88 != null) {
            hi.field_l = bk.a(var2Lifetime88, -12465);
          }
          var2Lifetime89 = jk.a(1, "scoretitle");
          if (var2Lifetime89 != null) {
            we.field_F = bk.a(var2Lifetime89, -12465);
          }
          var2Lifetime90 = jk.a(1, "wavetitle");
          if (null != var2Lifetime90) {
            nh.field_e = bk.a(var2Lifetime90, -12465);
          }
          var2Lifetime91 = jk.a(1, "nametitle");
          if (null != var2Lifetime91) {
            bg.field_d = bk.a(var2Lifetime91, -12465);
          }
          var2Lifetime92 = jk.a(1, "bsths");
          if (null != var2Lifetime92) {
            bk.field_c = bk.a(var2Lifetime92, -12465);
          }
          var2Lifetime93 = jk.a(1, "myhs");
          if (var2Lifetime93 != null) {
            hh.field_e = bk.a(var2Lifetime93, -12465);
          }
          var2Lifetime94 = jk.a(1, "allhs");
          if (var2Lifetime94 != null) {
            df.field_a = bk.a(var2Lifetime94, -12465);
          }
          var2Lifetime95 = jk.a(1, "thisishidden");
          if (var2Lifetime95 != null) {
            od.field_h = bk.a(var2Lifetime95, -12465);
          }
          var2Lifetime96 = jk.a(1, "orbcoin");
          if (var2Lifetime96 != null) {
            nf.field_n = bk.a(var2Lifetime96, -12465);
          }
          var2Lifetime97 = jk.a(1, "unknownstuff");
          if (null != var2Lifetime97) {
            OrbDefence.field_E = bk.a(var2Lifetime97, -12465);
          }
          var2Lifetime98 = jk.a(1, "orbpoints");
          if (null != var2Lifetime98) {
            dj.field_e = bk.a(var2Lifetime98, -12465);
          }
          var2Lifetime99 = jk.a(1, "achievethisgame");
          if (var2Lifetime99 != null) {
            ja.field_d = bk.a(var2Lifetime99, -12465);
          }
          var2Lifetime100 = jk.a(1, "achieve");
          if (var2Lifetime100 != null) {
            wc.field_b = bk.a(var2Lifetime100, -12465);
          }
          var2Lifetime101 = jk.a(1, "thousandseperator");
          if (var2Lifetime101 != null) {
            ck.field_k = bk.a(var2Lifetime101, -12465);
          }
          var2Lifetime102 = jk.a(1, "cs5");
          if (var2Lifetime102 != null) {
            kd.field_b = bk.a(var2Lifetime102, -12465);
          }
          var2Lifetime103 = jk.a(1, "cs4");
          if (var2Lifetime103 != null) {
            p.field_e = bk.a(var2Lifetime103, -12465);
          }
          var2Lifetime104 = jk.a(1, "bs5");
          if (var2Lifetime104 != null) {
            cd.field_r = bk.a(var2Lifetime104, -12465);
          }
          var2Lifetime105 = jk.a(1, "bs4");
          if (null != var2Lifetime105) {
            ug.field_o = bk.a(var2Lifetime105, -12465);
          }
          var2Lifetime106 = jk.a(1, "ic5");
          if (var2Lifetime106 != null) {
            ua.field_b = bk.a(var2Lifetime106, -12465);
          }
          var2Lifetime107 = jk.a(1, "ic4");
          if (var2Lifetime107 != null) {
            b.field_q = bk.a(var2Lifetime107, -12465);
          }
          var2Lifetime108 = jk.a(1, "bb5");
          if (null != var2Lifetime108) {
            ob.field_E = bk.a(var2Lifetime108, -12465);
          }
          var2Lifetime109 = jk.a(1, "bb4");
          if (null != var2Lifetime109) {
            lj.field_B = bk.a(var2Lifetime109, -12465);
          }
          var2Lifetime110 = jk.a(1, "es5");
          if (null != var2Lifetime110) {
            ua.field_d = bk.a(var2Lifetime110, -12465);
          }
          var2Lifetime111 = jk.a(1, "es4");
          if (var2Lifetime111 != null) {
            de.field_c = bk.a(var2Lifetime111, -12465);
          }
          var2Lifetime112 = jk.a(1, "fb5");
          if (null != var2Lifetime112) {
            ob.field_L = bk.a(var2Lifetime112, -12465);
          }
          var2Lifetime113 = jk.a(1, "fb4");
          if (null != var2Lifetime113) {
            nd.field_f = bk.a(var2Lifetime113, -12465);
          }
          var2Lifetime114 = jk.a(1, "levellocked");
          if (var2Lifetime114 != null) {
            wl.field_b = bk.a(var2Lifetime114, -12465);
          }
          var2Lifetime115 = jk.a(1, "memberonlylevel");
          if (null != var2Lifetime115) {
            of.field_I = bk.a(var2Lifetime115, -12465);
          }
          var2Lifetime116 = jk.a(1, "levelselect");
          if (null != var2Lifetime116) {
            lc.field_u = bk.a(var2Lifetime116, -12465);
          }
          var2Lifetime117 = jk.a(1, "startfreegame");
          if (var2Lifetime117 != null) {
            wh.field_d = bk.a(var2Lifetime117, -12465);
          }
          var2Lifetime118 = jk.a(1, "startmembersgame");
          if (null != var2Lifetime118) {
            k.field_e = bk.a(var2Lifetime118, -12465);
          }
          var2Lifetime119 = jk.a(1, "achievement_names,0");
          if (null != var2Lifetime119) {
            gj.field_j[0] = bk.a(var2Lifetime119, -12465);
          }
          var2Lifetime120 = jk.a(1, "achievement_names,1");
          if (var2Lifetime120 != null) {
            gj.field_j[1] = bk.a(var2Lifetime120, -12465);
          }
          var2Lifetime121 = jk.a(1, "achievement_names,2");
          if (var2Lifetime121 != null) {
            gj.field_j[2] = bk.a(var2Lifetime121, -12465);
          }
          var2Lifetime122 = jk.a(1, "achievement_names,3");
          if (var2Lifetime122 != null) {
            gj.field_j[3] = bk.a(var2Lifetime122, -12465);
          }
          var2Lifetime123 = jk.a(1, "achievement_names,4");
          if (null != var2Lifetime123) {
            gj.field_j[4] = bk.a(var2Lifetime123, -12465);
          }
          var2Lifetime124 = jk.a(1, "achievement_names,5");
          if (var2Lifetime124 != null) {
            gj.field_j[5] = bk.a(var2Lifetime124, -12465);
          }
          var2Lifetime125 = jk.a(1, "achievement_names,6");
          if (null != var2Lifetime125) {
            gj.field_j[6] = bk.a(var2Lifetime125, -12465);
          }
          var2Lifetime126 = jk.a(1, "achievement_names,7");
          if (var2Lifetime126 != null) {
            gj.field_j[7] = bk.a(var2Lifetime126, -12465);
          }
          var2Lifetime127 = jk.a(1, "achievement_names,8");
          if (var2Lifetime127 != null) {
            gj.field_j[8] = bk.a(var2Lifetime127, -12465);
          }
          var2Lifetime128 = jk.a(1, "achievement_names,9");
          if (var2Lifetime128 != null) {
            gj.field_j[9] = bk.a(var2Lifetime128, -12465);
          }
          var2Lifetime129 = jk.a(1, "achievement_names,10");
          if (var2Lifetime129 != null) {
            gj.field_j[10] = bk.a(var2Lifetime129, -12465);
          }
          var2Lifetime130 = jk.a(1, "achievement_names,11");
          if (var2Lifetime130 != null) {
            gj.field_j[11] = bk.a(var2Lifetime130, -12465);
          }
          var2Lifetime131 = jk.a(1, "achievement_names,12");
          if (null != var2Lifetime131) {
            gj.field_j[12] = bk.a(var2Lifetime131, -12465);
          }
          var2Lifetime132 = jk.a(1, "achievement_names,13");
          if (null != var2Lifetime132) {
            gj.field_j[13] = bk.a(var2Lifetime132, -12465);
          }
          var2Lifetime133 = jk.a(1, "achievement_names,14");
          if (null != var2Lifetime133) {
            gj.field_j[14] = bk.a(var2Lifetime133, -12465);
          }
          var2Lifetime134 = jk.a(1, "achievement_names,15");
          if (null != var2Lifetime134) {
            gj.field_j[15] = bk.a(var2Lifetime134, -12465);
          }
          var2Lifetime135 = jk.a(1, "achievement_names,16");
          if (var2Lifetime135 != null) {
            gj.field_j[16] = bk.a(var2Lifetime135, -12465);
          }
          var2Lifetime136 = jk.a(1, "achievement_names,17");
          if (null != var2Lifetime136) {
            gj.field_j[17] = bk.a(var2Lifetime136, -12465);
          }
          var2Lifetime137 = jk.a(1, "achievement_names,18");
          if (var2Lifetime137 != null) {
            gj.field_j[18] = bk.a(var2Lifetime137, -12465);
          }
          var2Lifetime138 = jk.a(1, "achievement_names,19");
          if (null != var2Lifetime138) {
            gj.field_j[19] = bk.a(var2Lifetime138, -12465);
          }
          var2Lifetime139 = jk.a(1, "achievement_names,20");
          if (var2Lifetime139 != null) {
            gj.field_j[20] = bk.a(var2Lifetime139, -12465);
          }
          var2Lifetime140 = jk.a(1, "achievement_names,21");
          if (var2Lifetime140 != null) {
            gj.field_j[21] = bk.a(var2Lifetime140, -12465);
          }
          var2Lifetime141 = jk.a(1, "achievement_names,22");
          if (var2Lifetime141 != null) {
            gj.field_j[22] = bk.a(var2Lifetime141, -12465);
          }
          var2Lifetime142 = jk.a(1, "achievement_names,23");
          if (null != var2Lifetime142) {
            gj.field_j[23] = bk.a(var2Lifetime142, -12465);
          }
          var2Lifetime143 = jk.a(1, "achievement_criteria,0");
          if (var2Lifetime143 != null) {
            field_b[0] = bk.a(var2Lifetime143, -12465);
          }
          var2Lifetime144 = jk.a(1, "achievement_criteria,1");
          if (var2Lifetime144 != null) {
            field_b[1] = bk.a(var2Lifetime144, -12465);
          }
          var2Lifetime145 = jk.a(1, "achievement_criteria,2");
          if (var2Lifetime145 != null) {
            field_b[2] = bk.a(var2Lifetime145, -12465);
          }
          var2Lifetime146 = jk.a(1, "achievement_criteria,3");
          if (null != var2Lifetime146) {
            field_b[3] = bk.a(var2Lifetime146, -12465);
          }
          var2Lifetime147 = jk.a(1, "achievement_criteria,4");
          if (null != var2Lifetime147) {
            field_b[4] = bk.a(var2Lifetime147, -12465);
          }
          var2Lifetime148 = jk.a(1, "achievement_criteria,5");
          if (var2Lifetime148 != null) {
            field_b[5] = bk.a(var2Lifetime148, -12465);
          }
          var2Lifetime149 = jk.a(1, "achievement_criteria,6");
          if (null != var2Lifetime149) {
            field_b[6] = bk.a(var2Lifetime149, -12465);
          }
          var2Lifetime150 = jk.a(1, "achievement_criteria,7");
          if (null != var2Lifetime150) {
            field_b[7] = bk.a(var2Lifetime150, -12465);
          }
          var2Lifetime151 = jk.a(1, "achievement_criteria,8");
          if (var2Lifetime151 != null) {
            field_b[8] = bk.a(var2Lifetime151, -12465);
          }
          var2Lifetime152 = jk.a(1, "achievement_criteria,9");
          if (var2Lifetime152 != null) {
            field_b[9] = bk.a(var2Lifetime152, -12465);
          }
          var2Lifetime153 = jk.a(1, "achievement_criteria,10");
          if (var2Lifetime153 != null) {
            field_b[10] = bk.a(var2Lifetime153, -12465);
          }
          var2Lifetime154 = jk.a(1, "achievement_criteria,11");
          if (var2Lifetime154 != null) {
            field_b[11] = bk.a(var2Lifetime154, -12465);
          }
          var2Lifetime155 = jk.a(1, "achievement_criteria,12");
          if (null != var2Lifetime155) {
            field_b[12] = bk.a(var2Lifetime155, -12465);
          }
          var2Lifetime156 = jk.a(1, "achievement_criteria,13");
          if (var2Lifetime156 != null) {
            field_b[13] = bk.a(var2Lifetime156, -12465);
          }
          var2Lifetime157 = jk.a(1, "achievement_criteria,14");
          if (var2Lifetime157 != null) {
            field_b[14] = bk.a(var2Lifetime157, -12465);
          }
          var2Lifetime158 = jk.a(1, "achievement_criteria,15");
          if (var2Lifetime158 != null) {
            field_b[15] = bk.a(var2Lifetime158, -12465);
          }
          var2Lifetime159 = jk.a(1, "achievement_criteria,16");
          if (var2Lifetime159 != null) {
            field_b[16] = bk.a(var2Lifetime159, -12465);
          }
          var2Lifetime160 = jk.a(1, "achievement_criteria,17");
          if (null != var2Lifetime160) {
            field_b[17] = bk.a(var2Lifetime160, -12465);
          }
          var2Lifetime161 = jk.a(1, "achievement_criteria,18");
          if (var2Lifetime161 != null) {
            field_b[18] = bk.a(var2Lifetime161, -12465);
          }
          var2Lifetime162 = jk.a(1, "achievement_criteria,19");
          if (null != var2Lifetime162) {
            field_b[19] = bk.a(var2Lifetime162, -12465);
          }
          var2Lifetime163 = jk.a(1, "achievement_criteria,20");
          if (null != var2Lifetime163) {
            field_b[20] = bk.a(var2Lifetime163, -12465);
          }
          var2Lifetime164 = jk.a(1, "achievement_criteria,21");
          if (var2Lifetime164 != null) {
            field_b[21] = bk.a(var2Lifetime164, -12465);
          }
          var2Lifetime165 = jk.a(1, "achievement_criteria,22");
          if (null != var2Lifetime165) {
            field_b[22] = bk.a(var2Lifetime165, -12465);
          }
          var2Lifetime166 = jk.a(1, "achievement_criteria,23");
          if (var2Lifetime166 != null) {
            field_b[23] = bk.a(var2Lifetime166, -12465);
          }
          var2Lifetime167 = jk.a(1, "score_colon_space");
          if (var2Lifetime167 != null) {
            bk.a(var2Lifetime167, -12465);
          }
          var2Lifetime168 = jk.a(1, "instructions_pages,0");
          if (null != var2Lifetime168) {
            oa.field_i[0] = bk.a(var2Lifetime168, -12465);
          }
          var2Lifetime169 = jk.a(1, "instructions_pages,1");
          if (null != var2Lifetime169) {
            oa.field_i[1] = bk.a(var2Lifetime169, -12465);
          }
          var2Lifetime170 = jk.a(1, "instructions_pages,2");
          if (null != var2Lifetime170) {
            oa.field_i[2] = bk.a(var2Lifetime170, -12465);
          }
          var2Lifetime171 = jk.a(1, "instructions_pages,3");
          if (var2Lifetime171 != null) {
            oa.field_i[3] = bk.a(var2Lifetime171, -12465);
          }
          var2Lifetime172 = jk.a(1, "instructions_pages,4");
          if (null != var2Lifetime172) {
            oa.field_i[4] = bk.a(var2Lifetime172, -12465);
          }
          var2Lifetime173 = jk.a(1, "instructions_pages,5");
          if (null != var2Lifetime173) {
            oa.field_i[5] = bk.a(var2Lifetime173, -12465);
          }
          var2Lifetime174 = jk.a(1, "instructions_pages,6");
          if (null != var2Lifetime174) {
            oa.field_i[6] = bk.a(var2Lifetime174, -12465);
          }
          var2Lifetime175 = jk.a(1, "tutorialon");
          if (var2Lifetime175 != null) {
            cc.field_m = bk.a(var2Lifetime175, -12465);
          }
          var2Lifetime176 = jk.a(1, "tutorialoff");
          if (var2Lifetime176 != null) {
            db.field_c = bk.a(var2Lifetime176, -12465);
          }
          var2Lifetime177 = jk.a(1, "levelnames,0");
          if (var2Lifetime177 != null) {
            gb.field_g[0] = bk.a(var2Lifetime177, -12465);
          }
          var2Lifetime178 = jk.a(1, "levelnames,1");
          if (null != var2Lifetime178) {
            gb.field_g[1] = bk.a(var2Lifetime178, -12465);
          }
          var2Lifetime179 = jk.a(1, "levelnames,2");
          if (var2Lifetime179 != null) {
            gb.field_g[2] = bk.a(var2Lifetime179, -12465);
          }
          var2Lifetime180 = jk.a(1, "levelnames,3");
          if (var2Lifetime180 != null) {
            gb.field_g[3] = bk.a(var2Lifetime180, -12465);
          }
          var2Lifetime181 = jk.a(1, "levelnames,4");
          if (null != var2Lifetime181) {
            gb.field_g[4] = bk.a(var2Lifetime181, -12465);
          }
          var2Lifetime182 = jk.a(1, "levelnames,5");
          if (null != var2Lifetime182) {
            gb.field_g[5] = bk.a(var2Lifetime182, -12465);
          }
          var2Lifetime183 = jk.a(1, "benefits,0");
          if (null != var2Lifetime183) {
            tk.field_r[0] = bk.a(var2Lifetime183, -12465);
          }
          var2Lifetime184 = jk.a(1, "benefits,1");
          if (var2Lifetime184 != null) {
            tk.field_r[1] = bk.a(var2Lifetime184, -12465);
          }
          var2Lifetime185 = jk.a(1, "benefits,2");
          if (var2Lifetime185 != null) {
            tk.field_r[2] = bk.a(var2Lifetime185, -12465);
          }
          md.field_d = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_664_0 = var2_ref;
          stackIn_664_1 = new StringBuilder().append("va.B(");
          if (param0 == null) {
            stackIn_665_2 = "null";
          } else {
            stackIn_665_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_664_0), ((StringBuilder) (Object) stackIn_664_1).append(stackIn_665_2).append(',').append(param1).append(')').toString());
        }
        if (tf.field_e) {
          OrbDefence.field_D = (var3 == 0);
        }
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = new String[]{"Pass wave 66, with only a single orb after wave 33", "Pass wave 33 in First Fight", "Pass wave 66 in First Fight", "Unlock the Dominion level, by achieving a score of one million points in either Pincer or Breakout.", "Pass wave 66 in First Fight with three orbs intact", "Pass wave 66 in First Fight with all orbs intact", "Pass wave 99 in First Fight", "Pass wave 99 in First Fight with all orbs intact", "Pass wave 99 in Dominion", "Kill 99 enemies with level 5 fast blasts", "Kill 99 enemies with level 5 chain shots", "Kill 99 enemies with level 5 big shots", "Kill 99 enemies with level 5 beam blasts", "Defeat a boss wave in First Fight", "Defeat three boss waves in First Fight", "Defeat all the boss waves in First Fight", "Pass wave 99 in First Fight without building any ice turrets", "Lose all but the front orb after wave 33, in First Fight", "Use electroshock turrets to stun 250 Norbs at once", "Use barriers to stop 30 Norbs simultaneously", "Let a Norb live for 4 minutes, without losing an orb", "Achieve a score of one million points in either Gridlock or Orb central", "Unlock the Gridlock and Orb Central levels by passing wave 66 in Pincer or Breakout", "Kill the Ghosto boss during Hallowe'en"};
        field_c = 4;
    }
}
