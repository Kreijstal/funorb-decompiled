/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class k implements ba {
    static double field_a;
    static int field_c;
    static boolean field_b;
    private long field_d;

    abstract String d(int param0);

    final static void c(int param0) {
        j.j(-23687);
        if (param0 >= -107) {
            return;
        }
        cg.field_f = true;
        ei.field_e = true;
        sd.field_c.k(117);
        ca.a(ni.field_e, false, 16777215);
    }

    public final sg a(boolean param0) {
        if (!(!this.a((byte) -31))) {
            return il.field_e;
        }
        if (!param0) {
            this.field_d = 73L;
            if (!(id.a(43) >= this.field_d + 350L)) {
                return tb.field_b;
            }
            return this.e(14);
        }
        if (!(id.a(43) >= this.field_d + 350L)) {
            return tb.field_b;
        }
        return this.e(14);
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            int var4 = 0;
            vi var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            le stackIn_10_0 = null;
            java.net.URL stackIn_10_1 = null;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            StringBuilder stackIn_10_4 = null;
            le stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            le stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            String stackIn_12_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            le stackOut_9_0 = null;
            java.net.URL stackOut_9_1 = null;
            java.net.URL stackOut_9_2 = null;
            java.net.URL stackOut_9_3 = null;
            StringBuilder stackOut_9_4 = null;
            le stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            le stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            String stackOut_10_5 = null;
            var7 = Main.field_T;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = mf.a(param0, (byte) -3);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                n.a(var3_ref, (byte) 120);
                var4 = 71 % ((param1 - -20) / 48);
                var8 = sb.a(var3_ref, ":", "%3a", 96);
                var9 = sb.a(var8, "@", "%40", 118);
                var10 = sb.a(var9, "&", "%26", 109);
                var11 = sb.a(var10, "#", "%23", 90);
                if (tk.field_o != null) {
                  L4: {
                    stackOut_9_0 = Main.field_W;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = tk.field_o.getCodeBase();
                    stackOut_9_4 = new StringBuilder().append("clienterror.ws?c=").append(ca.field_d).append("&u=");
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    if (fk.field_o == null) {
                      stackOut_11_0 = (le) ((Object) stackIn_11_0);
                      stackOut_11_1 = null;
                      stackOut_11_2 = null;
                      stackOut_11_3 = (java.net.URL) ((Object) stackIn_11_3);
                      stackOut_11_4 = (StringBuilder) ((Object) stackIn_11_4);
                      stackOut_11_5 = "" + kb.field_f;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      break L4;
                    } else {
                      stackOut_10_0 = (le) ((Object) stackIn_10_0);
                      stackOut_10_1 = null;
                      stackOut_10_2 = null;
                      stackOut_10_3 = (java.net.URL) ((Object) stackIn_10_3);
                      stackOut_10_4 = (StringBuilder) ((Object) stackIn_10_4);
                      stackOut_10_5 = fk.field_o;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_12_5 = stackOut_10_5;
                      break L4;
                    }
                  }
                  var5 = ((le) (Object) stackIn_12_0).a(new java.net.URL(stackIn_12_3, stackIn_12_5 + "&v1=" + le.field_v + "&v2=" + le.field_w + "&e=" + var11), true);
                  L5: while (true) {
                    if (var5.field_a != 0) {
                      L6: {
                        if (1 != var5.field_a) {
                          break L6;
                        } else {
                          var6 = (DataInputStream) (var5.field_e);
                          discarded$1 = var6.read();
                          var6.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      wk.a((byte) -97, 1L);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0) {
        if (param0 >= -96) {
            k.c(58);
            this.field_d = id.a(111);
            return;
        }
        this.field_d = id.a(111);
    }

    abstract sg e(int param0);

    public final String b(int param0) {
        if (!this.a((byte) -60)) {
          if (param0 == 26766) {
            if ((id.a(46) ^ -1L) > (350L + this.field_d ^ -1L)) {
              return null;
            } else {
              return this.d(-5777);
            }
          } else {
            this.field_d = 5L;
            if ((id.a(46) ^ -1L) > (350L + this.field_d ^ -1L)) {
              return null;
            } else {
              return this.d(-5777);
            }
          }
        } else {
          return null;
        }
    }

    static {
        field_a = 0.0;
        field_b = false;
        field_c = 0;
    }
}
