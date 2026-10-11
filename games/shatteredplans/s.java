/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s {
    static int[] field_f;
    static int field_c;
    private java.util.zip.Inflater field_g;
    static int field_i;
    static int field_e;
    static String field_h;
    static boolean field_d;
    static String field_a;
    static String field_b;

    public s() {
        this(-1, 1000000, 1000000);
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_42_0;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ve var6Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = sa.field_a;
          var2 = var1.j(-64);
          if (var2 == 0) {
            if (sl.field_m == null) {
              sl.field_m = new in(128);
              oi.field_e = 0;
            }
            stackIn_11_0 = (1 != var1.j(-65)) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.e(-1);
            if (var3_int != 0) {
              var5 = var1.e(-1);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = di.a(var4_ref_String, 124);
            var7 = var1.e(-1);
            var8 = ji.a((CharSequence) ((Object) var4_ref_String), true);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = di.a(var7, 124);
              if (null != var6) {
                sl.field_m.a((long)var8.hashCode(), var6, true);
              }
            }
            if (null == var6) {
              var6 = new ve();
              sl.field_m.a((long)var8.hashCode(), var6, param0);
              fieldTemp$0 = oi.field_e;
              oi.field_e = oi.field_e + 1;
              var6.field_zb = fieldTemp$0;
              fp.field_b.a((byte) -113, var6);
            }
            var6.field_Eb = var5;
            var6.field_Ab = var4_ref_String;
            var6.field_Bb = var7;
            return;
          }
          if (1 != var2) {
            if (!param0) {
              field_i = 92;
            }
            if (2 == var2) {
              if (po.field_b == 1) {
                po.field_b = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == po.field_b) {
                po.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              jq.a(-29901, (Throwable) null, "F1: " + w.a(16738));
              q.g(-101);
              return;
            }
            po.field_b = 1;
            var3 = var1.e(-1);
            jo.field_d = ((String) (var3)).intern();
            var4 = var1.j(-71);
            os.a(-82, var4);
            return;
          }
          if (eg.field_q == null) {
            eg.field_q = new in(128);
            r.field_c = 0;
          }
          var3Lifetime1 = var1.e(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.e(-1);
          var5Lifetime1 = var1.e(-1);
          var6Lifetime1 = hb.a((byte) -90, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = hb.a((byte) -90, var5Lifetime1);
            if (null != var6Lifetime1) {
              eg.field_q.a((long)ji.a((CharSequence) ((Object) var4_ref_StringLifetime1), param0).hashCode(), var6Lifetime1, true);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new ve();
            eg.field_q.a((long)ji.a((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, true);
            fieldTemp$1 = r.field_c;
            r.field_c = r.field_c + 1;
            var6Lifetime1.field_zb = fieldTemp$1;
            vd.field_j.a((byte) -113, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Ab = var4_ref_StringLifetime1;
          var6Lifetime1.field_xb = (String) (var3Lifetime1);
          var6Lifetime1.field_Bb = var5Lifetime1;
          var6Lifetime1.b((byte) -125);
          var7_ref = (ve) (vd.field_j.d(0));
          L14: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7_ref != null) {
              stackOut_42_0 = d.a(var7_ref, var6Lifetime1, (byte) -81);
              stackIn_50_0 = stackOut_42_0 ? 1 : 0;
              stackIn_43_0 = stackOut_42_0;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_43_0)) {
                var7_ref = (ve) (vd.field_j.a((byte) -71));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break L14;
              }
              stackIn_50_0 = -126;
            }
            wp.$cfr$intArgs$a$2661ebe01e52(stackIn_50_0, var6Lifetime1, var7_ref);
            if (var9 == 0) {
              return;
            }
            break;
          }
          vd.field_j.a((byte) -113, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "s.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        ec.a(-1, eb.field_a, 5);
        if (param0 != 1) {
          return;
        }
        try {
          ec.a(param0 ^ -2, bg.field_c, 8);
          if (!kl.d((byte) 104)) {
            ec.a(-1, rm.field_h, 1);
            ec.a(-1, up.field_b, 2);
            ec.a(param0 ^ -2, hr.field_e, 3);
            ec.a(param0 ^ -2, lm.field_e, 4);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "s.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_a = null;
          field_h = null;
          field_b = null;
          field_f = null;
          if (param0 != 114) {
            field_e = 10;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "s.D(" + param0 + ')');
        }
    }

    private s(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, ob param1, int param2) {
        try {
          Exception exception = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          try {
            if (param1.field_h[param1.field_j] == 31 &&
              param1.field_h[1 + param1.field_j] == -117) {
              if (null == this.field_g) {
                this.field_g = new java.util.zip.Inflater(true);
              }
              try {
                this.field_g.setInput(param1.field_h, param1.field_j + 10, -10 - (param1.field_j + 8) + param1.field_h.length);
                this.field_g.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_g.reset();
                throw new RuntimeException("");
              }
              this.field_g.reset();
              if (param2 != 5591) {
                s.a(-110);
              }
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var4;
            stackIn_19_1 = new StringBuilder().append("s.B(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = -1;
        field_f = new int[4];
        field_h = "Message lobby";
        field_a = "Security";
        field_b = "<%0> has withdrawn the request to join.";
    }
}
