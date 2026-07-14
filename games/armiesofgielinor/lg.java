/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private java.util.zip.Inflater field_a;
    static int[][] field_b;
    static me field_e;
    static String field_c;
    static int field_d;

    final static void a(int param0, kl param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        wk var6 = null;
        wk var7 = null;
        if (param0 != 32381) {
          var5 = null;
          hl discarded$1 = lg.a((String) null, (byte) 32);
          var6 = new wk(param1.a("", 49, "final_frame.jpg"), (java.awt.Component) (Object) si.field_b);
          var3 = var6.field_y;
          var4 = var6.field_v;
          rq.a((byte) -56);
          wd.field_k = new wk(var3, 3 * var4 / 4);
          wd.field_k.b();
          var6.f(0, 0);
          vt.field_k = new wk(var3, var4 + -wd.field_k.field_v);
          vt.field_k.b();
          var6.f(0, -wd.field_k.field_v);
          vt.field_k.field_z = wd.field_k.field_v;
          rf.b(-18862);
          return;
        } else {
          var7 = new wk(param1.a("", 49, "final_frame.jpg"), (java.awt.Component) (Object) si.field_b);
          var3 = var7.field_y;
          var4 = var7.field_v;
          rq.a((byte) -56);
          wd.field_k = new wk(var3, 3 * var4 / 4);
          wd.field_k.b();
          var7.f(0, 0);
          vt.field_k = new wk(var3, var4 + -wd.field_k.field_v);
          vt.field_k.b();
          var7.f(0, -wd.field_k.field_v);
          vt.field_k.field_z = wd.field_k.field_v;
          rf.b(-18862);
          return;
        }
    }

    public lg() {
        this(-1, 1000000, 1000000);
    }

    final static hl a(String param0, byte param1) {
        String var2 = null;
        Object var3 = null;
        hl var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var3 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (nh.field_K != null) {
          if (param0 != null) {
            if (0 != param0.length()) {
              var6 = (CharSequence) (Object) param0;
              var2 = k.a(var6, false);
              if (param1 == -34) {
                if (var2 != null) {
                  var3_ref = (hl) (Object) nh.field_K.a((byte) -27, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3_ref != null) {
                      var8 = (CharSequence) (Object) var3_ref.field_Mb;
                      var4 = k.a(var8, false);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (hl) (Object) nh.field_K.d(-348);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                lg.a((byte) 5);
                if (var2 != null) {
                  var3_ref = (hl) (Object) nh.field_K.a((byte) -27, (long)var2.hashCode());
                  L1: while (true) {
                    if (var3_ref != null) {
                      var7 = (CharSequence) (Object) var3_ref.field_Mb;
                      var4 = k.a(var7, false);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (hl) (Object) nh.field_K.d(-348);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private lg(int param0, int param1, int param2) {
    }

    final void a(byte param0, vh param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-32 != (param1.field_o[param1.field_q] ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-117 == param1.field_o[param1.field_q + 1]) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        throw new RuntimeException("");
                    }
                    case 4: {
                        if (null != ((lg) this).field_a) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ((lg) this).field_a = new java.util.zip.Inflater(true);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((lg) this).field_a.setInput(param1.field_o, param1.field_q + 10, param1.field_o.length + (-10 + -param1.field_q + -8));
                            int discarded$3 = ((lg) this).field_a.inflate(param2);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        exception = (Exception) (Object) caughtException;
                        ((lg) this).field_a.reset();
                        throw new RuntimeException("");
                    }
                    case 9: {
                        ((lg) this).field_a.reset();
                        if (param0 != -71) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        ((lg) this).field_a = null;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2) {
        if (param2 >= -40) {
            return -71;
        }
        if (!param1) {
            return sc.field_b.a(param0);
        }
        return ir.field_h.a(param0);
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        if (param0 < 78) {
          var2 = null;
          hl discarded$2 = lg.a((String) null, (byte) 37);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new me(9, 0, 4, 1);
        field_c = "Skip battles: ";
    }
}
