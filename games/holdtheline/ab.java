/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.lang.String;

class ab extends dc implements pi {
    private boolean field_ob;
    static int field_pb;
    private ea field_rb;
    static int field_jb;
    private boolean field_mb;
    static int field_lb;
    private boolean field_qb;
    private boolean field_kb;
    private qi field_nb;

    final void h(byte param0) {
        if (!((ab) this).field_F) {
          return;
        } else {
          ((ab) this).field_F = false;
          if (((ab) this).field_kb) {
            wh.a((byte) -41);
            if (param0 <= -47) {
              return;
            } else {
              ((ab) this).o(87);
              return;
            }
          } else {
            if (!((ab) this).field_ob) {
              if (param0 > -47) {
                ((ab) this).o(87);
                return;
              } else {
                return;
              }
            } else {
              j.b(58);
              if (param0 <= -47) {
                return;
              } else {
                ((ab) this).o(87);
                return;
              }
            }
          }
        }
    }

    public void a(int param0, rm param1, int param2, int param3, int param4) {
        if (param2 == -4) {
          if (!((ab) this).field_mb) {
            sh.a((byte) -116, en.a(param2 ^ -75), "tochangedisplayname.ws");
            return;
          } else {
            go.a(param2 + 4, 3);
            ((ab) this).h((byte) -89);
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        nh var2 = null;
        ((ab) this).field_rb.a(2121792, 4210752, false);
        var2 = new nh((ab) this, ((ab) this).field_nb, sk.field_b);
        if (param0 > -12) {
          return;
        } else {
          var2.a(15, ge.field_d, (byte) 69);
          ((ab) this).a((n) (Object) var2, (byte) -104);
          return;
        }
    }

    ab(qj param0, qi param1, String param2, boolean param3, boolean param4) {
        super(param0, (n) (Object) new nh((ab) null, param1, param2), 77, 10, 10);
        ((ab) this).field_ob = param4 ? true : false;
        ((ab) this).field_qb = false;
        ((ab) this).field_mb = false;
        ((ab) this).field_kb = param3 ? true : false;
        ((ab) this).field_nb = param1;
        ((ab) this).field_rb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ab) this).field_rb.field_K = true;
        ((ab) this).a(true, (n) (Object) ((ab) this).field_rb);
    }

    final static boolean n(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 103) {
          L0: {
            field_pb = 24;
            if (ak.field_b != sf.field_n) {
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
            if (ak.field_b != sf.field_n) {
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

    final static java.net.URL a(String param0, String param1, java.net.URL param2, byte param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_40_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            var10 = HoldTheLine.field_D;
            var5 = param2.getFile();
            var7 = -22 / ((param3 - -36) / 60);
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var8_int = var5.indexOf('/', var6 - -1);
                    if (var8_int >= 0) {
                      if (-1 < (param4 ^ -1)) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var8_int);
                        continue L0;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var8_int = var5.indexOf('/', 1 + var6);
                    if (-1 >= (var8_int ^ -1)) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var8_int = var5.indexOf('/', var6 - -1);
                    if (0 > var8_int) {
                      break L4;
                    } else {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var8_int);
                        continue L0;
                      } else {
                        var6 = var8_int;
                        continue L0;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var8_int = var5.indexOf('/', 1 + var6);
                  if (0 > var8_int) {
                    break L5;
                  } else {
                    if (param1 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var8_int);
                      continue L0;
                    } else {
                      var6 = var8_int;
                      continue L0;
                    }
                  }
                }
                L7: {
                  var8 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var8.append(var5.substring(0, var6));
                  if (param4 <= 0) {
                    break L7;
                  } else {
                    StringBuilder discarded$10 = var8.append("/l=");
                    StringBuilder discarded$11 = var8.append(Integer.toString(param4));
                    break L7;
                  }
                }
                L8: {
                  if (param0 == null) {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (-1 >= param1.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$12 = var8.append("/s=");
                        StringBuilder discarded$13 = var8.append(param1);
                        break L8;
                      }
                    }
                  } else {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (-1 <= param1.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$14 = var8.append("/s=");
                        StringBuilder discarded$15 = var8.append(param1);
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (var5.length() > var6) {
                    StringBuilder discarded$16 = var8.append(var5.substring(var6, var5.length()));
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var8.append(47);
                    break L9;
                  }
                }
                try {
                  stackOut_39_0 = new java.net.URL(param2, var8.toString());
                  stackIn_40_0 = stackOut_39_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_40_0;
                }
              }
              var6 = var8_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        Object var6 = null;
        if ((param1 ^ -1) != -14) {
          if (param2 != -78) {
            var6 = null;
            ((ab) this).a(-76, (rm) null, 64, 32, -8);
            return super.a(param0, param1, (byte) -78, param3);
          } else {
            return super.a(param0, param1, (byte) -78, param3);
          }
        } else {
          ((ab) this).h((byte) -102);
          return true;
        }
    }

    final static void a(int param0, byte param1) {
        aj.field_d = ei.field_f[param0];
        rg.field_f = lj.field_c[param0];
        pb.field_d = kl.field_r[param0];
        if (param1 <= 76) {
            boolean discarded$0 = ab.n(-60);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        nh var4 = null;
        int var5 = 0;
        nh var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        nh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        nh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        nh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        nh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        nh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        nh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        var5 = HoldTheLine.field_D;
        if (((ab) this).field_qb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if ((param2 ^ -1) != -257) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((ab) this).field_mb = stackIn_6_1 != 0;
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (!param0) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          ((ab) this).field_qb = stackIn_9_1 != 0;
          ((ab) this).field_rb.a(8405024, 4210752, false);
          var6 = new nh((ab) this, ((ab) this).field_nb, param1);
          var4 = var6;
          if (5 == param2) {
            var6.a(11, vn.field_b, (byte) 69);
            var6.a(17, dl.field_n, (byte) 97);
            if (param2 == 3) {
              var6.a(7, ek.field_u, (byte) 122);
              ((ab) this).a((n) (Object) var6, (byte) 79);
              return;
            } else {
              if (-5 != param2) {
                if (-7 == param2) {
                  var6.a(9, gb.field_d, (byte) 68);
                  ((ab) this).a((n) (Object) var6, (byte) 79);
                  return;
                } else {
                  if (-10 != (param2 ^ -1)) {
                    ((ab) this).a((n) (Object) var6, (byte) 79);
                    return;
                  } else {
                    rm discarded$4 = var6.a(49, (tb) this, uh.field_e);
                    ((ab) this).a((n) (Object) var6, (byte) 79);
                    return;
                  }
                }
              } else {
                var6.a(8, vn.field_a, (byte) 65);
                ((ab) this).a((n) (Object) var6, (byte) 79);
                return;
              }
            }
          } else {
            if (param2 == 256) {
              rm discarded$5 = var6.a(88, (tb) this, lg.field_p);
              if (param2 == 3) {
                var6.a(7, ek.field_u, (byte) 122);
                ((ab) this).a((n) (Object) var6, (byte) 79);
                return;
              } else {
                if (-5 != param2) {
                  if (-7 == param2) {
                    var6.a(9, gb.field_d, (byte) 68);
                    ((ab) this).a((n) (Object) var6, (byte) 79);
                    return;
                  } else {
                    if (-10 != (param2 ^ -1)) {
                      ((ab) this).a((n) (Object) var6, (byte) 79);
                      return;
                    } else {
                      rm discarded$6 = var6.a(49, (tb) this, uh.field_e);
                      ((ab) this).a((n) (Object) var6, (byte) 79);
                      return;
                    }
                  }
                } else {
                  var6.a(8, vn.field_a, (byte) 65);
                  ((ab) this).a((n) (Object) var6, (byte) 79);
                  return;
                }
              }
            } else {
              L2: {
                stackOut_11_0 = (nh) var6;
                stackOut_11_1 = -1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (((ab) this).field_kb) {
                  stackOut_13_0 = (nh) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = lg.field_p;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L2;
                } else {
                  stackOut_12_0 = (nh) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = kn.field_i;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L2;
                }
              }
              ((nh) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, (byte) 59);
              if (param2 == 3) {
                var6.a(7, ek.field_u, (byte) 122);
                ((ab) this).a((n) (Object) var6, (byte) 79);
                return;
              } else {
                if (-5 != param2) {
                  if (-7 == param2) {
                    var6.a(9, gb.field_d, (byte) 68);
                    ((ab) this).a((n) (Object) var6, (byte) 79);
                    return;
                  } else {
                    if (-10 != (param2 ^ -1)) {
                      ((ab) this).a((n) (Object) var6, (byte) 79);
                      return;
                    } else {
                      rm discarded$7 = var6.a(49, (tb) this, uh.field_e);
                      ((ab) this).a((n) (Object) var6, (byte) 79);
                      return;
                    }
                  }
                } else {
                  var6.a(8, vn.field_a, (byte) 65);
                  ((ab) this).a((n) (Object) var6, (byte) 79);
                  return;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = -1;
    }
}
