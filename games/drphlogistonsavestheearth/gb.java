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
        if (param0 >= -64) {
          this.c((byte) -91);
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
        if (param0 != 20) {
          L0: {
            this.field_l = (od) null;
            if (this.a(111) < 20) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.a(111) < 20) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
            bl stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            bl stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            String stackIn_14_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            il var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                if (param2 == 10) {
                  L1: {
                    var3 = "";
                    if (param0 == null) {
                      break L1;
                    } else {
                      var3 = ca.a(param0, (byte) -36);
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
                          var3 = var3 + " | ";
                          break L3;
                        }
                      }
                      var3 = var3 + param1;
                      break L2;
                    }
                  }
                  ll.a(-1054, var3);
                  var7 = qb.a(":", (byte) 127, "%3a", var3);
                  var8 = qb.a("@", (byte) 127, "%40", var7);
                  var9 = qb.a("&", (byte) 127, "%26", var8);
                  var10 = qb.a("#", (byte) 127, "%23", var9);
                  if (j.field_K != null) {
                    L4: {
                      stackIn_13_0 = n.field_h;

                      stackIn_13_1 = 107;

                      stackIn_13_2 = null;

                      stackIn_13_3 = null;

                      stackIn_13_4 = j.field_K.getCodeBase();

                      stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(vb.field_o).append("&u=");

                      if (null == bi.field_J) {
                        stackIn_14_0 = (bl) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = null;
                        stackIn_14_3 = null;
                        stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                        stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                        stackIn_14_6 = "" + sf.field_l;
                        break L4;
                      } else {
                        stackIn_14_0 = (bl) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = null;
                        stackIn_14_3 = null;
                        stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                        stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                        stackIn_14_6 = bi.field_J;
                        break L4;
                      }
                    }
                    var4 = ((bl) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + bl.field_n + "&v2=" + bl.field_t + "&e=" + var10));
                    L5: while (true) {
                      if (var4.field_b != 0) {
                        if (var4.field_b == 1) {
                          var5 = (DataInputStream) (var4.field_g);
                          var5.read();
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
              var3_ref = (Exception) (Object) decompiledCaughtException;
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
