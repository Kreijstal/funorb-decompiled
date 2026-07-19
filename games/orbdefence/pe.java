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
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            eb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            be stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            be stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            be stackIn_18_0 = null;
            java.net.URL stackIn_18_1 = null;
            java.net.URL stackIn_18_2 = null;
            java.net.URL stackIn_18_3 = null;
            StringBuilder stackIn_18_4 = null;
            String stackIn_18_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            be stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            be stackOut_17_0 = null;
            java.net.URL stackOut_17_1 = null;
            java.net.URL stackOut_17_2 = null;
            java.net.URL stackOut_17_3 = null;
            StringBuilder stackOut_17_4 = null;
            String stackOut_17_5 = null;
            be stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
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
                  var3_ref = "";
                  if (param1 != null) {
                    var3_ref = vi.a(41, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param2 != null) {
                    L4: {
                      if (param1 != null) {
                        var3_ref = var3_ref + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ae.a(var3_ref, param0 ^ -111);
                var7 = hg.a(var3_ref, "%3a", ":", (byte) -36);
                var8 = hg.a(var7, "%40", "@", (byte) -67);
                var9 = hg.a(var8, "%26", "&", (byte) -61);
                var10 = hg.a(var9, "%23", "#", (byte) -34);
                if (null == cg.field_f) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackOut_15_0 = df.field_e;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackOut_15_3 = cg.field_f.getCodeBase();
                    stackOut_15_4 = new StringBuilder().append("clienterror.ws?c=").append(lm.field_d).append("&u=");
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    stackIn_17_4 = stackOut_15_4;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    if (null != th.field_b) {
                      stackOut_17_0 = (be) ((Object) stackIn_17_0);
                      stackOut_17_1 = null;
                      stackOut_17_2 = null;
                      stackOut_17_3 = (java.net.URL) ((Object) stackIn_17_3);
                      stackOut_17_4 = (StringBuilder) ((Object) stackIn_17_4);
                      stackOut_17_5 = th.field_b;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      stackIn_18_3 = stackOut_17_3;
                      stackIn_18_4 = stackOut_17_4;
                      stackIn_18_5 = stackOut_17_5;
                      break L5;
                    } else {
                      stackOut_16_0 = (be) ((Object) stackIn_16_0);
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackOut_16_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackOut_16_5 = "" + el.field_F;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      stackIn_18_4 = stackOut_16_4;
                      stackIn_18_5 = stackOut_16_5;
                      break L5;
                    }
                  }
                  var4 = ((be) (Object) stackIn_18_0).a(new java.net.URL(stackIn_18_3, stackIn_18_5 + "&v1=" + be.field_s + "&v2=" + be.field_j + "&e=" + var10), (byte) -49);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var4.field_a != 0) {
                          break L8;
                        } else {
                          hb.a(1L, 110);
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var4.field_a == 1) {
                        break L7;
                      } else {
                        return;
                      }
                    }
                    var5 = (DataInputStream) (var4.field_g);
                    discarded$1 = var5.read();
                    var5.close();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
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
