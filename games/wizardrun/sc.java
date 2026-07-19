/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc extends wl {
    int field_k;
    static String field_i;
    boolean field_j;
    static String field_o;
    int[] field_n;
    static jk field_m;
    static String field_l;

    public static void a(byte param0) {
        wc var2 = null;
        if (param0 != -76) {
          var2 = (wc) null;
          sc.a((wc) null, false);
          field_l = null;
          field_i = null;
          field_o = null;
          field_m = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_o = null;
          field_m = null;
          return;
        }
    }

    final static kl a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            String discarded$2 = null;
            Object var6 = null;
            Object var7 = null;
            fh var8 = null;
            kl stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            kl stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  if (param1 == 12000) {
                    break L1;
                  } else {
                    discarded$2 = sc.a((byte) -101, 's');
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (vk.field_p.field_m == null) {
                    break L2;
                  } else {
                    ld.field_e = new si(vk.field_p.field_m, 5200, 0);
                    vk.field_p.field_m = null;
                    var6 = new sg(255, ld.field_e, new si(vk.field_p.field_i, 12000, 0), 2097152);
                    break L2;
                  }
                }
                L3: {
                  if (ld.field_e == null) {
                    break L3;
                  } else {
                    L4: {
                      if (null != sl.field_o) {
                        break L4;
                      } else {
                        sl.field_o = new si[vk.field_p.field_f.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (sl.field_o[param0] == null) {
                        sl.field_o[param0] = new si(vk.field_p.field_f[param0], 12000, 0);
                        vk.field_p.field_f[param0] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = new sg(param0, ld.field_e, sl.field_o[param0], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = wi.field_L.a(param3, param1 + -11928, (sg) (var7), param0, (sg) (var6));
                  if (!param4) {
                    break L6;
                  } else {
                    var8.a((byte) -98);
                    break L6;
                  }
                }
                stackOut_13_0 = new kl(var8, param5, param2);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sc() {
    }

    final static String a(byte param0, char param1) {
        int var2 = -98 % ((param0 - 74) / 47);
        return String.valueOf(param1);
    }

    final static void a(wc param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (!param1) {
              if (null != param0.field_h) {
                L1: {
                  L2: {
                    if (param0.field_c != 0) {
                      break L2;
                    } else {
                      if (-1 != (param0.field_d ^ -1)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (ca.field_e <= var2_int) {
                      break L1;
                    } else {
                      L4: {
                        var3 = mi.field_B[var2_int];
                        if ((var3.field_i ^ -1) != -3) {
                          break L4;
                        } else {
                          if (param0.field_c != var3.field_c) {
                            break L4;
                          } else {
                            if (var3.field_d != param0.field_d) {
                              break L4;
                            } else {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                      var2_int++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  if (param0.field_l != null) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ia.a(0, param0);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("sc.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
            return 94;
        }
        return ac.field_t;
    }

    static {
        field_o = "Creating your account";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_l = "Start Game";
    }
}
