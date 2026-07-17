/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends mv {
    private int field_q;
    static kka field_x;
    static byte[][][] field_o;
    static ee[] field_r;
    static long field_v;
    static String field_u;
    static String field_t;
    static boolean field_w;
    static boolean field_s;
    static String field_p;

    public static void f(byte param0) {
        field_r = null;
        field_t = null;
        field_p = null;
        field_o = null;
        if (param0 > -82) {
          vla.a(117, -79, -10, false);
          field_u = null;
          field_x = null;
          return;
        } else {
          field_u = null;
          field_x = null;
          return;
        }
    }

    final void e(int param0) {
        pp var2 = null;
        ad var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == ~((vla) this).field_k.field_p) {
          return;
        } else {
          var2 = (pp) (Object) ((vla) this).field_k.field_o.b((byte) 90);
          L0: while (true) {
            if (var2 == null) {
              return;
            } else {
              L1: {
                if (var2.field_h == null) {
                  break L1;
                } else {
                  var3 = var2.field_h.a(-27449, ((vla) this).field_l);
                  if (var3.field_f.field_u.field_e) {
                    var3.b(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = (pp) (Object) ((vla) this).field_k.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    vla(gj param0, vja param1) {
        super(param0, param1);
        try {
            ((vla) this).field_q = 64;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(byte param0) {
        aga var3 = null;
        ad var4 = null;
        int var5 = 0;
        Object var6 = null;
        t var6_ref = null;
        var6 = null;
        var6_ref = (t) (Object) al.a(-69, ((vla) this).field_k.field_k);
        var3 = ((vla) this).field_k.field_l.a(125, ((vla) this).field_l.field_h);
        var4 = ((vla) this).field_k.field_l.a(-27449, ((vla) this).field_l);
        ((vla) this).field_l.field_s.a((byte) -57, var3.field_J, var3.field_x);
        if (var3.i(91)) {
          return true;
        } else {
          var5 = -90 % ((71 - param0) / 47);
          int fieldTemp$1 = ((vla) this).field_q - 1;
          ((vla) this).field_q = ((vla) this).field_q - 1;
          if (0 <= fieldTemp$1) {
            if (((vla) this).field_q != 25) {
              L0: {
                if (15 != ((vla) this).field_q) {
                  break L0;
                } else {
                  if (!((vla) this).field_k.d((byte) -75)) {
                    ((vla) this).f(-76);
                    break L0;
                  } else {
                    L1: {
                      if (((vla) this).field_q < 25) {
                        ((vla) this).e(-32);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (((vla) this).field_q != 63) {
                        break L2;
                      } else {
                        if (((vla) this).field_k.d((byte) -90)) {
                          break L2;
                        } else {
                          var4.b(-1, var6_ref.field_o);
                          return false;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              L3: {
                if (((vla) this).field_q < 25) {
                  ((vla) this).e(-32);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((vla) this).field_q != 63) {
                  break L4;
                } else {
                  if (((vla) this).field_k.d((byte) -90)) {
                    break L4;
                  } else {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  }
                }
              }
              return false;
            } else {
              ((vla) this).d((byte) -86);
              mk.a(var6_ref.field_n, -114);
              if (15 == ((vla) this).field_q) {
                L5: {
                  if (!((vla) this).field_k.d((byte) -75)) {
                    ((vla) this).f(-76);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((vla) this).field_q < 25) {
                    ((vla) this).e(-32);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((vla) this).field_q == 63) {
                  if (((vla) this).field_k.d((byte) -90)) {
                    return false;
                  } else {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                L7: {
                  if (((vla) this).field_q < 25) {
                    ((vla) this).e(-32);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (((vla) this).field_q == 63) {
                  if (!((vla) this).field_k.d((byte) -90)) {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            ((vla) this).d(88);
            return true;
          }
        }
    }

    final static int a(int param0, be param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 == -64) {
              if (param1 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                stackOut_7_0 = 50 * param1.field_i.length / pb.field_j;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -77;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("vla.E(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 == 5) {
          if (gm.field_k) {
            L0: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L0;
                }
              }
            }
            if (!param3) {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L1: {
                    if (var5 >= 635) {
                      break L1;
                    } else {
                      if (uga.field_x <= 0) {
                        break L1;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L2: {
                    if (var5 >= 635) {
                      break L2;
                    } else {
                      if (uga.field_x <= 0) {
                        break L2;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              da.field_d.a(param2, 30091, param1);
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L3: {
                    if (var5 >= 635) {
                      break L3;
                    } else {
                      if (uga.field_x <= 0) {
                        break L3;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L4: {
                    if (var5 >= 635) {
                      break L4;
                    } else {
                      if (uga.field_x <= 0) {
                        break L4;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          vla.f((byte) -87);
          if (gm.field_k) {
            L5: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L5;
              } else {
                if (var4 != 0) {
                  break L5;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L5;
                }
              }
            }
            if (param3) {
              da.field_d.a(param2, 30091, param1);
              if (var4 != 0) {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  if (var5 < 635) {
                    if (uga.field_x > 0) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  if (var5 < 635) {
                    if (uga.field_x > 0) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L6: {
                    if (var5 >= 635) {
                      break L6;
                    } else {
                      if (uga.field_x <= 0) {
                        break L6;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  fo.field_a.a(19842, param3);
                  var5 = da.field_d.b(false) + da.field_d.field_D;
                  if (var5 > 640) {
                    uga.field_x = uga.field_x + 5;
                    break L7;
                  } else {
                    if (var5 >= 635) {
                      break L7;
                    } else {
                      if (uga.field_x <= 0) {
                        break L7;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        break L7;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Inviting <%0>";
        field_p = "<%0> turns remaining";
        field_u = "<col=0></col>£<%0>";
    }
}
