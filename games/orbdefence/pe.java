/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class pe {
    static byte[][] field_a;
    static String field_c;
    static im field_b;

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static void a(byte param0, Throwable param1, String param2) {
        try {
            be stackIn_17_0;
            java.net.URL stackIn_17_1;
            java.net.URL stackIn_17_2;
            java.net.URL stackIn_17_3;
            StringBuilder stackIn_17_4;
            be stackIn_18_0;
            java.net.URL stackIn_18_1;
            java.net.URL stackIn_18_2;
            java.net.URL stackIn_18_3;
            StringBuilder stackIn_18_4;
            String stackIn_18_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            eb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param0 == -13) {
                    break L1;
                  } else {
                    field_c = (String) null;
                    break L1;
                  }
                }
                L2: {
                  var3 = "";
                  if (param1 != null) {
                    var3 = vi.a(41, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param2 != null) {
                    L4: {
                      if (param1 != null) {
                        var3 = var3 + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3 = var3 + param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ae.a(var3, param0 ^ -111);
                var7 = hg.a(var3, "%3a", ":", (byte) -36);
                var8 = hg.a(var7, "%40", "@", (byte) -67);
                var9 = hg.a(var8, "%26", "&", (byte) -61);
                var10 = hg.a(var9, "%23", "#", (byte) -34);
                if (null == cg.field_f) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackIn_17_0 = df.field_e;

                    stackIn_17_1 = null;

                    stackIn_17_2 = null;

                    stackIn_17_3 = cg.field_f.getCodeBase();

                    stackIn_17_4 = new StringBuilder().append("clienterror.ws?c=").append(lm.field_d).append("&u=");

                    if (null != th.field_b) {
                      stackIn_18_0 = (be) ((Object) stackIn_17_0);
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = (java.net.URL) ((Object) stackIn_17_3);
                      stackIn_18_4 = (StringBuilder) ((Object) stackIn_17_4);
                      stackIn_18_5 = th.field_b;
                      break L5;
                    } else {
                      stackIn_18_0 = (be) ((Object) stackIn_17_0);
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = (java.net.URL) ((Object) stackIn_17_3);
                      stackIn_18_4 = (StringBuilder) ((Object) stackIn_17_4);
                      stackIn_18_5 = "" + el.field_F;
                      break L5;
                    }
                  }
                  var4 = ((be) (Object) stackIn_18_0).a(new java.net.URL(stackIn_18_3, stackIn_18_5 + "&v1=" + be.field_s + "&v2=" + be.field_j + "&e=" + var10), (byte) -49);
                  L6: while (true) {
                    if (var4.field_a != 0) {
                      if (var4.field_a == 1) {
                        var5 = (DataInputStream) (var4.field_g);
                        var5.read();
                        var5.close();
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      hb.a(1L, 110);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              return;
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

    public static void b(int param0) {
        field_a = (byte[][]) null;
        field_b = null;
        if (param0 <= 105) {
            pe.b(119);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = "Suggested names: ";
        field_a = new byte[250][];
        field_b = new im();
    }
}
