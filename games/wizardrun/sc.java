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
        Object var2 = null;
        if (param0 != -76) {
          var2 = null;
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
                    String discarded$2 = sc.a((byte) -101, 's');
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
                    var6 = (Object) (Object) new sg(255, ld.field_e, new si(vk.field_p.field_i, 12000, 0), 2097152);
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
                    var7 = (Object) (Object) new sg(param0, ld.field_e, sl.field_o[param0], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = wi.field_L.a(param3, param1 + -11928, (sg) var7, param0, (sg) var6);
                  if (!param4) {
                    break L6;
                  } else {
                    var8.a((byte) -98);
                    break L6;
                  }
                }
                stackOut_13_0 = new kl((hl) (Object) var8, param5, param2);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
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
        int var2 = 0;
        int var4 = 0;
        wc var5 = null;
        wc var6 = null;
        var4 = wizardrun.field_H;
        if (!param1) {
          if (null != param0.field_h) {
            if (param0.field_c == 0) {
              if (-1 != (param0.field_d ^ -1)) {
                var2 = 0;
                if (ca.field_e > var2) {
                  var6 = mi.field_B[var2];
                  if ((var6.field_i ^ -1) == -3) {
                    if (param0.field_c == var6.field_c) {
                      if (var6.field_d != param0.field_d) {
                        L0: {
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          if (param0.field_l != null) {
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                        ia.a(0, param0);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L1: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (param0.field_l != null) {
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ia.a(0, param0);
                      return;
                    }
                  } else {
                    var2++;
                    L2: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (param0.field_l != null) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ia.a(0, param0);
                    return;
                  }
                } else {
                  L3: {
                    if (param0.field_l != null) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ia.a(0, param0);
                  return;
                }
              } else {
                L4: {
                  if (param0.field_l != null) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ia.a(0, param0);
                return;
              }
            } else {
              var2 = 0;
              if (ca.field_e > var2) {
                var5 = mi.field_B[var2];
                if ((var5.field_i ^ -1) == -3) {
                  if (param0.field_c == var5.field_c) {
                    if (var5.field_d == param0.field_d) {
                      return;
                    } else {
                      L5: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (param0.field_l != null) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ia.a(0, param0);
                      return;
                    }
                  } else {
                    L6: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (param0.field_l != null) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ia.a(0, param0);
                    return;
                  }
                } else {
                  var2++;
                  L7: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (param0.field_l != null) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ia.a(0, param0);
                  return;
                }
              } else {
                L8: {
                  if (param0.field_l != null) {
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ia.a(0, param0);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
            return 94;
        }
        return ac.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creating your account";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_l = "Start Game";
    }
}
