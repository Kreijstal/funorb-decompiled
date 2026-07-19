/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static volatile boolean field_a;
    static int field_b;
    static wl field_c;

    final static void a(wl param0, int param1, int param2, wl param3) {
        try {
            nb.field_a = param0;
            sb.field_h = param2;
            pb.field_e = param3;
            rk.a(em.field_d / 2, em.field_l / param1, 11710);
            mm.a(param1 + 97, param0.field_x + param0.field_N, param3.field_N, param0.field_N, param3.field_N - -param3.field_x);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ke.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 >= -13) {
            wl var2 = (wl) null;
            ke.a((wl) null, -2, 75, (wl) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        wl var6 = null;
        int stackIn_19_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == 2) {
          if (param3) {
            if (fl.field_k[param2] <= fl.field_k[param0]) {
              if (fl.field_k[param0] <= fl.field_k[param2]) {
                if (th.field_v[param2] <= th.field_v[param0]) {
                  if (th.field_v[param2] >= th.field_v[param0]) {
                    var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                    var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param0 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (th.field_v[param0] >= th.field_v[param2]) {
              if (th.field_v[param2] >= th.field_v[param0]) {
                if (fl.field_k[param0] >= fl.field_k[param2]) {
                  if (fl.field_k[param0] <= fl.field_k[param2]) {
                    var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                    var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param0 >= param2) {
                            stackOut_75_0 = 0;
                            stackIn_76_0 = stackOut_75_0;
                            break L0;
                          } else {
                            stackOut_74_0 = 1;
                            stackIn_76_0 = stackOut_74_0;
                            break L0;
                          }
                        }
                        return stackIn_76_0 != 0;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          var6 = (wl) null;
          ke.a((wl) null, 4, 22, (wl) null);
          if (param3) {
            if (fl.field_k[param2] <= fl.field_k[param0]) {
              if (fl.field_k[param0] <= fl.field_k[param2]) {
                if (th.field_v[param2] <= th.field_v[param0]) {
                  if (th.field_v[param2] < th.field_v[param0]) {
                    return false;
                  } else {
                    var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                    var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param0 >= param2) {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            break L1;
                          } else {
                            stackOut_37_0 = 1;
                            stackIn_39_0 = stackOut_37_0;
                            break L1;
                          }
                        }
                        return stackIn_39_0 != 0;
                      }
                    }
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (th.field_v[param0] >= th.field_v[param2]) {
              if (th.field_v[param2] >= th.field_v[param0]) {
                if (fl.field_k[param0] >= fl.field_k[param2]) {
                  if (fl.field_k[param0] <= fl.field_k[param2]) {
                    var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                    var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param0 >= param2) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L2;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L2;
                          }
                        }
                        return stackIn_19_0 != 0;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        field_a = false;
    }
}
