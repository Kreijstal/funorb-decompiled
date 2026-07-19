/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends nl {
    static boolean field_H;
    static String field_L;
    static int field_J;
    static int field_K;
    private at field_M;
    static String field_N;
    static String[] field_O;
    static long field_I;
    static String field_P;

    public gk() {
        super(0, 0, te.field_l, ij.field_x, (kh) null, (qo) null);
        this.field_M = new at();
    }

    final void a(int param0, int param1, byte param2, int param3) {
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        bb var8 = null;
        bb var16 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_k == null) {
          var16 = new bb(this.field_M);
          var5 = var16;
          if (param2 <= -82) {
            var6 = (kb) ((Object) var16.a(50));
            L0: while (true) {
              if (var6 != null) {
                var6.a(this.field_B + param0, this.field_p + param1, (byte) -121, param3);
                var6 = (kb) ((Object) var16.b((byte) -112));
                if (var7 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            field_I = -21L;
            var6 = (kb) ((Object) var16.a(50));
            L1: while (true) {
              if (var6 != null) {
                var6.a(this.field_B + param0, this.field_p + param1, (byte) -121, param3);
                var6 = (kb) ((Object) var16.b((byte) -112));
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          this.field_k.a((kb) (this), param0, -80, true, param1);
          var8 = new bb(this.field_M);
          var5 = var8;
          if (param2 <= -82) {
            var6 = (kb) ((Object) var8.a(50));
            L2: while (true) {
              if (var6 != null) {
                var6.a(this.field_B + param0, this.field_p + param1, (byte) -121, param3);
                var6 = (kb) ((Object) var8.b((byte) -112));
                if (var7 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            field_I = -21L;
            var6 = (kb) ((Object) var8.a(50));
            L3: while (true) {
              if (var6 != null) {
                var6.a(this.field_B + param0, this.field_p + param1, (byte) -121, param3);
                var6 = (kb) ((Object) var8.b((byte) -112));
                if (var7 == 0) {
                  continue L3;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final wl a(byte param0) {
        bb var2 = null;
        Object var3 = null;
        wl var3_ref = null;
        int var4 = 0;
        var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new bb(this.field_M);
        if (param0 == 89) {
          var3_ref = (wl) ((Object) var2.c(param0 + -39));
          L0: while (true) {
            if (var3_ref != null) {
              if (var3_ref.field_L) {
                return var3_ref;
              } else {
                var3_ref = (wl) ((Object) var2.b(50));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          field_N = (String) null;
          var3_ref = (wl) ((Object) var2.c(param0 + -39));
          L1: while (true) {
            if (var3_ref != null) {
              if (var3_ref.field_L) {
                return var3_ref;
              } else {
                var3_ref = (wl) ((Object) var2.b(50));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void j(int param0) {
        bb var2 = null;
        wl var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new bb(this.field_M);
        var3 = (wl) ((Object) var2.c(50));
        L0: while (true) {
          if (var3 == null) {
            this.field_E = null;
            if (param0 < -85) {
              return;
            } else {
              this.d((byte) 125);
              return;
            }
          } else {
            var3.field_L = false;
            var3 = (wl) ((Object) var2.b(50));
            if (var4 != 0) {
              if (param0 < -85) {
                return;
              } else {
                this.d((byte) 125);
                return;
              }
            } else {
              if (var4 == 0) {
                continue L0;
              } else {
                this.field_E = null;
                if (param0 < -85) {
                  return;
                } else {
                  this.d((byte) 125);
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        bb var6 = null;
        Object var7 = null;
        wl var7_ref = null;
        int var8 = 0;
        bb var9 = null;
        bb var41 = null;
        var7 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != this.field_l) {
          var4 = (-this.field_l + param0) / 2;
          var5 = (-this.field_w + param1) / 2;
          var41 = new bb(this.field_M);
          var6 = var41;
          var7_ref = (wl) ((Object) var41.c(50));
          if (param2 != -14) {
            this.a(-19, 39, (byte) 87, 16);
            L0: while (true) {
              if (var7_ref == null) {
                this.field_l = param0;
                this.field_w = param1;
                return;
              } else {
                var7_ref.field_p = var7_ref.field_p + var5;
                var7_ref.field_B = var7_ref.field_B + var4;
                var7_ref = (wl) ((Object) var41.b(50));
                if (var8 == 0) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          } else {
            L1: while (true) {
              if (var7_ref == null) {
                this.field_l = param0;
                this.field_w = param1;
                return;
              } else {
                var7_ref.field_p = var7_ref.field_p + var5;
                var7_ref.field_B = var7_ref.field_B + var4;
                var7_ref = (wl) ((Object) var41.b(50));
                if (var8 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (this.field_w != param1) {
            var4 = (-this.field_l + param0) / 2;
            var5 = (-this.field_w + param1) / 2;
            var9 = new bb(this.field_M);
            var6 = var9;
            var7_ref = (wl) ((Object) var9.c(50));
            if (param2 != -14) {
              this.a(-19, 39, (byte) 87, 16);
              L2: while (true) {
                if (var7_ref != null) {
                  var7_ref.field_p = var7_ref.field_p + var5;
                  var7_ref.field_B = var7_ref.field_B + var4;
                  var7_ref = (wl) ((Object) var9.b(50));
                  if (var8 == 0) {
                    continue L2;
                  } else {
                    return;
                  }
                } else {
                  this.field_l = param0;
                  this.field_w = param1;
                  return;
                }
              }
            } else {
              L3: while (true) {
                if (var7_ref != null) {
                  var7_ref.field_p = var7_ref.field_p + var5;
                  var7_ref.field_B = var7_ref.field_B + var4;
                  var7_ref = (wl) ((Object) var9.b(50));
                  if (var8 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                } else {
                  this.field_l = param0;
                  this.field_w = param1;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            rs.field_t = 2;
            qd.field_G = param1;
            var5 = (CharSequence) ((Object) param1);
            wm.field_b = k.a(var5, false);
            hf.field_c = true;
            if (param0 != -23503) {
                gk.a(120, (String) null, 75L);
            }
            dj.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 < 14) {
          field_L = (String) null;
          field_P = null;
          field_L = null;
          field_N = null;
          return;
        } else {
          field_P = null;
          field_L = null;
          field_N = null;
          return;
        }
    }

    final void d(byte param0) {
        bb var2 = null;
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_7_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new bb(this.field_M);
        var3 = (wl) ((Object) var2.c(50));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.a((byte) -1);
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      var3.d(-116);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (wl) ((Object) var2.b(50));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_E = (kb) ((Object) this.a((byte) 89));
            stackOut_7_0 = 94 / ((param0 - 30) / 60);
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          var4 = stackIn_8_0;
          return;
        }
    }

    final void k(int param0) {
        bb var2 = null;
        wl var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new bb(this.field_M);
        if (param0 == 0) {
          var3 = (wl) ((Object) var2.c(50));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.k(122)) {
                    break L1;
                  } else {
                    var3.d(param0 + 37);
                    break L1;
                  }
                }
                var3 = (wl) ((Object) var2.b(param0 ^ 50));
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_M = (at) null;
          var3 = (wl) ((Object) var2.c(50));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.k(122)) {
                    break L3;
                  } else {
                    var3.d(param0 + 37);
                    break L3;
                  }
                }
                var3 = (wl) ((Object) var2.b(param0 ^ 50));
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(kb param0, int param1) {
        boolean discarded$8 = false;
        wl var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 instanceof wl) {
              L1: {
                var3 = (wl) ((Object) param0);
                this.field_M.a(750, var3);
                var3.field_L = true;
                discarded$8 = var3.a(11, (kb) (this));
                if (param1 == 0) {
                  break L1;
                } else {
                  this.field_M = (at) null;
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("gk.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final kb a(int param0) {
        bb var2 = null;
        wl var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_6_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = new bb(this.field_M);
        var3 = (wl) ((Object) var2.c(50));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.field_L;
                stackIn_7_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (!stackIn_3_0) {
                    var3 = (wl) ((Object) var2.b(param0 + 1898));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return var3.e((byte) 119);
                  }
                }
              }
            }
            stackOut_6_0 = param0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          }
          if (stackIn_7_0 == -1848) {
            return null;
          } else {
            field_I = -68L;
            return null;
          }
        }
    }

    static {
        field_N = "First tower";
        field_L = "<%0> and <%1>";
        field_O = new String[]{"zamorak", "saradomin", "guthix"};
        field_P = "Saradomin Strikes Highscores";
    }
}
