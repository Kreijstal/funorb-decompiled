/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static dn field_c;
    static String field_e;
    static String field_b;
    static int field_a;
    static String field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0) {
          field_d = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static java.awt.Canvas a(byte param0) {
        int var1 = -97 / ((param0 - 81) / 36);
        return null == ua.field_d ? kj.field_D : (java.awt.Canvas) ((Object) ua.field_d);
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int fieldTemp$13 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$12 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var3Lifetime4;
        if (100 != param0) {
          if (param0 == 5000 &&
            LevelDecoder.field_b > 0) {
            fieldTemp$2 = LevelDecoder.field_b - 1;
            LevelDecoder.field_b = LevelDecoder.field_b - 1;
            var2_ref_byte__ = da.field_L[fieldTemp$2];
            da.field_L[LevelDecoder.field_b] = null;
            return var2_ref_byte__;
          }
          if (param0 != 30000) {
            if (param1 < 99) {
              return (byte[]) null;
            }
            if (bm.field_a != null) {
              for (var2 = 0; MultiplayerExitScreen.field_x.length > var2; var2++) {
                if (MultiplayerExitScreen.field_x[var2] == param0 &&
                  lk.field_u[var2] > 0) {
                  dupTemp$3 = lk.field_u[var2] - 1;
                  arrayValue$4 = bm.field_a[var2];
                  lk.field_u[var2] = dupTemp$3;
                  var3 = arrayValue$4[dupTemp$3];
                  bm.field_a[var2][lk.field_u[var2]] = null;
                  return var3;
                }
              }
            }
            return new byte[param0];
          }
          if (ac.field_e > 0) {
            fieldTemp$5 = ac.field_e - 1;
            ac.field_e = ac.field_e - 1;
            var2_ref_byte__Lifetime5 = IntrusiveHashTable.field_b[fieldTemp$5];
            IntrusiveHashTable.field_b[ac.field_e] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (param1 < 99) {
            return (byte[]) null;
          }
          if (bm.field_a != null) {
            for (var2Lifetime4 = 0; MultiplayerExitScreen.field_x.length > var2Lifetime4; var2Lifetime4++) {
              if (MultiplayerExitScreen.field_x[var2Lifetime4] == param0 &&
                lk.field_u[var2Lifetime4] > 0) {
                dupTemp$6 = lk.field_u[var2Lifetime4] - 1;
                arrayValue$7 = bm.field_a[var2Lifetime4];
                lk.field_u[var2Lifetime4] = dupTemp$6;
                var3Lifetime4 = arrayValue$7[dupTemp$6];
                bm.field_a[var2Lifetime4][lk.field_u[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
          }
          return new byte[param0];
        }
        if (ig.field_N > 0) {
          fieldTemp$17 = ig.field_N - 1;
          ig.field_N = ig.field_N - 1;
          var2_ref_byte__Lifetime1 = cf.field_b[fieldTemp$17];
          cf.field_b[ig.field_N] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 != 5000) {
          if (param0 == 30000 &&
            ac.field_e > 0) {
            fieldTemp$14 = ac.field_e - 1;
            ac.field_e = ac.field_e - 1;
            var2_ref_byte__Lifetime2 = IntrusiveHashTable.field_b[fieldTemp$14];
            IntrusiveHashTable.field_b[ac.field_e] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (param1 < 99) {
            return (byte[]) null;
          }
          if (bm.field_a == null) {
            return new byte[param0];
          }
          for (var2Lifetime1 = 0; MultiplayerExitScreen.field_x.length > var2Lifetime1; var2Lifetime1++) {
            if (MultiplayerExitScreen.field_x[var2Lifetime1] == param0 &&
              lk.field_u[var2Lifetime1] > 0) {
              dupTemp$15 = lk.field_u[var2Lifetime1] - 1;
              arrayValue$16 = bm.field_a[var2Lifetime1];
              lk.field_u[var2Lifetime1] = dupTemp$15;
              var3Lifetime1 = arrayValue$16[dupTemp$15];
              bm.field_a[var2Lifetime1][lk.field_u[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (LevelDecoder.field_b > 0) {
          fieldTemp$13 = LevelDecoder.field_b - 1;
          LevelDecoder.field_b = LevelDecoder.field_b - 1;
          var2_ref_byte__Lifetime3 = da.field_L[fieldTemp$13];
          da.field_L[LevelDecoder.field_b] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param0 != 30000) {
          if (param1 < 99) {
            return (byte[]) null;
          }
          if (bm.field_a == null) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; MultiplayerExitScreen.field_x.length > var2Lifetime2; var2Lifetime2++) {
            if (MultiplayerExitScreen.field_x[var2Lifetime2] == param0 &&
              lk.field_u[var2Lifetime2] > 0) {
              dupTemp$8 = lk.field_u[var2Lifetime2] - 1;
              arrayValue$9 = bm.field_a[var2Lifetime2];
              lk.field_u[var2Lifetime2] = dupTemp$8;
              var3Lifetime2 = arrayValue$9[dupTemp$8];
              bm.field_a[var2Lifetime2][lk.field_u[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (ac.field_e > 0) {
          fieldTemp$12 = ac.field_e - 1;
          ac.field_e = ac.field_e - 1;
          var2_ref_byte__Lifetime4 = IntrusiveHashTable.field_b[fieldTemp$12];
          IntrusiveHashTable.field_b[ac.field_e] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (param1 < 99) {
          return (byte[]) null;
        }
        if (bm.field_a == null) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; MultiplayerExitScreen.field_x.length > var2Lifetime3; var2Lifetime3++) {
          if (MultiplayerExitScreen.field_x[var2Lifetime3] == param0 &&
            lk.field_u[var2Lifetime3] > 0) {
            dupTemp$10 = lk.field_u[var2Lifetime3] - 1;
            arrayValue$11 = bm.field_a[var2Lifetime3];
            lk.field_u[var2Lifetime3] = dupTemp$10;
            var3Lifetime3 = arrayValue$11[dupTemp$10];
            bm.field_a[var2Lifetime3][lk.field_u[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    static {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
