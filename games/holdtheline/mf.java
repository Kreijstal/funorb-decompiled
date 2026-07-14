/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_b;
    private String field_a;

    final static void a(gn param0, int param1) {
        sn var2 = null;
        sn.b(param0.a("", false, "headers.packvorbis"));
        var2 = sn.a(param0, "jagex logo2.packvorbis", "");
        if (param1 != 0) {
          field_b = null;
          el discarded$4 = var2.c();
          return;
        } else {
          el discarded$5 = var2.c();
          return;
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 < 122) {
            return;
        }
        he.a(31536000L, param0, ((mf) this).field_a, -100, "jagex-last-login-method");
    }

    final static int[] a(int param0, byte param1, int param2, int[] param3) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = HoldTheLine.field_D;
        var4 = param3.length;
        var5 = new int[var4];
        var6 = param0 >> -1924186064 & 255;
        var7 = param2 >> -1878944272 & 255;
        var8 = param0 >> 1021813384 & 255;
        var9 = (65280 & param2) >> 736974952;
        var10 = param0 & 255;
        if (param1 <= 90) {
          var16 = null;
          mf.a((ij) null, true);
          var11 = 255 & param2;
          var12 = 0;
          L0: while (true) {
            if (var4 <= var12) {
              return var5;
            } else {
              var13 = param3[var12];
              var14 = (var13 >> -614396280 & 255) * 6 + (((var13 & 16711680) >> 444045680) * 5 + 5 * (255 & var13));
              var5[var12] = kc.a((int)((float)var14 / 4096.0f * (float)(var11 - var10)) + var10, kc.a((int)((float)var14 / 4096.0f * (float)(var9 + -var8)) + var8 << 572642440, var6 + (int)((float)(var7 - var6) * ((float)var14 / 4096.0f)) << 437779696));
              var12++;
              continue L0;
            }
          }
        } else {
          var11 = 255 & param2;
          var12 = 0;
          L1: while (true) {
            if (var4 <= var12) {
              return var5;
            } else {
              var13 = param3[var12];
              var14 = (var13 >> -614396280 & 255) * 6 + (((var13 & 16711680) >> 444045680) * 5 + 5 * (255 & var13));
              var5[var12] = kc.a((int)((float)var14 / 4096.0f * (float)(var11 - var10)) + var10, kc.a((int)((float)var14 / 4096.0f * (float)(var9 + -var8)) + var8 << 572642440, var6 + (int)((float)(var7 - var6) * ((float)var14 / 4096.0f)) << 437779696));
              var12++;
              continue L1;
            }
          }
        }
    }

    final static void a(ij param0, boolean param1) {
        int var2 = 0;
        int var4 = 0;
        ij var5 = null;
        ij var6 = null;
        var4 = HoldTheLine.field_D;
        if (param0.field_o == null) {
          return;
        } else {
          if (0 != param0.field_j) {
            var2 = 0;
            L0: while (true) {
              if (in.field_e <= var2) {
                L1: {
                  if (param0.field_b != null) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ic.a(21325, param0);
                if (param1) {
                  field_b = null;
                  return;
                } else {
                  return;
                }
              } else {
                var6 = lj.field_a[var2];
                if (2 == var6.field_h) {
                  if (param0.field_j == var6.field_j) {
                    if (var6.field_e == param0.field_e) {
                      return;
                    } else {
                      var2++;
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            if (param0.field_e != 0) {
              L2: {
                var2 = 0;
                if (in.field_e <= var2) {
                  break L2;
                } else {
                  L3: {
                    var5 = lj.field_a[var2];
                    if (2 != var5.field_h) {
                      var2++;
                      break L3;
                    } else {
                      L4: {
                        if (param0.field_j != var5.field_j) {
                          var2++;
                          break L4;
                        } else {
                          if (var5.field_e != param0.field_e) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  break L2;
                }
              }
              L5: {
                if (param0.field_b != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              ic.a(21325, param0);
              if (!param1) {
                return;
              } else {
                field_b = null;
                return;
              }
            } else {
              L6: {
                if (param0.field_b != null) {
                  break L6;
                } else {
                  break L6;
                }
              }
              ic.a(21325, param0);
              if (param1) {
                field_b = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -62) {
            mf.a(-12);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        if (!param1) {
          if (oh.field_s[param2] < oh.field_s[param0]) {
            return true;
          } else {
            if (oh.field_s[param0] < oh.field_s[param2]) {
              return false;
            } else {
              if (va.field_j[param2] >= va.field_j[param0]) {
                if (va.field_j[param0] >= va.field_j[param2]) {
                  var4 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
                  var5 = ua.field_c[param0] + da.field_u[param0] - -fj.field_q[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (param3 != 13234) {
                      mf.a(-89);
                      if (var5 >= var4) {
                        if (param2 >= param0) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param2 >= param0) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_27_0 = 1;
                            stackIn_29_0 = stackOut_27_0;
                            break L0;
                          }
                        }
                        return stackIn_29_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (va.field_j[param0] > va.field_j[param2]) {
            return true;
          } else {
            if (va.field_j[param0] < va.field_j[param2]) {
              return false;
            } else {
              if (oh.field_s[param0] <= oh.field_s[param2]) {
                if (oh.field_s[param2] <= oh.field_s[param0]) {
                  var4 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
                  var5 = ua.field_c[param0] + da.field_u[param0] - -fj.field_q[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (param3 == 13234) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param2 >= param0) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L1;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            break L1;
                          }
                        }
                        return stackIn_53_0 != 0;
                      }
                    } else {
                      mf.a(-89);
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param2 >= param0) {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            break L2;
                          } else {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            break L2;
                          }
                        }
                        return stackIn_46_0 != 0;
                      }
                    }
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
    }

    final boolean a(int param0, String param1) {
        if (param0 <= 62) {
            return false;
        }
        return ((mf) this).field_a.equals((Object) (Object) param1);
    }

    mf(String param0) {
        ((mf) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
