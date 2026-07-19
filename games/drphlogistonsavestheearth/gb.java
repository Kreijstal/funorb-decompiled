/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gb {
    static he field_e;
    hl field_i;
    hl field_m;
    hl field_f;
    hl field_b;
    int field_j;
    long field_k;
    od field_l;
    od field_g;
    volatile int field_h;
    volatile int field_c;
    byte field_a;
    cm field_d;

    abstract void b(byte param0);

    abstract void a(byte param0);

    abstract boolean b(boolean param0);

    abstract void a(Object param0, boolean param1, byte param2);

    final int c(byte param0) {
        int discarded$2 = 0;
        if (param0 >= -64) {
          discarded$2 = this.c((byte) -91);
          return this.field_i.b(1423132065) + this.field_m.b(1423132065);
        } else {
          return this.field_i.b(1423132065) + this.field_m.b(1423132065);
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 6) {
            field_e = (he) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return 20 <= this.c((byte) -74) ? true : false;
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            this.field_l = (od) null;
            if (this.a(111) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.a(111) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final cm a(int param0, int param1, byte param2, int param3, boolean param4) {
        long var6 = ((long)param0 << 1464713376) - -(long)param3;
        cm var8 = new cm();
        if (param1 != 11259) {
            return (cm) null;
        }
        var8.field_y = param4 ? true : false;
        var8.field_N = param2;
        var8.field_t = var6;
        if (param4) {
            if (!(-21 < (this.c((byte) -115) ^ -1))) {
                throw new RuntimeException();
            }
            this.field_i.a(var8, 0);
        } else {
            if (!(20 > this.a(100))) {
                throw new RuntimeException();
            }
            this.field_f.a(var8, 0);
        }
        return var8;
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            il var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            bl stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            bl stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            bl stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            bl stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            bl stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            bl stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                if (param2 == 10) {
                  L1: {
                    var3_ref = "";
                    if (param0 == null) {
                      break L1;
                    } else {
                      var3_ref = ca.a(param0, (byte) -36);
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 == null) {
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
                      var3_ref = var3_ref + param1;
                      break L2;
                    }
                  }
                  ll.a(-1054, var3_ref);
                  var7 = qb.a(":", (byte) 127, "%3a", var3_ref);
                  var8 = qb.a("@", (byte) 127, "%40", var7);
                  var9 = qb.a("&", (byte) 127, "%26", var8);
                  var10 = qb.a("#", (byte) 127, "%23", var9);
                  if (j.field_K != null) {
                    L4: {
                      stackOut_11_0 = n.field_h;
                      stackOut_11_1 = 107;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = j.field_K.getCodeBase();
                      stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(vb.field_o).append("&u=");
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      if (null == bi.field_J) {
                        stackOut_13_0 = (bl) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = null;
                        stackOut_13_3 = null;
                        stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                        stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                        stackOut_13_6 = "" + sf.field_l;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        stackIn_14_4 = stackOut_13_4;
                        stackIn_14_5 = stackOut_13_5;
                        stackIn_14_6 = stackOut_13_6;
                        break L4;
                      } else {
                        stackOut_12_0 = (bl) ((Object) stackIn_12_0);
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = null;
                        stackOut_12_3 = null;
                        stackOut_12_4 = (java.net.URL) ((Object) stackIn_12_4);
                        stackOut_12_5 = (StringBuilder) ((Object) stackIn_12_5);
                        stackOut_12_6 = bi.field_J;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_14_4 = stackOut_12_4;
                        stackIn_14_5 = stackOut_12_5;
                        stackIn_14_6 = stackOut_12_6;
                        break L4;
                      }
                    }
                    var4 = ((bl) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + bl.field_n + "&v2=" + bl.field_t + "&e=" + var10));
                    L5: while (true) {
                      if (var4.field_b != 0) {
                        if (var4.field_b == 1) {
                          var5 = (DataInputStream) (var4.field_g);
                          discarded$1 = var5.read();
                          var5.close();
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        kk.a(1L, true);
                        continue L5;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        if (param0 <= 63) {
            return 54;
        }
        return this.field_f.b(1423132065) - -this.field_b.b(1423132065);
    }

    gb() {
        this.field_i = new hl();
        this.field_m = new hl();
        this.field_f = new hl();
        this.field_b = new hl();
        this.field_l = new od(6);
        this.field_c = 0;
        this.field_a = (byte) 0;
        this.field_h = 0;
        this.field_g = new od(10);
    }

    static {
    }
}
