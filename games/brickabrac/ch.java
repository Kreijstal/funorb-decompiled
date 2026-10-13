/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_b;
    static RgbSprite field_m;
    static RgbSprite[] field_k;
    static RgbSprite field_l;
    static tf field_a;
    static RgbSprite field_f;
    static hl field_c;
    static int[] field_g;
    static String field_j;
    static String field_e;
    static cq field_h;
    static String field_d;
    static String field_i;

    final static void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        mp var6 = null;
        mp var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        mp var6Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var1 = jl.field_e;
          var2 = var1.readUnsignedByte(255);
          if (0 == var2) {
            if (null == tf.field_d) {
              tf.field_d = new mk(128);
              IsaacGenerator.field_h = 0;
            }
            stackIn_12_0 = (1 != var1.readUnsignedByte(255)) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.readCp1252String(-1);
            if (var3_int != 0) {
              var5 = var1.readCp1252String(-1);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = HighscorePackSelector.a(0, var4_ref_String);
            var7_ref = var1.readCp1252String(-1);
            var8 = gb.a((CharSequence) ((Object) var4_ref_String), 69);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = HighscorePackSelector.a(0, var7_ref);
              if (null != var6) {
                tf.field_d.a((long)var8.hashCode(), var6, 110);
              }
            }
            if (var6 == null) {
              var6 = new mp();
              tf.field_d.a((long)var8.hashCode(), var6, 120);
              fieldTemp$1 = IsaacGenerator.field_h;
              IsaacGenerator.field_h = IsaacGenerator.field_h + 1;
              var6.field_Sb = fieldTemp$1;
              jq.field_n.addLast(var6, (byte) 3);
            }
            var6.field_ac = var5;
            var6.field_Qb = var7_ref;
            var6.field_Rb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (LevelMetadata.field_m == 1) {
                LevelMetadata.field_m = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (LevelMetadata.field_m == 2) {
                LevelMetadata.field_m = 1;
              }
              return;
            }
            if (var2 == 4) {
              LevelMetadata.field_m = 1;
              var3 = var1.readCp1252String(-1);
              rk.field_Tb = ((String) (var3)).intern();
              var4 = var1.readUnsignedByte(255);
              wn.a(2, var4);
              return;
            }
            rk.a("F1: " + eq.c((byte) -104), (Throwable) null, 58);
            hn.a((byte) 98);
            if (param0 < 52) {
              ch.a((byte) -91);
            }
            return;
          }
          if (null == BlankScreen.field_i) {
            BlankScreen.field_i = new mk(128);
            LevelPackSelectScreen.field_w = 0;
          }
          var3Lifetime1 = var1.readCp1252String(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readCp1252String(-1);
          var5Lifetime1 = var1.readCp1252String(-1);
          var6Lifetime1 = pf.a(false, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = pf.a(false, var5Lifetime1);
            if (var6Lifetime1 != null) {
              BlankScreen.field_i.a((long)gb.a((CharSequence) ((Object) var4_ref_StringLifetime1), 87).hashCode(), var6Lifetime1, 104);
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new mp();
            BlankScreen.field_i.a((long)gb.a((CharSequence) ((Object) var4_ref_StringLifetime1), 116).hashCode(), var6Lifetime1, 101);
            fieldTemp$0 = LevelPackSelectScreen.field_w;
            LevelPackSelectScreen.field_w = LevelPackSelectScreen.field_w + 1;
            var6Lifetime1.field_Sb = fieldTemp$0;
            bf.field_N.addLast(var6Lifetime1, (byte) 3);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Rb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Ub = (String) (var3Lifetime1);
          var6Lifetime1.field_Qb = var5Lifetime1;
          var6Lifetime1.unlink((byte) 111);
          var7 = (mp) (bf.field_N.first(-65));
          while (null != var7) {
            if (a.a(200, var7, var6Lifetime1)) {
              var7 = (mp) (bf.field_N.next((byte) 116));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (var7 != null) {
            il.a(var6Lifetime1, -103, var7);
            if (var9 == 0) {
              return;
            }
          }
          bf.field_N.addLast(var6Lifetime1, (byte) 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1_ref), "ch.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          field_i = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_g = null;
          if (param0 != 20623) {
            field_b = -11;
          }
          field_l = null;
          field_m = null;
          field_h = null;
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "ch.B(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var4), "ch.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = new tf();
        field_g = new int[256];
        field_j = "Genius!";
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "Players";
        field_h = null;
        field_i = "Blind: distorts your screen";
    }
}
