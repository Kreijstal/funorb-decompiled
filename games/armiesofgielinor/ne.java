/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne implements uo {
    int field_h;
    private ha field_d;
    static dn field_f;
    jd field_c;
    boolean field_b;
    int field_g;
    boolean field_l;
    int field_a;
    int field_j;
    ca field_n;
    int[] field_k;
    int field_m;
    static boolean[] field_e;
    static int field_i;

    public static void g(int param0) {
        field_f = null;
        if (param0 >= -19) {
            return;
        }
        field_e = null;
    }

    final static void a(hd param0, Object param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        aa var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_j) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param0.field_j.peekEvent()) {
                      break L2;
                    } else {
                      nu.a(1L, 0);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (null != param1) {
                        param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                L6: {
                  if (param2) {
                    break L6;
                  } else {
                    var5 = (aa) null;
                    ne.a(-21, (aa) null);
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ne.T(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean e(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 < -114) {
          L0: {
            L1: {
              if (this.field_n == null) {
                break L1;
              } else {
                if (0 == (4 & this.field_n.field_c)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_l = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (-1 == (this.field_n.field_c & 2 ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2.equals("unit")) {
                if (param0 <= 0) {
                  break L1;
                } else {
                  this.field_c = a.a(param0, 32, param1);
                  break L1;
                }
              } else {
                if (param2.equals("own")) {
                  if ((param0 ^ -1) >= -1) {
                    break L1;
                  } else {
                    this.field_a = (int)tn.a(false, param0, param1);
                    break L1;
                  }
                } else {
                  if (!param2.equals("type")) {
                    if (!param2.equals("mod")) {
                      break L1;
                    } else {
                      if (param0 <= 0) {
                        break L1;
                      } else {
                        this.field_n = ui.a(param1, param0, 80);
                        break L1;
                      }
                    }
                  } else {
                    if (param0 > 0) {
                      this.field_h = (int)tn.a(false, param0, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param3 == 37) {
                break L2;
              } else {
                this.field_c = (jd) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ne.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if (!(null != this.field_n)) {
            this.field_n = new ca();
        }
        if (!param0) {
            return;
        }
        this.field_n.field_d = param1;
    }

    final boolean k(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            this.l(-61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (-1 == (1 & this.field_n.field_c ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int stackIn_10_0 = 0;
        ha stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ha stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        ha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        ha stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        ha stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        ha stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        ha stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        ha stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        ha stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        ha stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        ha stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        ha stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_d.field_K == null) {
            break L0;
          } else {
            if (param2 != this.field_a) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_c != null) {
            if (!this.field_d.c(this.field_c.field_O, -16985, param2)) {
              stackIn_10_0 = 1;
              break L1;
            } else {
              stackIn_10_0 = 0;
              break L1;
            }
          } else {
            stackIn_10_0 = 0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_10_0;
          if (param3 <= (this.field_a ^ -1)) {
            break L2;
          } else {
            var7 = this.field_h;
            if (7 != var7) {
              if ((var7 ^ -1) != -9) {
                L3: {
                  if (var7 != 14) {
                    if (var7 != 9) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackIn_29_0 = this.field_d;

                  stackIn_29_1 = param2;

                  if (var6 != 0) {
                    stackIn_30_0 = (ha) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = 37;
                    break L4;
                  } else {
                    stackIn_30_0 = (ha) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = 75;
                    break L4;
                  }
                }
                var5 = ((ha) (Object) stackIn_30_0).d(stackIn_30_1, stackIn_30_2, 6);
                dupTemp$0 = this.field_d.o(this.field_a, -1);
                this.field_d.field_S[dupTemp$0] = this.field_d.field_S[dupTemp$0] + 75;
                break L2;
              } else {
                L5: {
                  stackIn_25_0 = this.field_d;

                  stackIn_25_1 = param2;

                  if (var6 != 0) {
                    stackIn_26_0 = (ha) ((Object) stackIn_25_0);
                    stackIn_26_1 = stackIn_25_1;
                    stackIn_26_2 = 12;
                    break L5;
                  } else {
                    stackIn_26_0 = (ha) ((Object) stackIn_25_0);
                    stackIn_26_1 = stackIn_25_1;
                    stackIn_26_2 = 25;
                    break L5;
                  }
                }
                var5 = ((ha) (Object) stackIn_26_0).d(stackIn_26_1, stackIn_26_2, 6);
                dupTemp$1 = this.field_d.o(this.field_a, -1);
                this.field_d.field_S[dupTemp$1] = this.field_d.field_S[dupTemp$1] + 25;
                break L2;
              }
            } else {
              L6: {
                stackIn_21_0 = this.field_d;

                stackIn_21_1 = param2;

                if (var6 != 0) {
                  stackIn_22_0 = (ha) ((Object) stackIn_21_0);
                  stackIn_22_1 = stackIn_21_1;
                  stackIn_22_2 = 25;
                  break L6;
                } else {
                  stackIn_22_0 = (ha) ((Object) stackIn_21_0);
                  stackIn_22_1 = stackIn_21_1;
                  stackIn_22_2 = 50;
                  break L6;
                }
              }
              var5 = ((ha) (Object) stackIn_22_0).d(stackIn_22_1, stackIn_22_2, 6);
              dupTemp$2 = this.field_d.o(this.field_a, -1);
              this.field_d.field_S[dupTemp$2] = this.field_d.field_S[dupTemp$2] + 50;
              break L2;
            }
          }
        }
        if (this.field_d.c(this.field_a, -16985, param2)) {
          L7: {
            if (!this.field_d.field_F) {
              if (param2 == this.field_d.field_sb) {
                stackIn_39_0 = 1;
                break L7;
              } else {
                stackIn_39_0 = 0;
                break L7;
              }
            } else {
              stackIn_39_0 = 1;
              break L7;
            }
          }
          L8: {
            var7 = stackIn_39_0;
            if (this.field_c != null) {
              if (this.field_d.c(this.field_c.field_O, -16985, this.field_a)) {
                stackIn_45_0 = 1;
                break L8;
              } else {
                stackIn_45_0 = 0;
                break L8;
              }
            } else {
              stackIn_45_0 = 0;
              break L8;
            }
          }
          L9: {
            var8 = stackIn_45_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_O != param2) {
                  if (null != this.field_d.field_K) {
                    stackIn_55_0 = 0;
                    break L9;
                  } else {
                    stackIn_55_0 = 1;
                    break L9;
                  }
                } else {
                  stackIn_55_0 = 0;
                  break L9;
                }
              } else {
                stackIn_55_0 = 0;
                break L9;
              }
            } else {
              stackIn_55_0 = 0;
              break L9;
            }
          }
          L10: {
            var9 = stackIn_55_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_t <= this.field_c.field_Y) {
                  stackIn_62_0 = 0;
                  break L10;
                } else {
                  stackIn_62_0 = 1;
                  break L10;
                }
              } else {
                stackIn_62_0 = 0;
                break L10;
              }
            } else {
              stackIn_62_0 = 0;
              break L10;
            }
          }
          L11: {
            var10 = stackIn_62_0;
            if (this.field_c != null) {
              if (var8 == 0) {
                if (this.field_a != -1) {
                  if (this.field_c.i(-21428)) {
                    stackIn_71_0 = 0;
                    break L11;
                  } else {
                    stackIn_71_0 = 1;
                    break L11;
                  }
                } else {
                  stackIn_71_0 = 0;
                  break L11;
                }
              } else {
                stackIn_71_0 = 0;
                break L11;
              }
            } else {
              stackIn_71_0 = 0;
              break L11;
            }
          }
          L12: {
            var11 = stackIn_71_0;
            if (this.field_c != null) {
              if (var8 != 0) {
                if (this.field_c.field_t > this.field_c.field_Y) {
                  if (this.field_c.a(23072)) {
                    stackIn_80_0 = 0;
                    break L12;
                  } else {
                    stackIn_80_0 = 1;
                    break L12;
                  }
                } else {
                  stackIn_80_0 = 0;
                  break L12;
                }
              } else {
                stackIn_80_0 = 0;
                break L12;
              }
            } else {
              stackIn_80_0 = 0;
              break L12;
            }
          }
          L13: {
            L14: {
              var12 = stackIn_80_0;
              var13 = this.field_h;
              if ((var13 ^ -1) != -12) {
                if (-8 == (var13 ^ -1)) {
                  L15: {
                    if (var10 == 0) {
                      break L15;
                    } else {
                      L16: {
                        this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                        if (-1 + this.field_c.field_t <= this.field_c.field_Y) {
                          break L16;
                        } else {
                          this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                          break L16;
                        }
                      }
                      this.field_d.e(14, param1, this.field_a, param0);
                      break L15;
                    }
                  }
                  L17: {
                    if (var11 != 0) {
                      this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var9 == 0) {
                      break L18;
                    } else {
                      this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
                      break L18;
                    }
                  }
                  L19: {
                    stackIn_102_0 = this.field_d;

                    stackIn_102_1 = param2;

                    if (var6 == 0) {
                      stackIn_103_0 = (ha) ((Object) stackIn_102_0);
                      stackIn_103_1 = stackIn_102_1;
                      stackIn_103_2 = 50;
                      break L19;
                    } else {
                      stackIn_103_0 = (ha) ((Object) stackIn_102_0);
                      stackIn_103_1 = stackIn_102_1;
                      stackIn_103_2 = 25;
                      break L19;
                    }
                  }
                  var5 = ((ha) (Object) stackIn_103_0).d(stackIn_103_1, stackIn_103_2, 6);
                  if (var7 != 0) {
                    this.field_d.field_l.a((byte) -119, (tc) (new vp(0, var5, param2)));
                    break L13;
                  } else {
                    L20: {
                      this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
                      if (1000000000 < this.field_d.field_H[param2]) {
                        this.field_d.field_H[param2] = 1000000000;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    dupTemp$3 = this.field_d.o(param2, -1);
                    this.field_d.field_fb[dupTemp$3] = this.field_d.field_fb[dupTemp$3] + var5;
                    if (-1000000001 > (this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1)) {
                      this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                } else {
                  if (-9 == (var13 ^ -1)) {
                    L21: {
                      if (var12 == 0) {
                        break L21;
                      } else {
                        this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                        this.field_d.e(14, param1, this.field_a, param0);
                        break L21;
                      }
                    }
                    L22: {
                      stackIn_115_0 = this.field_d;

                      stackIn_115_1 = param2;

                      if (var6 == 0) {
                        stackIn_116_0 = (ha) ((Object) stackIn_115_0);
                        stackIn_116_1 = stackIn_115_1;
                        stackIn_116_2 = 25;
                        break L22;
                      } else {
                        stackIn_116_0 = (ha) ((Object) stackIn_115_0);
                        stackIn_116_1 = stackIn_115_1;
                        stackIn_116_2 = 12;
                        break L22;
                      }
                    }
                    var5 = ((ha) (Object) stackIn_116_0).d(stackIn_116_1, stackIn_116_2, param3 ^ 6);
                    if (var7 != 0) {
                      this.field_d.field_l.a((byte) -119, (tc) (new vp(2, var5, param2)));
                      break L13;
                    } else {
                      this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
                      dupTemp$4 = this.field_d.o(param2, -1);
                      this.field_d.field_fb[dupTemp$4] = this.field_d.field_fb[dupTemp$4] + var5;
                      if (-1000000001 > (this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1)) {
                        this.field_d.field_fb[this.field_d.o(param2, param3 + -1)] = 1000000000;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    L23: {
                      if (var13 == 14) {
                        break L23;
                      } else {
                        if ((var13 ^ -1) != -10) {
                          break L13;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var12 == 0) {
                        break L24;
                      } else {
                        this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
                        this.field_d.e(param3 + 14, param1, this.field_a, param0);
                        break L24;
                      }
                    }
                    L25: {
                      stackIn_125_0 = this.field_d;

                      stackIn_125_1 = param2;

                      if (var6 == 0) {
                        stackIn_126_0 = (ha) ((Object) stackIn_125_0);
                        stackIn_126_1 = stackIn_125_1;
                        stackIn_126_2 = 75;
                        break L25;
                      } else {
                        stackIn_126_0 = (ha) ((Object) stackIn_125_0);
                        stackIn_126_1 = stackIn_125_1;
                        stackIn_126_2 = 37;
                        break L25;
                      }
                    }
                    var5 = ((ha) (Object) stackIn_126_0).d(stackIn_126_1, stackIn_126_2, 6);
                    if (var7 == 0) {
                      this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5;
                      dupTemp$5 = this.field_d.o(param2, -1);
                      this.field_d.field_fb[dupTemp$5] = this.field_d.field_fb[dupTemp$5] + var5;
                      if ((this.field_d.field_fb[this.field_d.o(param2, -1)] ^ -1) < -1000000001) {
                        this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
                        break L14;
                      } else {
                        break L13;
                      }
                    } else {
                      this.field_d.field_l.a((byte) -119, (tc) (new vp(1, var5, param2)));
                      break L13;
                    }
                  }
                }
              } else {
                L26: {
                  if (var11 == 0) {
                    break L26;
                  } else {
                    this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
                    break L26;
                  }
                }
                if (var9 == 0) {
                  break L14;
                } else {
                  this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
                  break L13;
                }
              }
            }
            break L13;
          }
          return;
        } else {
          return;
        }
    }

    final int b(byte param0) {
        if (!(this.c((byte) -79))) {
            return -1;
        }
        if (param0 > -19) {
            this.field_m = -105;
        }
        if (!((this.field_n.field_b ^ -1) != -256)) {
            return -1;
        }
        return this.field_n.field_b;
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 <= -12) {
            break L0;
          } else {
            this.field_g = 34;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_h ^ -1) == -12) {
              break L2;
            } else {
              if (7 != this.field_h) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final String f(byte param0) {
        String var2;
        int var3;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            var2 = "";
            if (this.field_n == null) {
              break L1;
            } else {
              if (this.field_n.field_e == null) {
                break L1;
              } else {
                var2 = this.field_n.field_e;
                break L0;
              }
            }
          }
          if (jj.field_a.length <= this.field_h) {
            break L0;
          } else {
            L2: {
              if (null == this.field_d) {
                break L2;
              } else {
                if (this.field_d.field_hb == 4) {
                  var2 = dj.field_d[this.field_h];
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var2 = jj.field_a[this.field_h];
            break L0;
          }
        }
        L3: {
          if (this.e((byte) -120)) {
            var2 = var2 + " " + ce.field_P;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 >= 30) {
            break L4;
          } else {
            this.field_a = -35;
            break L4;
          }
        }
        return var2;
    }

    final boolean a(boolean param0) {
        if (param0) {
            this.field_a = -78;
        }
        return ck.a(this.field_h, -12);
    }

    private ne(int param0) {
        this();
        this.field_h = param0;
        this.field_m = this.e(10);
    }

    final void j(int param0) {
        int var2 = -2 % ((param0 - 5) / 44);
        if (!(this.field_h != 11)) {
            this.field_g = this.field_n.field_g;
        }
    }

    final void a(int param0) {
        if (null == this.field_n) {
            this.field_n = new ca();
        }
        if (param0 < 62) {
            return;
        }
        this.field_n.field_c = this.field_n.field_c | 8;
    }

    final int e(int param0) {
        if (param0 != 10) {
            return 18;
        }
        if ((this.field_h ^ -1) != -10 && 14 != this.field_h) {
            return 10;
        }
        return 15;
    }

    final void a(byte param0, ha param1) {
        String var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_d = param1;
              if (param0 == -68) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-103, (bv) null, (String) null, (byte) 0);
                break L1;
              }
            }
            if (param1 != null) {
              L2: {
                this.field_k = new int[this.field_d.field_tb];
                if (this.field_c != null) {
                  this.field_c.field_l = this.field_d;
                  this.field_d.a(8288, this.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ne.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        int var2;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var2 = 89 / ((20 - param0) / 41);
            if (null == this.field_n) {
              break L1;
            } else {
              if (0 == (8 & this.field_n.field_c)) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean l(int param0) {
        if (param0 != -1) {
            this.field_c = (jd) null;
        }
        return this.field_m != this.e(10) ? true : false;
    }

    final int a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        if (this.field_k == null) {
          return 0;
        } else {
          L0: {
            var5 = 0;
            if (param0 == 97) {
              break L0;
            } else {
              this.field_b = false;
              break L0;
            }
          }
          L1: while (true) {
            if (this.field_k.length <= var5) {
              return var4;
            } else {
              if (param1 < 0) {
                var4 = var4 | this.field_k[var5];
                var5++;
                continue L1;
              } else {
                if (param2 == var5) {
                  var4 = var4 | 16 & this.field_k[var5];
                  var5++;
                  continue L1;
                } else {
                  var4 = var4 | 15 & this.field_k[var5];
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final boolean c(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -79) {
            break L0;
          } else {
            this.field_j = -3;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n == null) {
              break L2;
            } else {
              if (0 == (16 & this.field_n.field_c)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(boolean param0, int param1) {
        if (this.field_n == null) {
            this.field_n = new ca();
        }
        if (!param0) {
            field_f = (dn) null;
        }
        this.field_n.field_b = param1;
        this.field_n.field_c = this.field_n.field_c | 16;
    }

    final void d(byte param0) {
        if (param0 < 42) {
            this.a(13, -128, -104, -117);
        }
        this.field_n.field_c = this.field_n.field_c & -2;
    }

    final void i(int param0) {
        if (!(this.field_n != null)) {
            return;
        }
        this.field_n.field_c = this.field_n.field_c & -9;
        if (param0 != 14) {
            this.field_g = 118;
        }
    }

    final static te a(int param0, aa param1) {
        te var2 = null;
        RuntimeException var2_ref = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new te(param1, param1);
            bl.field_h.a((byte) -119, (tc) (var2));
            if (param0 <= -35) {
              ig.field_n.a(param1);
              stackIn_4_0 = (te) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (te) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("ne.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 928) {
          L0: {
            L1: {
              if (3 == this.field_h) {
                break L1;
              } else {
                if (-3 != (this.field_h ^ -1)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final int a(byte param0) {
        if (param0 != -107) {
            this.field_j = -71;
        }
        if (this.field_n != null) {
            return this.field_n.field_d;
        }
        return 0;
    }

    final boolean a(int param0, byte param1) {
        if (param1 != 91) {
            this.field_l = true;
        }
        return this.field_d.c(this.field_a, param1 + -17076, param0);
    }

    final void a(int param0, int param1) {
        int var3 = -116 % ((-35 - param0) / 61);
        this.field_m = this.e(10);
        if (this.field_h != 11) {
            this.field_a = param1;
        } else {
            if (!(null == this.field_d.field_K)) {
                this.field_b = true;
            }
            this.field_a = -1;
            this.field_h = 0;
        }
    }

    ne(int param0, ha param1) {
        this(param0);
        try {
            this.a((byte) -68, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != 19725) {
            this.d((byte) -22);
        }
        return !this.a(false) ? true : false;
    }

    ne() {
        this.field_l = false;
        this.field_b = false;
        this.field_a = -1;
        this.field_m = 10;
        this.field_c = null;
        this.field_g = -1;
        this.field_a = -1;
        this.field_d = null;
        this.field_j = 0;
        this.field_k = null;
    }

    static {
        field_i = -1;
    }
}
