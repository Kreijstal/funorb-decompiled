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
        this.field_B = eo.a("", 7126504, un.field_d, -1, false);
        if (param0 != -38) {
            this.field_B = (hd) null;
        }
    }

    final static void a(int param0, int param1, nu param2, boolean param3) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              jn.field_kb = param1;
              tq.field_F = param2;
              wp.field_c = param0;
              if (param3) {
                break L1;
              } else {
                discarded$2 = sf.c(20, -118);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sf.J(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    private final void e(int param0) {
        js var3 = null;
        if (param0 != 20378) {
          var3 = (js) null;
          this.a(59, false, 46, (js) null);
          this.field_B.a(true, this.field_B.field_q, -180 + f.field_d, 50 + (vc.field_B >> 1328004993), this.field_B.field_mb);
          return;
        } else {
          this.field_B.a(true, this.field_B.field_q, -180 + f.field_d, 50 + (vc.field_B >> 1328004993), this.field_B.field_mb);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        if (param1 >= 99) {
          super.a(param0, 110);
          on.a(this.field_B.field_F + -10, this.field_B.field_T - 20, 20 + this.field_B.field_q, 100 + this.field_B.field_mb, 8, 65793, this.field_E >> 1059378561);
          this.field_B.a(76, param0);
          un.field_d.c(sk.field_b, this.field_B.field_F + (this.field_B.field_q >> -244618911), (this.field_B.field_mb >> -1822431423) + (this.field_B.field_T + -28), 16777215, -1, this.field_E);
          un.field_d.c(jd.field_e.toUpperCase(), (this.field_B.field_q >> -513643007) + this.field_B.field_F, 6 + this.field_B.field_T - -(this.field_B.field_mb >> -1798838303), 16777215, -1, this.field_E);
          discarded$2 = un.field_d.a(ri.field_v.toLowerCase(), this.field_B.field_F, this.field_B.field_mb + this.field_B.field_T, this.field_B.field_q, 80, 16777215, -1, this.field_E, 1, 1, 0);
          if (tu.field_E.field_J[0]) {
            if (!la.a(100)) {
              return;
            } else {
              on.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> -2129015263);
              return;
            }
          } else {
            on.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> -2129015263);
            return;
          }
        } else {
          this.field_B = (hd) null;
          super.a(param0, 110);
          on.a(this.field_B.field_F + -10, this.field_B.field_T - 20, 20 + this.field_B.field_q, 100 + this.field_B.field_mb, 8, 65793, this.field_E >> 1059378561);
          this.field_B.a(76, param0);
          un.field_d.c(sk.field_b, this.field_B.field_F + (this.field_B.field_q >> -244618911), (this.field_B.field_mb >> -1822431423) + (this.field_B.field_T + -28), 16777215, -1, this.field_E);
          un.field_d.c(jd.field_e.toUpperCase(), (this.field_B.field_q >> -513643007) + this.field_B.field_F, 6 + this.field_B.field_T - -(this.field_B.field_mb >> -1798838303), 16777215, -1, this.field_E);
          discarded$3 = un.field_d.a(ri.field_v.toLowerCase(), this.field_B.field_F, this.field_B.field_mb + this.field_B.field_T, this.field_B.field_q, 80, 16777215, -1, this.field_E, 1, 1, 0);
          if (tu.field_E.field_J[0]) {
            if (!la.a(100)) {
              return;
            } else {
              on.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> -2129015263);
              return;
            }
          } else {
            on.a(this.field_B.field_F, this.field_B.field_T, this.field_B.field_q, this.field_B.field_mb, 8, 0, this.field_E >> -2129015263);
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
          var4 = this.field_x.field_e;
          if (-100 != (param0 ^ -1)) {
            if (98 != param0) {
              if (-98 != (param0 ^ -1)) {
                if (param0 != 96) {
                  this.field_x.b(-99);
                  if ((this.field_x.field_e ^ -1) <= -1) {
                    if (!this.field_x.c(-1)) {
                      return true;
                    } else {
                      this.field_i[this.field_x.field_e].a(-1, false);
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
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
                    if ((var4 ^ -1) == -6) {
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
                    if (-1 >= (var5 ^ -1)) {
                      break L4;
                    } else {
                      var5 = 6;
                      break L4;
                    }
                  }
                  this.field_x.a((byte) 68, var5);
                  return true;
                }
              } else {
                L5: {
                  var5 = var4;
                  if (3 != var4) {
                    break L5;
                  } else {
                    var5 = 4;
                    break L5;
                  }
                }
                L6: {
                  if (4 == var4) {
                    var5 = 3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((var4 ^ -1) == -6) {
                    var5 = 6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var4 == 6) {
                    var5 = 5;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (-1 >= (var5 ^ -1)) {
                    break L9;
                  } else {
                    var5 = 6;
                    break L9;
                  }
                }
                this.field_x.a((byte) 68, var5);
                return true;
              }
            } else {
              L10: {
                var5 = -1 + var4;
                if (-1 == (var4 ^ -1)) {
                  var5 = 5;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 4) {
                  var5 = 2;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if ((var4 ^ -1) != -6) {
                  break L12;
                } else {
                  var5 = 3;
                  break L12;
                }
              }
              L13: {
                if (-7 == (var4 ^ -1)) {
                  var5 = 4;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var5 >= 0) {
                  break L14;
                } else {
                  var5 = 6;
                  break L14;
                }
              }
              this.field_x.a((byte) 68, var5);
              return true;
            }
          } else {
            L15: {
              var5 = 1 + var4;
              if (var4 != 3) {
                break L15;
              } else {
                var5 = 5;
                break L15;
              }
            }
            L16: {
              if (4 == var4) {
                var5 = 6;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if ((var4 ^ -1) != -6) {
                break L17;
              } else {
                var5 = 0;
                break L17;
              }
            }
            L18: {
              if (6 != var4) {
                break L18;
              } else {
                var5 = 0;
                break L18;
              }
            }
            L19: {
              if (var5 < 0) {
                var5 = 0;
                break L19;
              } else {
                break L19;
              }
            }
            this.field_x.a((byte) 68, var5);
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
        var3 = -this.field_i[param0].field_d + this.field_i[0].field_d >> 1733467681;
        if (param1 == -22667) {
          if (3 != param0) {
            if (-6 != (param0 ^ -1)) {
              if (param0 != 4) {
                if (-7 == (param0 ^ -1)) {
                  return 190 - -var3;
                } else {
                  return 190;
                }
              } else {
                return 190 - -var3;
              }
            } else {
              return -var3 + 190;
            }
          } else {
            return -var3 + 190;
          }
        } else {
          this.a(false, 58);
          if (3 != param0) {
            if (-6 != (param0 ^ -1)) {
              if (param0 != 4) {
                if (-7 == (param0 ^ -1)) {
                  return 190 - -var3;
                } else {
                  return 190;
                }
              } else {
                return 190 - -var3;
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
        if (param0 != 90) {
          field_D = (String[]) null;
          field_G = null;
          field_D = null;
          return;
        } else {
          field_G = null;
          field_D = null;
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        super.a((byte) 123, param1);
        this.field_B.b(0, param1);
        if (!tu.field_E.field_J[0]) {
          this.field_B.field_gb = false;
          var3 = 46 % ((param0 - 38) / 60);
          if (this.field_B.field_sb == 1) {
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
            this.field_B.field_gb = false;
            var3 = 46 % ((param0 - 38) / 60);
            if (this.field_B.field_sb == 1) {
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
            if (this.field_B.field_sb == 1) {
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
                field_D = (String[]) null;
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
                var3_int = var3_int << 1292833537 | 1 & param1;
                param1 = param1 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "sf.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    sf() {
        this.field_E = 0;
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
            super.a(param0, param1, -96, param3);
            if (param2 >= -28) {
                field_C = (ut) null;
            }
            this.e(20378);
            if (!param1) {
                this.field_E = 256 - (param0 << -271571615);
            } else {
                this.field_E = param0;
            }
            if ((this.field_E ^ -1) < -257) {
                this.field_E = 256;
            }
            if (!(this.field_E >= 0)) {
                this.field_E = 0;
            }
            this.field_B.field_P = this.field_E;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "sf.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new String[]{"Character", "Class", "Stats", "Trinkets", "Price"};
        field_G = "Enter name of friend to add to list";
    }
}
