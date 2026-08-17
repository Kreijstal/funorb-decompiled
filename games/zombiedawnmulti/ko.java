/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private boolean field_c;
    static String field_i;
    static String field_j;
    private int field_a;
    static String field_k;
    private int field_f;
    private boolean field_d;
    private boolean field_e;
    private int field_m;
    private boolean field_g;
    static String field_h;
    private fb[] field_b;
    private int field_l;

    public static void d(int param0) {
        try {
            int var1_int = 98 / ((-2 - param0) / 60);
            field_j = null;
            field_i = null;
            field_h = null;
            field_k = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ko.K(" + param0 + ')');
        }
    }

    private final void a(ja param0, byte param1, ja param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.g(-(param0.field_x / 2) + 320, 400);
            if (param1 == 59) {
              g.a(param2, 320 + -(param2.field_x / 2), 400);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ko.F(");

            if (param0 == null) {
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
          L2: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 > 61) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            L2: {
              this.field_m = this.field_m + 1;
              if (-256 == (param1 ^ -1)) {
                break L2;
              } else {
                if (-20 >= (param1 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (!ll.field_k.a(45, -128)) {
                      break L3;
                    } else {
                      if ((param1 ^ -1) != -18) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!h.i(51603)) {
                      break L4;
                    } else {
                      L5: {
                        if (jk.a((byte) -73, param1)) {
                          break L5;
                        } else {
                          if (jk.a((byte) -122, param2)) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  if (this.field_m != 8) {
                    this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                    this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                    this.field_b[this.field_m - 1].a(0);
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 <= -111) {
              L1: {
                L2: {
                  if (this.field_c) {
                    break L2;
                  } else {
                    if (this.field_e) {
                      break L2;
                    } else {
                      if (this.field_g) {
                        break L2;
                      } else {
                        if (!this.field_d) {
                          stackIn_11_0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackIn_11_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean g(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 13) {
              stackIn_4_0 = this.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, byte param2) {
        fb[] var4 = null;
        int var5_int = 0;
        fb var6_ref_fb = null;
        int var7 = 0;
        fb[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        fb var5 = null;
        int var6 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var8 = this.field_b;
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= var8.length) {
                L2: {
                  this.field_a = -1;
                  if (param2 >= 64) {
                    break L2;
                  } else {
                    this.b(119, 56, -64);
                    break L2;
                  }
                }
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_b.length) {
                    break L0;
                  } else {
                    var5 = this.field_b[var4_int];
                    if (var5 != null) {
                      L4: {
                        var6 = var5.a(param1, (byte) -66);
                        if (-1 != var6) {
                          this.field_f = 20 + var5.field_m;
                          this.field_a = var4_int;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4_int++;
                      continue L3;
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              } else {
                var6_ref_fb = var8[var5_int];
                if (var6_ref_fb != null) {
                  var6_ref_fb.a(param1, param0, 255);
                  var5_int++;
                  continue L1;
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "ko.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3) {
        cj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        cj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        cj stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        cj stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        cj stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              v.a(199);
              if (!param2) {
                break L1;
              } else {
                ko.d(-60);
                break L1;
              }
            }
            L2: {
              if (0 > bc.field_e) {
                ql.field_b.field_wb = null;
                break L2;
              } else {
                ql.field_b.field_wb = vl.a(ob.field_v, new String[]{Integer.toString(bc.field_e)}, 2);
                break L2;
              }
            }
            L3: {
              L4: {
                stackIn_14_0 = qe.field_k;

                stackIn_14_1 = -11838;

                if (!param0) {
                  break L4;
                } else {
                  stackIn_14_0 = (cj) ((Object) stackIn_14_0);

                  if (param3) {
                    break L4;
                  } else {
                    stackIn_14_0 = (cj) ((Object) stackIn_14_0);

                    if (ee.field_a) {
                      break L4;
                    } else {
                      stackIn_14_0 = (cj) ((Object) stackIn_14_0);

                      if (null != mh.field_c) {
                        break L4;
                      } else {
                        stackIn_14_0 = (cj) ((Object) stackIn_14_0);

                        if (ej.field_n != null) {
                          break L4;
                        } else {
                          stackIn_15_0 = (cj) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = 1;
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_15_0 = (cj) ((Object) stackIn_14_0);
              stackIn_15_1 = stackIn_14_1;
              stackIn_15_2 = 0;
              break L3;
            }
            L5: {
              L6: {
                ((cj) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0);
                stackIn_22_0 = cm.field_a;

                stackIn_22_1 = -11838;

                if (!param0) {
                  break L6;
                } else {
                  stackIn_22_0 = (cj) ((Object) stackIn_22_0);

                  if (param3) {
                    break L6;
                  } else {
                    stackIn_22_0 = (cj) ((Object) stackIn_22_0);

                    if (ee.field_a) {
                      break L6;
                    } else {
                      stackIn_22_0 = (cj) ((Object) stackIn_22_0);

                      if (mh.field_c != null) {
                        break L6;
                      } else {
                        stackIn_22_0 = (cj) ((Object) stackIn_22_0);

                        if (ej.field_n != null) {
                          break L6;
                        } else {
                          stackIn_23_0 = (cj) ((Object) stackIn_22_0);
                          stackIn_23_1 = stackIn_22_1;
                          stackIn_23_2 = 1;
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_23_0 = (cj) ((Object) stackIn_22_0);
              stackIn_23_1 = stackIn_22_1;
              stackIn_23_2 = 0;
              break L5;
            }
            L7: {
              L8: {
                ((cj) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2 != 0);
                stackIn_28_0 = lm.field_gb;

                stackIn_28_1 = -11838;

                if (!param0) {
                  break L8;
                } else {
                  stackIn_28_0 = (cj) ((Object) stackIn_28_0);

                  if (param3) {
                    break L8;
                  } else {
                    stackIn_28_0 = (cj) ((Object) stackIn_28_0);

                    if (!ee.field_a) {
                      break L8;
                    } else {
                      stackIn_29_0 = (cj) ((Object) stackIn_28_0);
                      stackIn_29_1 = stackIn_28_1;
                      stackIn_29_2 = 1;
                      break L7;
                    }
                  }
                }
              }
              stackIn_29_0 = (cj) ((Object) stackIn_28_0);
              stackIn_29_1 = stackIn_28_1;
              stackIn_29_2 = 0;
              break L7;
            }
            L9: {
              ((cj) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2 != 0);
              de.field_b.field_c.h(-37);
              if (0 == kj.field_u.field_T) {
                break L9;
              } else {
                uk.field_N = true;
                break L9;
              }
            }
            L10: {
              if (ia.field_t.field_T == 0) {
                break L10;
              } else {
                L11: {
                  if (bo.field_e) {
                    break L11;
                  } else {
                    if ((vl.field_h ^ -1) < -1) {
                      break L11;
                    } else {
                      L12: {
                        if (kj.field_q < 2) {
                          break L12;
                        } else {
                          if (!lc.field_m[12]) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      pb.field_f = true;
                      break L10;
                    }
                  }
                }
                ii.a(param1, -1);
                break L10;
              }
            }
            L13: {
              if (pl.field_L.field_T == 0) {
                break L13;
              } else {
                L14: {
                  if (1 != qo.field_r.length) {
                    break L14;
                  } else {
                    if (i.field_e == qo.field_r[0]) {
                      break L14;
                    } else {
                      i.field_e = qo.field_r[0];
                      break L14;
                    }
                  }
                }
                cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                break L13;
              }
            }
            L15: {
              if (0 == kn.field_a.field_T) {
                break L15;
              } else {
                ee.field_a = false;
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = this.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        fb[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        fb var4_ref_fb = null;
        int var5 = 0;
        fb[] var6 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = this.field_b;
              var2 = var6;
              if (param0 <= -114) {
                break L1;
              } else {
                this.field_a = -40;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var6.length) {
                L3: {
                  if (this.field_a == -1) {
                    break L3;
                  } else {
                    if (this.field_a >= tg.field_e.field_d.length) {
                      break L3;
                    } else {
                      var2_int = tg.field_e.field_d[this.field_a];
                      var3 = tg.field_e.field_f[this.field_a];
                      if (255 != var2_int) {
                        g.a(fe.field_W[var2_int], this.field_f + -100, 453);
                        oj.field_M[var2_int].g(-100 + this.field_f, 453);
                        if ((var3 ^ -1) == -256) {
                          break L3;
                        } else {
                          g.a(fe.field_W[var3], -100 + this.field_f, 438);
                          oj.field_M[var3].g(-100 + this.field_f, 438);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (this.field_e) {
                    this.a(wp.field_e, (byte) 59, vl.field_k);
                    break L4;
                  } else {
                    L5: {
                      if (!this.field_d) {
                        break L5;
                      } else {
                        if (!this.field_g) {
                          break L5;
                        } else {
                          if (this.field_c) {
                            this.a(la.field_j, (byte) 59, kj.field_o);
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (!this.field_d) {
                        break L6;
                      } else {
                        if (this.field_g) {
                          this.a(up.field_f, (byte) 59, oq.field_t);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!this.field_g) {
                      L7: {
                        if (!this.field_c) {
                          break L7;
                        } else {
                          if (this.field_d) {
                            this.a(mi.field_Mb, (byte) 59, aq.field_u);
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (this.field_c) {
                        this.a(bq.field_a, (byte) 59, ii.field_c);
                        break L4;
                      } else {
                        if (this.field_d) {
                          this.a(fe.field_U, (byte) 59, ap.field_t);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      this.a(dl.field_c, (byte) 59, bf.field_f);
                      break L4;
                    }
                  }
                }
                L8: {
                  L9: {
                    var2_int = this.e(-1);
                    if (255 == var2_int) {
                      break L9;
                    } else {
                      if (0 >= bd.field_g) {
                        break L9;
                      } else {
                        if (-1 > (bo.field_d ^ -1)) {
                          var3 = 4 + bd.field_g;
                          var4 = 15 + bo.field_d;
                          wa.field_b[var2_int].c(var3, var4, 255);
                          if (!bk.field_g) {
                            el.field_E.c(1 + var3, var4 - -1);
                            break L9;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  break L8;
                }
                break L0;
              } else {
                var4_ref_fb = var6[var3];
                if (var4_ref_fb != null) {
                  var4_ref_fb.c(123);
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "ko.A(" + param0 + ')');
        }
    }

    final int e(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_l == param0) {
                break L1;
              } else {
                if (this.field_b[this.field_l] == null) {
                  break L1;
                } else {
                  stackIn_3_0 = this.field_b[this.field_l].a((byte) 97);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_5_0 = 255;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final void a(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (this.field_b[param0] != null) {
              L1: {
                if (!this.field_b[param0].field_b) {
                  this.b(param1 ^ -18, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == -1) {
                  break L2;
                } else {
                  this.field_m = -102;
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
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ko.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = this.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_a = 77;
                break L1;
              }
            }
            L2: {
              var2_int = this.e(-1);
              if (var2_int == 9) {
                break L2;
              } else {
                if (var2_int == 10) {
                  break L2;
                } else {
                  return 0;
                }
              }
            }
            stackIn_8_0 = ip.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.O(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final boolean b(int param0, int param1) {
        int stackIn_5_0 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_73_0 = null;
        Object stackIn_73_1 = null;
        Object stackIn_74_0 = null;
        Object stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_84_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fb[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        fb var5_ref_fb = null;
        int var6 = 0;
        fb[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_b[param1] == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 17) {
                  break L1;
                } else {
                  this.field_c = false;
                  break L1;
                }
              }
              L2: {
                if (this.field_b[param1].b((byte) 92)) {
                  this.h(1);
                  break L2;
                } else {
                  iq.a(-10, (byte) 99);
                  var7 = this.field_b;
                  var3 = var7;
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= var7.length) {
                      L4: {
                        this.field_l = param1;
                        this.field_b[param1].b(2);
                        var3_int = this.field_b[param1].a((byte) 114);
                        this.field_e = false;
                        this.field_g = false;
                        this.field_c = false;
                        this.field_d = false;
                        var4 = ll.field_k.field_g[param1];
                        var5 = var3_int;
                        if (7 == var5) {
                          L5: {
                            this.field_c = true;
                            stackIn_47_0 = this;

                            if (37 != var4) {
                              stackIn_48_0 = this;
                              stackIn_48_1 = 0;
                              break L5;
                            } else {
                              stackIn_48_0 = this;
                              stackIn_48_1 = 1;
                              break L5;
                            }
                          }
                          ((ko) (this)).field_d = stackIn_48_1 != 0;
                          break L4;
                        } else {
                          L6: {
                            if (13 == var5) {
                              break L6;
                            } else {
                              if (var5 != 11) {
                                if (9 == var5) {
                                  break L6;
                                } else {
                                  if (-11 != (var5 ^ -1)) {
                                    if (12 != var5) {
                                      if (var5 != 17) {
                                        L7: {
                                          if (4 == var5) {
                                            break L7;
                                          } else {
                                            if (var5 == 1) {
                                              break L7;
                                            } else {
                                              if (-3 == (var5 ^ -1)) {
                                                L8: {
                                                  this.field_g = true;
                                                  stackIn_61_0 = this;

                                                  if (32 != var4) {
                                                    stackIn_62_0 = this;
                                                    stackIn_62_1 = 0;
                                                    break L8;
                                                  } else {
                                                    stackIn_62_0 = this;
                                                    stackIn_62_1 = 1;
                                                    break L8;
                                                  }
                                                }
                                                ((ko) (this)).field_d = stackIn_62_1 != 0;
                                                break L4;
                                              } else {
                                                L9: {
                                                  if ((var5 ^ -1) == -17) {
                                                    break L9;
                                                  } else {
                                                    if (14 != var5) {
                                                      if (-6 != (var5 ^ -1)) {
                                                        if (var5 == 8) {
                                                          this.field_c = true;
                                                          this.field_d = true;
                                                          break L4;
                                                        } else {
                                                          if (var5 == 0) {
                                                            L10: {
                                                              stackIn_73_0 = this;

                                                              stackIn_73_1 = this;

                                                              if (-33 != (var4 ^ -1)) {
                                                                stackIn_74_0 = this;
                                                                stackIn_74_1 = this;
                                                                stackIn_74_2 = 0;
                                                                break L10;
                                                              } else {
                                                                stackIn_74_0 = this;
                                                                stackIn_74_1 = this;
                                                                stackIn_74_2 = 1;
                                                                break L10;
                                                              }
                                                            }
                                                            ((ko) (this)).field_d = stackIn_74_2 != 0;
                                                            ((ko) (this)).field_c = stackIn_74_2 != 0;
                                                            this.field_g = true;
                                                            break L4;
                                                          } else {
                                                            if (var5 != 15) {
                                                              this.field_g = true;
                                                              break L4;
                                                            } else {
                                                              this.field_e = true;
                                                              break L4;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                L11: {
                                                  this.field_g = true;
                                                  stackIn_66_0 = this;

                                                  if ((var4 ^ -1) != -34) {
                                                    stackIn_67_0 = this;
                                                    stackIn_67_1 = 0;
                                                    break L11;
                                                  } else {
                                                    stackIn_67_0 = this;
                                                    stackIn_67_1 = 1;
                                                    break L11;
                                                  }
                                                }
                                                ((ko) (this)).field_d = stackIn_67_1 != 0;
                                                break L4;
                                              }
                                            }
                                          }
                                        }
                                        L12: {
                                          this.field_g = true;
                                          stackIn_56_0 = this;

                                          if (-38 != (var4 ^ -1)) {
                                            stackIn_57_0 = this;
                                            stackIn_57_1 = 0;
                                            break L12;
                                          } else {
                                            stackIn_57_0 = this;
                                            stackIn_57_1 = 1;
                                            break L12;
                                          }
                                        }
                                        ((ko) (this)).field_d = stackIn_57_1 != 0;
                                        break L4;
                                      } else {
                                        this.field_d = true;
                                        this.field_e = true;
                                        this.field_g = true;
                                        this.field_c = true;
                                        break L4;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_e = true;
                          break L4;
                        }
                      }
                      if (df.field_I) {
                        ah.a((byte) -86, var3_int);
                        iq.a(var3_int, (byte) 99);
                        break L2;
                      } else {
                        return true;
                      }
                    } else {
                      var5_ref_fb = var7[var4];
                      if (null != var5_ref_fb) {
                        var5_ref_fb.c((byte) 18);
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              stackIn_84_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "ko.P(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_84_0 != 0;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = (param2 + -190) / 40;
              if (param1 > var4_int) {
                break L1;
              } else {
                if (var4_int >= this.field_m) {
                  break L1;
                } else {
                  if (null == this.field_b[var4_int]) {
                    break L1;
                  } else {
                    if (this.field_b[var4_int].a(param0, param2, (byte) -46)) {
                      stackIn_9_0 = this.b(17, var4_int);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0;
        }
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (!this.a((byte) -122)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_b[this.field_l]) {
                  break L1;
                } else {
                  this.field_b[this.field_l].c((byte) 18);
                  break L1;
                }
              }
              this.field_l = -1;
              this.field_c = false;
              this.field_d = false;
              this.field_e = false;
              this.field_g = false;
              if (param0 == 1) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(int param0, id param1, int param2, int param3) {
        ti stackIn_8_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        ti var6_ref = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        var6 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.e(-1);
              if (!(param1 instanceof jj)) {
                L2: {
                  var6_ref = (ti) ((Object) param1);
                  if (var6_ref instanceof wb) {
                    stackIn_8_0 = (ti) (var6_ref);
                    break L2;
                  } else {
                    stackIn_8_0 = null;
                    break L2;
                  }
                }
                var7 = (wb) ((Object) stackIn_8_0);
                var8 = var5_int;
                if (-256 != (var8 ^ -1)) {
                  L3: {
                    if (-13 == (var8 ^ -1)) {
                      break L3;
                    } else {
                      if ((var8 ^ -1) == -12) {
                        break L3;
                      } else {
                        L4: {
                          if (13 != var8) {
                            if (var8 != 10) {
                              if ((var8 ^ -1) == -10) {
                                break L4;
                              } else {
                                if (var8 == 15) {
                                  break L4;
                                } else {
                                  if ((var8 ^ -1) != -18) {
                                    if (3 != var8) {
                                      L5: {
                                        if (-2 != (var8 ^ -1)) {
                                          if (var8 != 2) {
                                            if ((var8 ^ -1) != -5) {
                                              if (-15 == (var8 ^ -1)) {
                                                break L5;
                                              } else {
                                                if ((var8 ^ -1) != -17) {
                                                  if (var8 != 5) {
                                                    if (-19 != (var8 ^ -1)) {
                                                      L6: {
                                                        if (var8 != 7) {
                                                          if (-1 == (var8 ^ -1)) {
                                                            break L6;
                                                          } else {
                                                            break L6;
                                                          }
                                                        } else {
                                                          break L6;
                                                        }
                                                      }
                                                      wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                                      break L1;
                                                    } else {
                                                      break L5;
                                                    }
                                                  } else {
                                                    break L5;
                                                  }
                                                } else {
                                                  break L5;
                                                }
                                              }
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      L7: {
                                        if (var7 == null) {
                                          break L7;
                                        } else {
                                          if (!var7.o(88)) {
                                            wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                            break L1;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    } else {
                                      L8: {
                                        if (var7 == null) {
                                          break L8;
                                        } else {
                                          if (!var7.q(-14945)) {
                                            break L8;
                                          } else {
                                            if (!var7.o(127)) {
                                              wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                              break L1;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    }
                                  } else {
                                    L9: {
                                      if (var6_ref != null) {
                                        param0 = -1;
                                        param2 = var6_ref.field_y;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    ok.a(-101, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                        break L1;
                      }
                    }
                  }
                  nn.a(ma.field_a, op.field_m.field_H, this.field_l, (byte) 102);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                wd.a(param1.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                break L1;
              }
            }
            tg.field_e.field_b[this.field_l] = op.field_m.field_H - -op.field_m.a(ll.field_k.field_g[this.field_l], var5_int, fb.field_e.field_M, false);
            this.field_b[this.field_l].a(0);
            this.field_c = false;
            this.field_g = false;
            if (param3 >= 112) {
              this.field_l = -1;
              this.field_e = false;
              this.field_d = false;
              iq.a(-11, (byte) 99);
              decompiledRegionSelector0 = 4;
              break L0;
            } else {
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("ko.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L10;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param2 + ',' + param3 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.M(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0) {
        int var2_int = 0;
        fb[] var3 = null;
        int var4 = 0;
        fb var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 110 / ((34 - param0) / 58);
            var3 = this.field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var5.field_b = false;
                  var5.b(2);
                  var5.c((byte) 18);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.N(" + param0 + ')');
        }
    }

    ko() {
        this.field_d = false;
        this.field_f = 0;
        this.field_e = false;
        this.field_g = false;
        this.field_c = false;
        this.field_a = -1;
        try {
            this.field_b = new fb[8];
            this.field_m = 0;
            this.field_l = -1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ko.<init>()");
        }
    }

    static {
        field_i = "Waiting for sound effects";
        field_h = "Location";
        field_k = "Players: ";
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
