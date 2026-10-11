/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class b {
    private RandomAccessFile field_d;
    static oa field_f;
    static String field_c;
    static String[] field_g;
    private long field_a;
    private long field_e;
    static int field_b;

    final void a(int param0) throws IOException {
        if (null != this.field_d) {
          this.field_d.close();
          this.field_d = null;
        }
        if (param0 <= 113) {
          String var3 = (String) null;
          b.a(false, (String) null);
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.a(122);
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.read(param0, param2, param1);
          if (var5_int > 0) {
            this.field_a = this.field_a + (long)var5_int;
          }
          if (param3 != 12955) {
            var6 = (String) null;
            b.a((byte) 62, (String) null);
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("b.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_6_0 = (dd.a((byte) 104, param1) != null);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("b.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final long b(byte param0) throws IOException {
        int var2 = -104 % ((-19 - param0) / 37);
        return this.field_d.length();
    }

    public static void b(int param0) {
        if (param0 != 1) {
          field_c = (String) null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final void a(long param0, byte param1) throws IOException {
        this.field_d.seek(param0);
        this.field_a = param0;
        if (param1 < 64) {
          String var5 = (String) null;
          b.a(true, (String) null);
        }
    }

    final static boolean a(byte param0) {
        int var2 = 0;
        wf var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        wf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (wf) (rd.field_k.d(9272));
          var1 = var4;
          if (param0 > -86) {
            b.a((byte) -125);
          }
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (var4.field_s[var2] != null &&
              var4.field_s[var2].field_d == 0) {
              return false;
            }
            if (null != var4.field_j[var2] &&
              var4.field_j[var2].field_d == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "b.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = Terraphoenix.field_V;
        try {
          ga.field_j = ga.field_j + 1;
          if (tf.field_k == -1 &&
            -1 == ll.field_a) {
            tf.field_k = ef.field_j;
            ll.field_a = jb.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(cc.field_j));
          } else {
            decompiledFrameRemainder0 = (null == cc.field_j);
          }
          if (decompiledFrameRemainder0) {
            if (!uj.field_c) {
              if (qd.field_l <= ga.field_j) {
                stackIn_18_0 = (qd.field_l + fh.field_h > ga.field_j) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            boolean decompiledFrameRemainder1 = true;
            var2_int = stackIn_18_0;
            if (param1 != null && (uj.field_c ||
              var2_int != 0)) {
              ga.field_j = qd.field_l;
              decompiledFrameRemainder1 = false;
            }
            else {
              ga.field_j = 0;
            }
            if (param1 == null) {
              if (var2_int != 0) {
                uj.field_c = true;
              }
            } else {
              uj.field_c = false;
            }
            ea.field_m = tf.field_k;
            lb.field_b = ll.field_a;
          }
          if (!uj.field_c &&
            qd.field_l > ga.field_j &&
            ja.field_l) {
            ga.field_j = 0;
            lb.field_b = ll.field_a;
            ea.field_m = tf.field_k;
          }
          cc.field_j = param1;
          ll.field_a = -1;
          var2_intLifetime1 = 92 / ((param0 + 28) / 44);
          if (uj.field_c &&
            ga.field_j == dh.field_l) {
            ga.field_j = 0;
            uj.field_c = false;
          }
          tf.field_k = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("b.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        if (param3 >= -62) {
          return;
        }
        try {
          if (this.field_e < ((long)param0 + this.field_a)) {
            this.field_d.seek(this.field_e);
            this.field_d.write(1);
            throw new EOFException();
          }
          this.field_d.write(param1, param2, param0);
          this.field_a = this.field_a + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "b.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dh var17 = null;
        dh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Terraphoenix.field_V;
        try {
          var17 = new dh(param0);
          var18 = var17;
          var18.field_k = -2 + param0.length;
          kf.field_b = var18.i(-25578);
          ug.field_c = new byte[kf.field_b][];
          sb.field_m = new int[kf.field_b];
          hj.field_K = new int[kf.field_b];
          ha.field_s = new int[kf.field_b];
          aa.field_k = new boolean[kf.field_b];
          qc.field_b = new byte[kf.field_b][];
          rf.field_p = new int[kf.field_b];
          var18.field_k = param0.length + (-7 - kf.field_b * 8);
          ah.field_A = var18.i(-25578);
          sb.field_j = var18.i(-25578);
          if (param1 > -58) {
            var16 = (String) null;
            b.a((byte) 57, (String) null);
          }
          var3 = (255 & var18.a(-16384)) + 1;
          for (var4 = 0; var4 < kf.field_b; var4++) {
            ha.field_s[var4] = var17.i(-25578);
          }
          for (var4Lifetime1 = 0; kf.field_b > var4Lifetime1; var4Lifetime1++) {
            hj.field_K[var4Lifetime1] = var18.i(-25578);
          }
          for (var4Lifetime2 = 0; kf.field_b > var4Lifetime2; var4Lifetime2++) {
            sb.field_m[var4Lifetime2] = var18.i(-25578);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < kf.field_b; var4Lifetime3++) {
            rf.field_p[var4Lifetime3] = var18.i(-25578);
          }
          var18.field_k = -((-1 + var3) * 3) + (-7 + param0.length) - kf.field_b * 8;
          wb.field_a = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            wb.field_a[var4Lifetime4] = var18.d((byte) -113);
            if (wb.field_a[var4Lifetime4] == 0) {
              wb.field_a[var4Lifetime4] = 1;
            }
          }
          var18.field_k = 0;
          for (var4Lifetime5 = 0; kf.field_b > var4Lifetime5; var4Lifetime5++) {
            var5 = sb.field_m[var4Lifetime5];
            var6 = rf.field_p[var4Lifetime5];
            var7 = var6 * var5;
            var21 = new byte[var7];
            var19 = var21;
            var8 = var19;
            qc.field_b[var4Lifetime5] = var21;
            var22 = new byte[var7];
            var20 = var22;
            var9 = var20;
            ug.field_c[var4Lifetime5] = var22;
            var10 = 0;
            var11 = var18.a(-16384);
            stackIn_24_0 = 0;
            stackIn_24_1 = var11 & 1;
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var18.f(2);
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var18.f(2);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_49_0 = var10;
                  if (var13 == -1) {
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_1 = 1;
                  }
                  var10 = stackIn_49_0 | stackIn_50_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var13 * var5] = var18.f(2);
                }
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var18.f(2);
                    var9[var12 + var13 * var5] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_38_0 = var10;
                    if (var14 == -1) {
                      stackIn_39_1 = 0;
                    } else {
                      stackIn_39_1 = 1;
                    }
                    var10 = stackIn_38_0 | stackIn_39_1;
                  }
                }
              }
            }
            aa.field_k[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("b.I(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    b(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_a = 0L;
          var5_int = this.field_d.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Terra Phoenix";
        field_g = new String[]{"Sniper", "Squaddie", "Veteran", "Commando", "Officer", "Soldier's Soldier", "Grenadier", "Demolitions", "Secret Agent", "Reconstruction", "Hunter", "Dominator", "Defender of Civilisation", "Technophobe", "Who Dares, Wins", "Squiddie Basher", "Zombie Basher"};
        field_f = new oa();
    }
}
