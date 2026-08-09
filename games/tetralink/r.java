/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends eb {
    private int[] field_x;
    private int field_z;
    private ri field_C;
    private g field_A;
    private int field_r;
    private boolean field_w;
    private ri field_y;
    static String field_v;
    private int field_D;
    private boolean field_B;
    private int field_E;
    private int[] field_F;
    private g field_u;
    private ri field_s;
    private g field_t;

    private final void a(int param0, g param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.b(param0, -1, 99);
              param1.c(param3, param2 + -26097);
              if (param2 == 26025) {
                break L1;
              } else {
                this.field_C = (ri) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("r.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ah param0, ah param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              tg.a(0, ek.field_n, t.field_o, uf.field_g, u.field_b, sd.field_rb, tn.field_b, bk.field_i, param3, rh.field_N, ek.field_o, qc.field_cb);
              ec.field_n = bf.a((byte) -99, param0, "lobby", "chatfilter");
              gk.field_a[0] = oj.field_h;
              gk.field_a[2] = mk.field_f;
              gk.field_a[1] = am.field_a;
              db.a(param1, rn.field_e, 122);
              if (param2) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("r.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = TetraLink.field_J;
          if (-1 <= (this.field_z ^ -1)) {
            break L0;
          } else {
            if (null == this.field_y) {
              break L0;
            } else {
              this.field_A.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= this.field_z) {
            break L1;
          } else {
            if (null != this.field_s) {
              this.field_u.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-1 <= (this.field_D ^ -1)) {
            break L2;
          } else {
            if (null != this.field_C) {
              this.field_t.a(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!this.field_w) {
            break L3;
          } else {
            L4: {
              if ((this.field_r ^ -1) >= -1) {
                break L4;
              } else {
                if (this.field_A.d((byte) 107)) {
                  break L4;
                } else {
                  this.field_r = -this.field_r;
                  this.field_y = null;
                  this.field_w = false;
                  break L3;
                }
              }
            }
            if (-1 >= (this.field_r ^ -1)) {
              break L3;
            } else {
              if (!this.field_u.d((byte) 81)) {
                this.field_s = null;
                this.field_w = false;
                this.field_r = -this.field_r;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (this.field_r == 0) {
            break L5;
          } else {
            this.field_z = this.field_z + this.field_r * param0;
            if (1048576 <= this.field_z) {
              this.field_z = 1048576;
              if (this.field_w) {
                break L5;
              } else {
                this.field_r = 0;
                if (!this.field_B) {
                  L6: {
                    if (this.field_s != null) {
                      this.field_u.d(80);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_s = null;
                  break L5;
                } else {
                  break L5;
                }
              }
            } else {
              if (0 >= this.field_z) {
                this.field_z = 0;
                if (this.field_w) {
                  break L5;
                } else {
                  this.field_r = 0;
                  if (!this.field_B) {
                    L7: {
                      if (this.field_y == null) {
                        break L7;
                      } else {
                        this.field_A.d(109);
                        break L7;
                      }
                    }
                    this.field_y = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
          }
        }
    }

    final static void a(ie param0, java.awt.Frame param1, int param2) {
        vl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param1, 0);
              L2: while (true) {
                if (0 != var3.field_d) {
                  if ((var3.field_d ^ -1) == -2) {
                    L3: {
                      param1.setVisible(false);
                      if (param2 == 0) {
                        break L3;
                      } else {
                        field_v = (String) null;
                        break L3;
                      }
                    }
                    param1.dispose();
                    break L0;
                  } else {
                    tb.a(false, 100L);
                    continue L1;
                  }
                } else {
                  tb.a(false, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("r.H(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final synchronized void a(ri param0, int param1, boolean param2, int param3, int param4, byte param5) {
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_36_0 = 0;
        g stackIn_44_0 = null;
        g stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        g stackIn_54_0 = null;
        g stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int[] var9 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (!this.field_w) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if ((this.field_r ^ -1) >= -1) {
                      L3: {
                        if (this.field_s != null) {
                          this.field_u.d(76);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_s = param0;
                      if (param0 != null) {
                        this.field_u.a(false, param0, (byte) 113);
                        this.a(param3, this.field_u, 26025, param4);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == this.field_y) {
                          break L4;
                        } else {
                          this.field_A.d(38);
                          break L4;
                        }
                      }
                      this.field_y = param0;
                      if (param0 != null) {
                        this.field_A.a(false, param0, (byte) 117);
                        this.a(param3, this.field_A, 26025, param4);
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
              if (param5 <= -120) {
                break L5;
              } else {
                var9 = (int[]) null;
                this.b((int[]) null, -67, 0);
                break L5;
              }
            }
            L6: {
              stackIn_21_0 = this;

              if (!param2) {
                stackIn_22_0 = this;
                stackIn_22_1 = 0;
                break L6;
              } else {
                stackIn_22_0 = this;
                stackIn_22_1 = 1;
                break L6;
              }
            }
            ((r) (this)).field_w = stackIn_22_1 != 0;
            if (param0 == this.field_y) {
              this.field_r = param1;
              this.a(param3, this.field_A, 26025, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param0 == this.field_s) {
                this.field_r = -param1;
                this.a(param3, this.field_u, 26025, param4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L7: {
                  if (this.field_y != null) {
                    if (this.field_s != null) {
                      L8: {
                        if ((this.field_z ^ -1) <= -524289) {
                          stackIn_36_0 = 0;
                          break L8;
                        } else {
                          stackIn_36_0 = 1;
                          break L8;
                        }
                      }
                      var7_int = stackIn_36_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (null != this.field_y) {
                        this.field_A.d(111);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_y = param0;
                      if (param0 != null) {
                        L12: {
                          stackIn_54_0 = this.field_A;

                          if (param2) {
                            stackIn_55_0 = (g) ((Object) stackIn_54_0);
                            stackIn_55_1 = 0;
                            break L12;
                          } else {
                            stackIn_55_0 = (g) ((Object) stackIn_54_0);
                            stackIn_55_1 = 1;
                            break L12;
                          }
                        }
                        ((g) (Object) stackIn_55_0).a(stackIn_55_1 != 0, param0, (byte) 52);
                        this.a(param3, this.field_A, 26025, param4);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_r = param1;
                    break L9;
                  } else {
                    L13: {
                      if (this.field_s == null) {
                        break L13;
                      } else {
                        this.field_u.d(68);
                        break L13;
                      }
                    }
                    L14: {
                      this.field_s = param0;
                      if (param0 != null) {
                        L15: {
                          stackIn_44_0 = this.field_u;

                          if (param2) {
                            stackIn_45_0 = (g) ((Object) stackIn_44_0);
                            stackIn_45_1 = 0;
                            break L15;
                          } else {
                            stackIn_45_0 = (g) ((Object) stackIn_44_0);
                            stackIn_45_1 = 1;
                            break L15;
                          }
                        }
                        ((g) (Object) stackIn_45_0).a(stackIn_45_1 != 0, param0, (byte) 76);
                        this.a(param3, this.field_u, 26025, param4);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_r = -param1;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_60_0 = (RuntimeException) (var7);

            stackIn_60_1 = new StringBuilder().append("r.E(");

            if (param0 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L16;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L16;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (wa.field_e == null) {
                break L1;
              } else {
                if (li.field_a != qi.field_p) {
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
          return true;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          L0: {
            if (this.field_E > 0) {
              L1: {
                if (this.field_w) {
                  L2: {
                    if ((this.field_r ^ -1) >= -1) {
                      break L2;
                    } else {
                      if (!this.field_A.d((byte) -54)) {
                        this.field_y = null;
                        this.field_r = -this.field_r;
                        this.field_w = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_r >= 0) {
                    break L1;
                  } else {
                    if (!this.field_u.d((byte) 78)) {
                      this.field_r = -this.field_r;
                      this.field_w = false;
                      this.field_s = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_z >> 654791724) * this.field_E / 256;
                var5 = -var4_int + this.field_E;
                if (this.field_r != 0) {
                  this.field_z = this.field_z + param2 * this.field_r;
                  if (this.field_z >= 1048576) {
                    this.field_z = 1048576;
                    if (this.field_w) {
                      break L3;
                    } else {
                      this.field_r = 0;
                      if (this.field_B) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_s == null) {
                            break L4;
                          } else {
                            this.field_u.d(105);
                            break L4;
                          }
                        }
                        this.field_s = null;
                        break L3;
                      }
                    }
                  } else {
                    if (0 >= this.field_z) {
                      this.field_z = 0;
                      if (this.field_w) {
                        break L3;
                      } else {
                        this.field_r = 0;
                        if (this.field_B) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_y != null) {
                              this.field_A.d(111);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_y = null;
                          break L3;
                        }
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
                if (!nk.field_s) {
                  stackIn_33_0 = param2;
                  break L6;
                } else {
                  stackIn_33_0 = param2 << 1451994497;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (256 <= this.field_D) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_y) {
                      break L8;
                    } else {
                      if (null == this.field_s) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    this.field_A.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == this.field_x) {
                            break L10;
                          } else {
                            if (this.field_x.length >= var6) {
                              rd.a(this.field_x, 0, var6);
                              rd.a(this.field_F, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_F = new int[var6];
                        this.field_x = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_A.b(this.field_x, 0, param2);
                        this.field_u.b(this.field_F, 0, param2);
                        if (nk.field_s) {
                          param1 = param1 << 1;
                          stackIn_48_0 = param1 << 1;
                          break L11;
                        } else {
                          stackIn_48_0 = param1;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_F[var8] + this.field_x[var8] * var4_int >> -1406840280);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_u.b(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (this.field_C == null) {
                  break L13;
                } else {
                  if (-1 != (this.field_D ^ -1)) {
                    L14: {
                      L15: {
                        if (this.field_x == null) {
                          break L15;
                        } else {
                          if (this.field_x.length >= var6) {
                            rd.a(this.field_x, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_x = new int[var6];
                      this.field_F = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_t.b(this.field_x, 0, param2);
                      if (!nk.field_s) {
                        stackIn_63_0 = param1;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackIn_63_0 = param1 << 1;
                        break L16;
                      }
                    }
                    var7 = stackIn_63_0;
                    var8 = this.field_E * this.field_D / 256;
                    var9 = -var8 + this.field_E;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = this.field_x[var10] * var8 + param0[var7 + var10] * var9 >> 637794632;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
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
            stackIn_69_0 = (RuntimeException) (var4);

            stackIn_69_1 = new StringBuilder().append("r.BA(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L18;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L18;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        int var1 = 57 / ((-10 - param0) / 44);
        field_v = null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_E = param0;
        if (param1 != 1) {
            this.field_w = false;
        }
    }

    final synchronized int a() {
        return 2;
    }

    final eb b() {
        return null;
    }

    final static fj a(int param0, int param1, int param2, int param3) {
        int stackIn_38_0 = 0;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fj var8_ref_fj;
        int var9;
        fj var9_ref_fj;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        var13 = TetraLink.field_J;
        id.field_M.field_Pb.field_fb.b(1);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = pl.field_d + -1;
        L0: while (true) {
          if (-1 < (var7 ^ -1)) {
            var7 = 0;
            var8 = param3;
            L1: while (true) {
              if (pl.field_d <= var8) {
                L2: {
                  var8 = id.field_M.field_Pb.field_mb + id.field_M.field_Pb.field_R - var7 - -var6;
                  id.field_M.field_Pb.field_yb = id.field_M.field_Pb.field_yb + var8;
                  id.field_M.field_Pb.field_R = id.field_M.field_Pb.field_R - var8;
                  if (!hg.field_c) {
                    break L2;
                  } else {
                    id.field_M.field_Pb.field_R = var7;
                    break L2;
                  }
                }
                L3: {
                  if (!hg.field_c) {
                    break L3;
                  } else {
                    fi.field_Cb = true;
                    hg.field_c = false;
                    id.field_M.field_Pb.field_Db = 0;
                    id.field_M.field_Pb.field_yb = -id.field_M.field_Pb.field_R + id.field_M.field_Ob.field_R;
                    break L3;
                  }
                }
                L4: {
                  id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7;
                  if (!cl.field_e) {
                    break L4;
                  } else {
                    if (gn.field_I == null) {
                      break L4;
                    } else {
                      fi.field_Cb = true;
                      break L4;
                    }
                  }
                }
                L5: {
                  var9 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
                  if (fi.field_Cb) {
                    id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  id.field_M.a(-1, true, param1 * param2 * 2, param2);
                  if (var9 != id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db) {
                    stackIn_38_0 = 0;
                    break L6;
                  } else {
                    stackIn_38_0 = 1;
                    break L6;
                  }
                }
                fi.field_Cb = stackIn_38_0 != 0;
                return (fj) (var4);
              } else {
                var9_ref_fj = n.field_L[var8];
                if (var9_ref_fj.field_f != null) {
                  id.field_M.field_Pb.a((byte) -118, var9_ref_fj.field_f);
                  var9_ref_fj.field_f.a((byte) -126, var9_ref_fj.field_f.f(param3 + -121), var7, param2, param0);
                  var7 = var7 + param2;
                  if (-1 != (var9_ref_fj.field_f.field_F ^ -1)) {
                    var4 = var9_ref_fj;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L7: {
              var8_ref_fj = n.field_L[var7];
              var9 = 0;
              if (cd.field_a) {
                break L7;
              } else {
                if (var5 >= fh.field_a) {
                  break L7;
                } else {
                  var10_int = fh.a((byte) 79, var8_ref_fj.field_i);
                  if (var8_ref_fj.a((byte) -63) < var10_int) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_fj.field_l) {
                        break L8;
                      } else {
                        if (!sb.a((byte) 2, var8_ref_fj.field_n)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  }
                }
              }
            }
            if (var9 != 0) {
              L9: {
                if (null == var8_ref_fj.field_f) {
                  break L9;
                } else {
                  if (hg.field_c) {
                    break L9;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (var8_ref_fj.field_f == null) {
                  lb.field_R = lb.field_R + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              var10 = u.a(18440, var8_ref_fj);
              var11 = var10 + jb.c(var8_ref_fj.field_h);
              var12 = fi.a((byte) 100, var8_ref_fj);
              var8_ref_fj.field_f = new hl(0L, ll.field_A, var11);
              var6 = var6 + param2;
              var8_ref_fj.field_f.field_ib = var12 - (((var12 & 16711422) >> 1739337569) - ((16711423 & ll.field_A.field_ib) >> -1618365503));
              var8_ref_fj.field_f.field_N = var12;
              var8_ref_fj.field_f.field_L = -((var12 & 16711422) >> -2050513791) + (var12 + (8355711 & ll.field_A.field_L >> -790971679));
              var8_ref_fj.field_f.field_Ib = we.field_k;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_fj.field_f = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final eb c() {
        return null;
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        field_v = "Public";
    }
}
