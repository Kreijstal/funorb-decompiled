/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends qt {
    private hd field_B;
    static hu field_F;
    static ut field_C;
    private int field_E;
    static String field_G;
    static String[] field_D;

    final void b(int param0) {
        ((sf) this).field_B = eo.a("", 7126504, (hu) (Object) un.field_d, -1, false);
        if (param0 != -38) {
            ((sf) this).field_B = null;
        }
    }

    final static void a(int param0, int param1, nu param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          jn.field_kb = param1;
          tq.field_F = param2;
          wp.field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("sf.J(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 1 + 41);
        }
    }

    private final void e(int param0) {
        Object var3 = null;
        if (param0 != 20378) {
          var3 = null;
          ((sf) this).a(59, false, 46, (js) null);
          ((sf) this).field_B.a(true, ((sf) this).field_B.field_q, -180 + f.field_d, 50 + (vc.field_B >> 1), ((sf) this).field_B.field_mb);
          return;
        } else {
          ((sf) this).field_B.a(true, ((sf) this).field_B.field_q, -180 + f.field_d, 50 + (vc.field_B >> 1), ((sf) this).field_B.field_mb);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 >= 99) {
          super.a(param0, 110);
          on.a(((sf) this).field_B.field_F + -10, ((sf) this).field_B.field_T - 20, 20 + ((sf) this).field_B.field_q, 100 + ((sf) this).field_B.field_mb, 8, 65793, ((sf) this).field_E >> 1);
          ((sf) this).field_B.a(76, param0);
          un.field_d.c(sk.field_b, ((sf) this).field_B.field_F + (((sf) this).field_B.field_q >> 1), (((sf) this).field_B.field_mb >> 1) + (((sf) this).field_B.field_T + -28), 16777215, -1, ((sf) this).field_E);
          un.field_d.c(jd.field_e.toUpperCase(), (((sf) this).field_B.field_q >> 1) + ((sf) this).field_B.field_F, 6 + ((sf) this).field_B.field_T - -(((sf) this).field_B.field_mb >> 1), 16777215, -1, ((sf) this).field_E);
          int discarded$2 = un.field_d.a(ri.field_v.toLowerCase(), ((sf) this).field_B.field_F, ((sf) this).field_B.field_mb + ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, 80, 16777215, -1, ((sf) this).field_E, 1, 1, 0);
          if (tu.field_E.field_J[0]) {
            if (!la.a(100)) {
              return;
            } else {
              on.a(((sf) this).field_B.field_F, ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, ((sf) this).field_B.field_mb, 8, 0, ((sf) this).field_E >> 1);
              return;
            }
          } else {
            on.a(((sf) this).field_B.field_F, ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, ((sf) this).field_B.field_mb, 8, 0, ((sf) this).field_E >> 1);
            return;
          }
        } else {
          ((sf) this).field_B = null;
          super.a(param0, 110);
          on.a(((sf) this).field_B.field_F + -10, ((sf) this).field_B.field_T - 20, 20 + ((sf) this).field_B.field_q, 100 + ((sf) this).field_B.field_mb, 8, 65793, ((sf) this).field_E >> 1);
          ((sf) this).field_B.a(76, param0);
          un.field_d.c(sk.field_b, ((sf) this).field_B.field_F + (((sf) this).field_B.field_q >> 1), (((sf) this).field_B.field_mb >> 1) + (((sf) this).field_B.field_T + -28), 16777215, -1, ((sf) this).field_E);
          un.field_d.c(jd.field_e.toUpperCase(), (((sf) this).field_B.field_q >> 1) + ((sf) this).field_B.field_F, 6 + ((sf) this).field_B.field_T - -(((sf) this).field_B.field_mb >> 1), 16777215, -1, ((sf) this).field_E);
          int discarded$3 = un.field_d.a(ri.field_v.toLowerCase(), ((sf) this).field_B.field_F, ((sf) this).field_B.field_mb + ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, 80, 16777215, -1, ((sf) this).field_E, 1, 1, 0);
          if (tu.field_E.field_J[0]) {
            if (!la.a(100)) {
              return;
            } else {
              on.a(((sf) this).field_B.field_F, ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, ((sf) this).field_B.field_mb, 8, 0, ((sf) this).field_E >> 1);
              return;
            }
          } else {
            on.a(((sf) this).field_B.field_F, ((sf) this).field_B.field_T, ((sf) this).field_B.field_q, ((sf) this).field_B.field_mb, 8, 0, ((sf) this).field_E >> 1);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (param1 < -5) {
          var4 = ((sf) this).field_x.field_e;
          if (param0 != 99) {
            if (98 != param0) {
              if (param0 == 97) {
                L0: {
                  var5 = var4;
                  if (3 != var4) {
                    break L0;
                  } else {
                    var5 = 4;
                    break L0;
                  }
                }
                L1: {
                  if (4 == var4) {
                    var5 = 3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 == 5) {
                    var5 = 6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var4 == 6) {
                    var5 = 5;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 >= 0) {
                    break L4;
                  } else {
                    var5 = 6;
                    break L4;
                  }
                }
                ((sf) this).field_x.a((byte) 68, var5);
                return true;
              } else {
                if (param0 != 96) {
                  L5: {
                    ((sf) this).field_x.b(-99);
                    if (((sf) this).field_x.field_e < 0) {
                      break L5;
                    } else {
                      if (((sf) this).field_x.c(-1)) {
                        ((sf) this).field_i[((sf) this).field_x.field_e].a(-1, false);
                        break L5;
                      } else {
                        return true;
                      }
                    }
                  }
                  return true;
                } else {
                  L6: {
                    var5 = var4;
                    if (3 != var4) {
                      break L6;
                    } else {
                      var5 = 4;
                      break L6;
                    }
                  }
                  L7: {
                    if (4 == var4) {
                      var5 = 3;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var4 == 5) {
                      var5 = 6;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var4 == 6) {
                      var5 = 5;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 >= 0) {
                      break L10;
                    } else {
                      var5 = 6;
                      break L10;
                    }
                  }
                  ((sf) this).field_x.a((byte) 68, var5);
                  return true;
                }
              }
            } else {
              L11: {
                var5 = -1 + var4;
                if (var4 == 0) {
                  var5 = 5;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 4) {
                  var5 = 2;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 != 5) {
                  break L13;
                } else {
                  var5 = 3;
                  break L13;
                }
              }
              L14: {
                if (var4 == 6) {
                  var5 = 4;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var5 >= 0) {
                  break L15;
                } else {
                  var5 = 6;
                  break L15;
                }
              }
              ((sf) this).field_x.a((byte) 68, var5);
              return true;
            }
          } else {
            L16: {
              var5 = 1 + var4;
              if (var4 != 3) {
                break L16;
              } else {
                var5 = 5;
                break L16;
              }
            }
            L17: {
              if (4 == var4) {
                var5 = 6;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (var4 != 5) {
                break L18;
              } else {
                var5 = 0;
                break L18;
              }
            }
            L19: {
              if (6 != var4) {
                break L19;
              } else {
                var5 = 0;
                break L19;
              }
            }
            L20: {
              if (var5 < 0) {
                var5 = 0;
                break L20;
              } else {
                break L20;
              }
            }
            ((sf) this).field_x.a((byte) 68, var5);
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean c(int param0, int param1) {
        if (param1 == -1) {
          if (param0 != cq.field_h.field_c) {
            if (ra.field_G != null) {
              if (ra.field_G.field_c == param0) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (ra.field_G != null) {
              if (ra.field_G != null) {
                if (ra.field_G.field_c != param0) {
                  return false;
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
          return true;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.e(param0 ^ 20378);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        var3 = -((sf) this).field_i[param0].field_d + ((sf) this).field_i[0].field_d >> 1;
        if (param1 == -22667) {
          if (3 != param0) {
            if (param0 != 5) {
              if (param0 == 4) {
                return 190 - -var3;
              } else {
                if (param0 != 6) {
                  return 190;
                } else {
                  return 190 - -var3;
                }
              }
            } else {
              return -var3 + 190;
            }
          } else {
            return -var3 + 190;
          }
        } else {
          ((sf) this).a(false, 58);
          if (3 != param0) {
            if (param0 != 5) {
              if (param0 == 4) {
                return 190 - -var3;
              } else {
                if (param0 != 6) {
                  return 190;
                } else {
                  return 190 - -var3;
                }
              }
            } else {
              return -var3 + 190;
            }
          } else {
            return -var3 + 190;
          }
        }
    }

    public static void f(int param0) {
        field_F = null;
        field_C = null;
        field_G = null;
        field_D = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        super.a((byte) 123, param1);
        ((sf) this).field_B.b(0, param1);
        if (!tu.field_E.field_J[0]) {
          ((sf) this).field_B.field_gb = false;
          var3 = 46 % ((param0 - 38) / 60);
          if (((sf) this).field_B.field_sb == 1) {
            ii.a((byte) -117);
            if (!la.a(100)) {
              if (tu.field_E.field_J[0]) {
                if (!tu.field_E.d((byte) 116)) {
                  tb.a((byte) 126, 5);
                  return;
                } else {
                  or.field_d.b(90, (byte) 93);
                  jm.a(26, true, -2);
                  return;
                }
              } else {
                tb.a((byte) 126, 40);
                return;
              }
            } else {
              qt.a(16144);
              return;
            }
          } else {
            return;
          }
        } else {
          if (la.a(100)) {
            ((sf) this).field_B.field_gb = false;
            var3 = 46 % ((param0 - 38) / 60);
            if (((sf) this).field_B.field_sb == 1) {
              ii.a((byte) -117);
              if (!la.a(100)) {
                if (tu.field_E.field_J[0]) {
                  if (!tu.field_E.d((byte) 116)) {
                    tb.a((byte) 126, 5);
                    return;
                  } else {
                    or.field_d.b(90, (byte) 93);
                    jm.a(26, true, -2);
                    return;
                  }
                } else {
                  tb.a((byte) 126, 40);
                  return;
                }
              } else {
                qt.a(16144);
                return;
              }
            } else {
              return;
            }
          } else {
            var3 = 46 % ((param0 - 38) / 60);
            if (((sf) this).field_B.field_sb == 1) {
              ii.a((byte) -117);
              if (!la.a(100)) {
                if (tu.field_E.field_J[0]) {
                  if (!tu.field_E.d((byte) 116)) {
                    tb.a((byte) 126, 5);
                    return;
                  } else {
                    or.field_d.b(90, (byte) 93);
                    jm.a(26, true, -2);
                    return;
                  }
                } else {
                  tb.a((byte) 126, 40);
                  return;
                }
              } else {
                qt.a(16144);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = -79 % ((-49 - param0) / 52);
          if (param1 > 3) {
            param1--;
            break L0;
          } else {
            break L0;
          }
        }
        if (4 < param1) {
          param1--;
          return super.a(79, param1);
        } else {
          return super.a(79, param1);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -5974) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (0 >= param2) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param1;
                param1 = param1 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "sf.H(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    sf() {
        ((sf) this).field_E = 0;
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
            super.a(param0, param1, -96, param3);
            if (param2 >= -28) {
                field_C = null;
            }
            this.e(20378);
            if (!param1) {
                ((sf) this).field_E = 256 - (param0 << 1);
            } else {
                ((sf) this).field_E = param0;
            }
            if (((sf) this).field_E > 256) {
                ((sf) this).field_E = 256;
            }
            if (!(((sf) this).field_E >= 0)) {
                ((sf) this).field_E = 0;
            }
            ((sf) this).field_B.field_P = ((sf) this).field_E;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "sf.F(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new String[]{"Character", "Class", "Stats", "Trinkets", "Price"};
        field_G = "Enter name of friend to add to list";
    }
}
