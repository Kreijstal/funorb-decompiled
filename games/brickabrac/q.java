/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    int field_a;
    static n field_i;
    int field_d;
    int field_f;
    boolean field_h;
    static String field_g;
    private km field_e;
    int field_j;
    private boolean field_b;
    int field_c;

    final boolean a(int param0, int param1, int param2) {
        if (param2 >= -25) {
            return false;
        }
        return bg.a(this.field_c, this.field_d, this.field_j, (byte) 126, param1, param0, this.field_a);
    }

    final void a(int param0) {
        this.field_b = false;
        if (param0 > -63) {
            this.field_d = -50;
        }
    }

    final void a(byte param0, boolean param1) {
        String[] array$0 = null;
        jp[] stackIn_16_0 = null;
        jp[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jp[] stackIn_26_0 = null;
        jp[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_36_0;
        String[] stackIn_36_1;
        String[] stackIn_36_2;
        int stackIn_36_3;
        String stackIn_37_0;
        String[] stackIn_37_1;
        String[] stackIn_37_2;
        int stackIn_37_3;
        String stackIn_37_4;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        jp stackIn_59_0 = null;
        jp[] var3;
        String var4;
        jp var4_ref;
        int var5;
        int var6;
        int var7;
        String var8_ref_String;
        int var8;
        int var9_int;
        jp var9;
        int var10;
        jp var11;
        jp var12;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          if (31 == this.field_f) {
            break L0;
          } else {
            if (40 == this.field_f) {
              break L0;
            } else {
              if (-42 == (this.field_f ^ -1)) {
                break L0;
              } else {
                if (-44 != (this.field_f ^ -1)) {
                  L1: {
                    if (!this.field_b) {
                      if (!param1) {
                        var3 = vn.field_G;
                        break L1;
                      } else {
                        var3 = af.field_A;
                        break L1;
                      }
                    } else {
                      var3 = pe.field_k;
                      break L1;
                    }
                  }
                  L2: {
                    nh.a(this.field_j, this.field_d, -40, this.field_c, var3, this.field_a);
                    if (29 == this.field_f) {
                      break L2;
                    } else {
                      if (this.field_f == 30) {
                        break L2;
                      } else {
                        L3: {
                          if (44 == this.field_f) {
                            break L3;
                          } else {
                            if ((this.field_f ^ -1) == -46) {
                              break L3;
                            } else {
                              L4: {
                                var4 = ag.field_D[this.field_f];
                                if (this.field_f != 8) {
                                  break L4;
                                } else {
                                  var4 = this.field_e.e((byte) 87);
                                  break L4;
                                }
                              }
                              L5: {
                                if (-37 != (this.field_f ^ -1)) {
                                  break L5;
                                } else {
                                  L6: {
                                    array$0 = new String[1];
                                    stackIn_36_0 = gj.field_d;

                                    stackIn_36_1 = (String[]) (array$0);

                                    stackIn_36_2 = (String[]) (array$0);

                                    stackIn_36_3 = 0;

                                    if (!be.field_a) {
                                      stackIn_37_0 = (String) ((Object) stackIn_36_0);
                                      stackIn_37_1 = (String[]) ((Object) stackIn_36_1);
                                      stackIn_37_2 = (String[]) ((Object) stackIn_36_2);
                                      stackIn_37_3 = stackIn_36_3;
                                      stackIn_37_4 = jg.field_q;
                                      break L6;
                                    } else {
                                      stackIn_37_0 = (String) ((Object) stackIn_36_0);
                                      stackIn_37_1 = (String[]) ((Object) stackIn_36_1);
                                      stackIn_37_2 = (String[]) ((Object) stackIn_36_2);
                                      stackIn_37_3 = stackIn_36_3;
                                      stackIn_37_4 = lk.field_q;
                                      break L6;
                                    }
                                  }
                                  stackIn_37_2[stackIn_37_3] = stackIn_37_4;
                                  var4 = rd.a(stackIn_37_0, stackIn_37_1, (byte) 103);
                                  break L5;
                                }
                              }
                              L7: {
                                L8: {
                                  var5 = nn.field_g.c(var4);
                                  if (20 == this.field_f) {
                                    break L8;
                                  } else {
                                    if (-22 == (this.field_f ^ -1)) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var5 = og.field_Zb;
                                break L7;
                              }
                              L9: {
                                var6 = -var5 + (this.field_j + 2 * this.field_c) >> 1854592737;
                                if (!this.field_h) {
                                  if (!param1) {
                                    stackIn_47_0 = 0;
                                    break L9;
                                  } else {
                                    stackIn_47_0 = 1;
                                    break L9;
                                  }
                                } else {
                                  stackIn_47_0 = 7;
                                  break L9;
                                }
                              }
                              L10: {
                                var7 = stackIn_47_0;
                                if (this.field_f == 42) {
                                  var8_ref_String = var4.toLowerCase();
                                  var9_int = -16 + this.field_j;
                                  nn.field_g.a(var8_ref_String, 8 + this.field_c, this.field_a - 5, var9_int, this.field_d, var7, -1, 1, 1, 3 + nn.field_g.field_B);
                                  break L10;
                                } else {
                                  nn.field_g.c(var4.toLowerCase(), var6, 2 + (this.field_a + (-nn.field_g.field_P + nn.field_g.field_B + this.field_d) / 2), var7, -1);
                                  break L10;
                                }
                              }
                              L11: {
                                L12: {
                                  if (this.field_f == 20) {
                                    break L12;
                                  } else {
                                    if ((this.field_f ^ -1) != -22) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  var6 = var6 + dg.field_d;
                                  lb.c(var6, this.field_d / 2 + this.field_a - 1, 121, 11184810);
                                  lb.c(var6, this.field_a + this.field_d / 2, 121, 0);
                                  lb.c(var6, this.field_d / 2 + this.field_a + 1, 121, 11184810);
                                  if (20 != this.field_f) {
                                    stackIn_56_0 = qi.i(-29946) * 120 / 256;
                                    break L13;
                                  } else {
                                    stackIn_56_0 = lh.g((byte) -44) * 120 / re.e((byte) 43);
                                    break L13;
                                  }
                                }
                                L14: {
                                  var8 = stackIn_56_0;
                                  if (!param1) {
                                    stackIn_59_0 = g.field_l[0];
                                    break L14;
                                  } else {
                                    stackIn_59_0 = g.field_l[1];
                                    break L14;
                                  }
                                }
                                var9 = stackIn_59_0;
                                var9.c(var8 + (var6 + (-1 - var9.field_x / 2)), (-var9.field_z + this.field_d) / 2 + this.field_a);
                                break L11;
                              }
                              L15: {
                                if (param0 == 4) {
                                  break L15;
                                } else {
                                  this.a(-113, 101, -34);
                                  break L15;
                                }
                              }
                              return;
                            }
                          }
                        }
                        L16: {
                          stackIn_26_0 = pa.field_l;

                          if (!param1) {
                            stackIn_27_0 = (jp[]) ((Object) stackIn_26_0);
                            stackIn_27_1 = 0;
                            break L16;
                          } else {
                            stackIn_27_0 = (jp[]) ((Object) stackIn_26_0);
                            stackIn_27_1 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          var12 = stackIn_27_0[stackIn_27_1];
                          var4_ref = var12;
                          if (44 == this.field_f) {
                            var4_ref.c((this.field_j - var12.field_x) / 2 + this.field_c, this.field_a + (-var12.field_z + this.field_d) / 2);
                            break L17;
                          } else {
                            var4_ref.f((-var12.field_x + this.field_j) / 2 + this.field_c, this.field_a + (-var12.field_z + this.field_d) / 2);
                            break L17;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L18: {
                    stackIn_16_0 = mp.field_Vb;

                    if (!param1) {
                      stackIn_17_0 = (jp[]) ((Object) stackIn_16_0);
                      stackIn_17_1 = 0;
                      break L18;
                    } else {
                      stackIn_17_0 = (jp[]) ((Object) stackIn_16_0);
                      stackIn_17_1 = 1;
                      break L18;
                    }
                  }
                  L19: {
                    var11 = stackIn_17_0[stackIn_17_1];
                    var4_ref = var11;
                    if (-30 == (this.field_f ^ -1)) {
                      var4_ref.c(this.field_c + (this.field_j + -var11.field_x) / 2, this.field_a - -((-var11.field_z + this.field_d) / 2));
                      break L19;
                    } else {
                      var4_ref.g((-var11.field_x + this.field_j) / 2 + this.field_c, this.field_a - -((-var11.field_z + this.field_d) / 2));
                      break L19;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = w.a(param1 + 121, param2);
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (String) null;
                q.a((String) null, 78, (String) null);
                break L1;
              }
            }
            L2: {
              if (param0.indexOf(param2) != -1) {
                break L2;
              } else {
                if (0 != (param0.indexOf(var3) ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("q.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 != -32) {
            q.a((byte) 49);
        }
    }

    q(int param0, km param1) {
        try {
            this.field_f = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "q.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        re var2;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        if (param0 == -2217) {
          var2 = this.field_e.field_h;
          if (var2 == null) {
            return;
          } else {
            L0: {
              L1: {
                if (-30 == (this.field_f ^ -1)) {
                  break L1;
                } else {
                  if (30 == this.field_f) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                L3: {
                  stackIn_11_0 = this;

                  if (!var2.a(false)) {
                    break L3;
                  } else {
                    stackIn_11_0 = this;

                    if (!this.a(pq.field_k, po.field_a, -56)) {
                      break L3;
                    } else {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_12_0 = this;
                stackIn_12_1 = 0;
                break L2;
              }
              ((q) (this)).field_b = stackIn_12_1 != 0;
              break L0;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 69) {
              stackIn_4_0 = df.a(param0.length, 117, param0, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("q.B(");

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
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_i = new n();
        field_g = "Names cannot start or end with space or underscore";
    }
}
