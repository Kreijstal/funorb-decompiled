/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends sn {
    static String field_A;
    private int field_y;
    private int field_E;
    private int[] field_t;
    private si field_D;
    private db field_z;
    private boolean field_w;
    private si field_B;
    static String field_G;
    private db field_H;
    private int[] field_F;
    static int field_x;
    private boolean field_C;
    private si field_u;
    private db field_v;
    private int field_r;
    private int field_s;

    final static void f(int param0) {
        kb.field_e.field_m = 0;
        kb.field_e.field_j = 0;
        if (param0 != -1) {
            field_A = (String) null;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -50) {
            return;
        }
        this.field_s = param0;
    }

    final static int a(int param0, int param1, int param2) {
        er[] discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param2 == 1) {
                break L1;
              } else {
                discarded$2 = fk.c(-114, 68, -107);
                break L1;
              }
            }
            L2: while (true) {
              if (param0 <= 0) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = 1 & param1 | var3_int << 942871553;
                param1 = param1 >>> 1;
                param0--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "fk.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static java.awt.Container a(byte param0) {
        java.awt.Container discarded$0 = null;
        if (!(eo.field_k == null)) {
            return (java.awt.Container) ((Object) eo.field_k);
        }
        if (param0 <= 83) {
            discarded$0 = fk.a((byte) -30);
        }
        return (java.awt.Container) ((Object) ob.e((byte) 116));
    }

    public static void e(int param0) {
        int discarded$0 = 0;
        field_A = null;
        field_G = null;
        if (param0 != -257) {
            discarded$0 = fk.b(-46, -110, -105);
        }
    }

    private final void a(int param0, int param1, db param2, int param3) {
        try {
            param2.a(param1, param0, (byte) -61);
            param2.c((byte) 119, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -118) {
            return 88;
        }
        if (4096 > param1) {
            return param1 >= 2048 ? -jc.field_b[param1 - 2048] : jc.field_b[-param1 + 2048];
        }
        return -6145 < (param1 ^ -1) ? -jc.field_b[-param1 + 6144] : jc.field_b[param1 + -6144];
    }

    final sn a() {
        return null;
    }

    final synchronized void a(si param0, int param1, int param2, boolean param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_35_0 = 0;
        db stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        si stackIn_44_2 = null;
        db stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        si stackIn_45_2 = null;
        db stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        si stackIn_46_2 = null;
        int stackIn_46_3 = 0;
        db stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        si stackIn_54_2 = null;
        db stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        si stackIn_55_2 = null;
        db stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        si stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        db stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        si stackOut_53_2 = null;
        db stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        si stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        db stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        si stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        db stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        si stackOut_43_2 = null;
        db stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        si stackOut_45_2 = null;
        int stackOut_45_3 = 0;
        db stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        si stackOut_44_2 = null;
        int stackOut_44_3 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_w) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if ((this.field_y ^ -1) < -1) {
                      L3: {
                        if (this.field_B != null) {
                          this.field_v.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_B = param0;
                      if (param0 != null) {
                        this.field_v.a(-68, param0, false);
                        this.a(-1, param5, this.field_v, param2);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == this.field_u) {
                          break L4;
                        } else {
                          this.field_H.a(true);
                          break L4;
                        }
                      }
                      this.field_u = param0;
                      if (param0 != null) {
                        this.field_H.a(-19, param0, false);
                        this.a(-1, param5, this.field_H, param2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param3) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            ((fk) (this)).field_w = stackIn_20_1 != 0;
            if (param0 != this.field_B) {
              if (param0 == this.field_u) {
                this.field_y = -param1;
                this.a(-1, param5, this.field_H, param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L6: {
                  if (param4 > 56) {
                    break L6;
                  } else {
                    this.field_B = (si) null;
                    break L6;
                  }
                }
                L7: {
                  if (null == this.field_B) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null != this.field_u) {
                      L8: {
                        if ((this.field_r ^ -1) <= -524289) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L8;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_35_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (this.field_u != null) {
                        this.field_H.a(true);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_u = param0;
                      if (param0 != null) {
                        L12: {
                          stackOut_53_0 = this.field_H;
                          stackOut_53_1 = -34;
                          stackOut_53_2 = (si) (param0);
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          stackIn_55_2 = stackOut_53_2;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          stackIn_54_2 = stackOut_53_2;
                          if (param3) {
                            stackOut_55_0 = (db) ((Object) stackIn_55_0);
                            stackOut_55_1 = stackIn_55_1;
                            stackOut_55_2 = (si) ((Object) stackIn_55_2);
                            stackOut_55_3 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            stackIn_56_2 = stackOut_55_2;
                            stackIn_56_3 = stackOut_55_3;
                            break L12;
                          } else {
                            stackOut_54_0 = (db) ((Object) stackIn_54_0);
                            stackOut_54_1 = stackIn_54_1;
                            stackOut_54_2 = (si) ((Object) stackIn_54_2);
                            stackOut_54_3 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            stackIn_56_1 = stackOut_54_1;
                            stackIn_56_2 = stackOut_54_2;
                            stackIn_56_3 = stackOut_54_3;
                            break L12;
                          }
                        }
                        ((db) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3 != 0);
                        this.a(-1, param5, this.field_H, param2);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_y = -param1;
                    break L9;
                  } else {
                    L13: {
                      if (this.field_B != null) {
                        this.field_v.a(true);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      this.field_B = param0;
                      if (param0 != null) {
                        L15: {
                          stackOut_43_0 = this.field_v;
                          stackOut_43_1 = -82;
                          stackOut_43_2 = (si) (param0);
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_45_2 = stackOut_43_2;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          if (param3) {
                            stackOut_45_0 = (db) ((Object) stackIn_45_0);
                            stackOut_45_1 = stackIn_45_1;
                            stackOut_45_2 = (si) ((Object) stackIn_45_2);
                            stackOut_45_3 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            stackIn_46_2 = stackOut_45_2;
                            stackIn_46_3 = stackOut_45_3;
                            break L15;
                          } else {
                            stackOut_44_0 = (db) ((Object) stackIn_44_0);
                            stackOut_44_1 = stackIn_44_1;
                            stackOut_44_2 = (si) ((Object) stackIn_44_2);
                            stackOut_44_3 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            stackIn_46_1 = stackOut_44_1;
                            stackIn_46_2 = stackOut_44_2;
                            stackIn_46_3 = stackOut_44_3;
                            break L15;
                          }
                        }
                        ((db) (Object) stackIn_46_0).a(stackIn_46_1, stackIn_46_2, stackIn_46_3 != 0);
                        this.a(-1, param5, this.field_v, param2);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_y = param1;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              this.field_y = param1;
              this.a(-1, param5, this.field_v, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) (var7);
            stackOut_59_1 = new StringBuilder().append("fk.L(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L16;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (-1 > (this.field_s ^ -1)) {
              L1: {
                if (!this.field_w) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_y <= 0) {
                      break L2;
                    } else {
                      if (!this.field_v.g(-26083)) {
                        this.field_w = false;
                        this.field_B = null;
                        this.field_y = -this.field_y;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-1 >= (this.field_y ^ -1)) {
                    break L1;
                  } else {
                    if (!this.field_H.g(-26083)) {
                      this.field_u = null;
                      this.field_y = -this.field_y;
                      this.field_w = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_r >> 2031964492) * this.field_s / 256;
                var5 = this.field_s - var4_int;
                if (0 != this.field_y) {
                  this.field_r = this.field_r + param2 * this.field_y;
                  if (this.field_r < 1048576) {
                    if (-1 <= (this.field_r ^ -1)) {
                      this.field_r = 0;
                      if (this.field_w) {
                        break L3;
                      } else {
                        this.field_y = 0;
                        if (!this.field_C) {
                          L4: {
                            if (null != this.field_B) {
                              this.field_v.a(true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_B = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_r = 1048576;
                    if (!this.field_w) {
                      this.field_y = 0;
                      if (this.field_C) {
                        break L3;
                      } else {
                        L5: {
                          if (null == this.field_u) {
                            break L5;
                          } else {
                            this.field_H.a(true);
                            break L5;
                          }
                        }
                        this.field_u = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (dd.field_h) {
                  stackOut_33_0 = param2 << 831041921;
                  stackIn_34_0 = stackOut_33_0;
                  break L6;
                } else {
                  stackOut_32_0 = param2;
                  stackIn_34_0 = stackOut_32_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (256 > this.field_E) {
                  L8: {
                    if (this.field_B != null) {
                      break L8;
                    } else {
                      if (this.field_u != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-257 == (var4_int ^ -1)) {
                    this.field_v.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (-257 == (var5 ^ -1)) {
                      this.field_H.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_t == null) {
                            break L10;
                          } else {
                            if (var6 > this.field_t.length) {
                              break L10;
                            } else {
                              qq.a(this.field_t, 0, var6);
                              qq.a(this.field_F, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_t = new int[var6];
                        this.field_F = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_v.b(this.field_t, 0, param2);
                        this.field_H.b(this.field_F, 0, param2);
                        if (!dd.field_h) {
                          stackOut_47_0 = param1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_F[var8] * var5 + this.field_t[var8] * var4_int >> -1150349912);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (this.field_D == null) {
                  break L13;
                } else {
                  if (0 == this.field_E) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (null == this.field_t) {
                          break L15;
                        } else {
                          if (var6 <= this.field_t.length) {
                            qq.a(this.field_t, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_t = new int[var6];
                      this.field_F = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_z.b(this.field_t, 0, param2);
                      if (dd.field_h) {
                        param1 = param1 << 1;
                        stackOut_62_0 = param1 << 1;
                        stackIn_63_0 = stackOut_62_0;
                        break L16;
                      } else {
                        stackOut_61_0 = param1;
                        stackIn_63_0 = stackOut_61_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_63_0;
                    var8 = this.field_s * this.field_E / 256;
                    var9 = -var8 + this.field_s;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = var9 * param0[var7 + var10] + var8 * this.field_t[var10] >> -659799704;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var4);
            stackOut_67_1 = new StringBuilder().append("fk.G(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var3 = null;
        long var4 = 0L;
        tb.field_b = true;
        String var2 = "tuhstatbut";
        if (param1 != 11514) {
            return;
        }
        try {
            var3 = "rvnadlm";
            var4 = -1L;
            gl.a(-11, var4, param0, var3, var2);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized int d() {
        return 2;
    }

    final static er[] c(int param0, int param1, int param2) {
        if (param0 > -126) {
            return (er[]) null;
        }
        return ca.a((byte) -123, param1, 1, param2);
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (0 >= this.field_r) {
            break L0;
          } else {
            if (this.field_B != null) {
              this.field_v.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((this.field_r ^ -1) <= -1048577) {
            if ((this.field_E ^ -1) >= -1) {
              break L1;
            } else {
              if (this.field_D == null) {
                break L1;
              } else {
                this.field_z.a(param0);
                break L1;
              }
            }
          } else {
            if ((this.field_E ^ -1) >= -1) {
              break L1;
            } else {
              if (this.field_D == null) {
                break L1;
              } else {
                this.field_z.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_w) {
            L3: {
              if ((this.field_y ^ -1) >= -1) {
                break L3;
              } else {
                if (!this.field_v.g(-26083)) {
                  this.field_B = null;
                  this.field_w = false;
                  this.field_y = -this.field_y;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if ((this.field_y ^ -1) <= -1) {
              break L2;
            } else {
              if (this.field_H.g(-26083)) {
                break L2;
              } else {
                this.field_y = -this.field_y;
                this.field_u = null;
                this.field_w = false;
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (this.field_y == 0) {
            break L4;
          } else {
            this.field_r = this.field_r + this.field_y * param0;
            if ((this.field_r ^ -1) <= -1048577) {
              this.field_r = 1048576;
              if (this.field_w) {
                break L4;
              } else {
                this.field_y = 0;
                if (!this.field_C) {
                  L5: {
                    if (null != this.field_u) {
                      this.field_H.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_u = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              if ((this.field_r ^ -1) >= -1) {
                this.field_r = 0;
                if (!this.field_w) {
                  this.field_y = 0;
                  if (!this.field_C) {
                    L6: {
                      if (this.field_B == null) {
                        break L6;
                      } else {
                        this.field_v.a(true);
                        break L6;
                      }
                    }
                    this.field_B = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 1282642017) {
              var3_int = 0;
              var4 = be.field_t;
              L1: while (true) {
                if (mn.field_q.length <= var3_int) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = gd.field_s[var3_int];
                    if (0 > var5) {
                      var4 = var4 + gd.field_k;
                      break L2;
                    } else {
                      var6 = uc.a(mn.field_q[var3_int], true, false);
                      var7 = -(var6 >> -430493823) + vm.field_c;
                      var4 = var4 + al.field_z;
                      if (pe.a(kd.field_z + (qc.field_z << -826860287), var4, param0, param2, (byte) 17, var7 - gl.field_l, (gl.field_l << -1450028287) + var6)) {
                        stackOut_9_0 = var5;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = var4 + (kd.field_z + ((qc.field_z << 1282642017) + al.field_z));
                        break L2;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 111;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "fk.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final sn c() {
        return null;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        field_A = "<col=ee9d32>Items - Collectables</col>";
        field_G = "Start level:";
    }
}
