/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vq extends dqa implements lca {
    static int field_v;
    static fab field_x;
    private wta field_z;
    static String field_y;
    static String field_w;

    void a(int param0, wta param1) {
        try {
            this.field_z = param1;
            if (param0 <= 73) {
                this.a(68);
            }
            this.field_z.field_c = (vq) (this);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vq.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vq(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract boolean d(int param0);

    abstract int e(int param0);

    final static boolean a(faa param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -28 / ((param1 - 0) / 33);
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = -632;

              if (param2) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              }
            }
            ((faa) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, 1);
            stackIn_4_0 = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("vq.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public final eeb a(int param0) {
        if (param0 != -782444220) {
            this.a(84);
            return (eeb) ((Object) this.field_z);
        }
        return (eeb) ((Object) this.field_z);
    }

    abstract int f(int param0);

    public static void i(byte param0) {
        field_y = null;
        int var1 = -9 / ((35 - param0) / 62);
        field_w = null;
        field_x = null;
    }

    abstract int c(boolean param0);

    final static int g(int param0) {
        try {
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            ds var2 = null;
            if (-5 >= (ff.field_o.field_g ^ -1)) {
              if (0 == (ff.field_o.field_k ^ -1)) {
                return 3;
              } else {
                if (ff.field_o.field_k == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            } else {
              if (param0 == -6269) {
                try {
                  L0: {
                    L1: {
                      if (0 == gob.field_c) {
                        ija.field_b = gia.field_k.a(esa.field_p, hob.field_l, param0 ^ -6201);
                        gob.field_c = gob.field_c + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (1 != gob.field_c) {
                        break L2;
                      } else {
                        if (-3 != (ija.field_b.field_f ^ -1)) {
                          if (-2 == (ija.field_b.field_f ^ -1)) {
                            gob.field_c = gob.field_c + 1;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          stackIn_17_0 = jia.a(-93, -1);
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      if (gob.field_c != 2) {
                        break L3;
                      } else {
                        eu.field_h = new lpb((java.net.Socket) (ija.field_b.field_d), gia.field_k);
                        var2 = new ds(13);
                        jdb.a(nia.field_p, (byte) -48, wlb.field_o, var2, qfa.field_Ib);
                        var2.c(0, 15);
                        var2.d(ea.field_d, 332614536);
                        eu.field_h.a(0, var2.field_h, 13, 0);
                        gob.field_c = gob.field_c + 1;
                        ldb.field_r = 30000L + wt.a(false);
                        break L3;
                      }
                    }
                    L4: {
                      if (gob.field_c != 3) {
                        break L4;
                      } else {
                        if (0 < eu.field_h.c(param0 ^ -6269)) {
                          var1_int = eu.field_h.a(-123);
                          if (var1_int != 0) {
                            stackIn_31_0 = jia.a(-71, var1_int);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            gob.field_c = gob.field_c + 1;
                            break L4;
                          }
                        } else {
                          if ((ldb.field_r ^ -1L) <= (wt.a(false) ^ -1L)) {
                            break L4;
                          } else {
                            stackIn_27_0 = jia.a(-84, -2);
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    if (gob.field_c != 4) {
                      stackIn_37_0 = -1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      ff.field_o.a(eu.field_h, sw.field_f, false);
                      gob.field_c = 0;
                      eu.field_h = null;
                      ija.field_b = null;
                      stackIn_35_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return jia.a(param0 ^ 6182, -3);
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return stackIn_31_0;
                    } else {
                      if (decompiledRegionSelector0 == 3) {
                        return stackIn_35_0;
                      } else {
                        return stackIn_37_0;
                      }
                    }
                  }
                }
              } else {
                return 121;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_v = -1;
        field_y = "Click or press F10 to open Quick Chat";
        field_w = "Playing";
    }
}
