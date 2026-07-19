/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends sm {
    private float field_k;
    private int field_l;
    static String field_i;
    static String field_m;
    private float field_j;
    static String field_h;

    final static kk b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        js var8 = null;
        js var9 = null;
        js var10 = null;
        js var11 = null;
        js var12 = null;
        js var13 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -20849) {
          var11 = new js(pd.field_d, true, false, true, true);
          var10 = var11;
          var3 = pe.b(param1 + 20938, param0);
          var4 = 127;
          var5 = 0;
          L0: while (true) {
            L1: {
              if (var5 >= var10.field_i.length) {
                break L1;
              } else {
                L2: {
                  var6 = (var4 & var11.field_i[var5]) + -16;
                  if ((var6 ^ -1) <= -1) {
                    break L2;
                  } else {
                    var6 = 0;
                    break L2;
                  }
                }
                var10.field_i[var5] = (short)oe.c(var6, rn.a(var4 ^ -1, var3));
                var5++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var10.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
          }
        } else {
          field_m = (String) null;
          var13 = new js(pd.field_d, true, false, true, true);
          var8 = var13;
          var12 = var13;
          var9 = var12;
          var3 = pe.b(param1 + 20938, param0);
          var4 = 127;
          var5 = 0;
          L3: while (true) {
            L4: {
              if (var5 >= var12.field_i.length) {
                break L4;
              } else {
                L5: {
                  var6 = (var4 & var13.field_i[var5]) + -16;
                  if ((var6 ^ -1) <= -1) {
                    break L5;
                  } else {
                    var6 = 0;
                    break L5;
                  }
                }
                var12.field_i[var5] = (short)oe.c(var6, rn.a(var4 ^ -1, var3));
                var5++;
                if (var7 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            return var12.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
          }
        }
    }

    final static boolean a(int param0, int param1) {
        fd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_6_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (bk.field_e == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != bk.field_e.b(false)) {
                var2 = (fd) ((Object) bk.field_e.e((byte) 111));
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2 == null) {
                        break L3;
                      } else {
                        var3 = var2.field_k;
                        stackOut_10_0 = var3 ^ -1;
                        stackIn_17_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (stackIn_11_0 == (param1 ^ -1)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            var2 = (fd) ((Object) bk.field_e.a((byte) 123));
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ge.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final void b(byte param0) {
        int var2 = -4 / ((param0 - -67) / 49);
        super.b((byte) 111);
        this.field_j = 0.0f;
        this.field_k = 3.4028234663852886e+38f;
        this.field_l = 0;
    }

    ge(ej param0) {
        super(param0);
        this.field_k = 3.4028234663852886e+38f;
        this.field_j = 0.0f;
    }

    final jb a(byte param0) {
        Object var2_ref = null;
        jb var2_ref_jb = null;
        float var2 = 0.0f;
        Object var3 = null;
        jb var3_ref = null;
        int var4 = 0;
        var2_ref = null;
        var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_a.a(false)) {
          this.field_j = 0.0f;
          if (this.field_k < 1.0f) {
            var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 102));
            L0: while (true) {
              if (var2_ref_jb == null) {
                this.field_k = 1.0f;
                if (param0 <= -28) {
                  var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
                  L1: while (true) {
                    if (var2_ref_jb == null) {
                      var2 = (float)(Math.random() * (double)this.field_j);
                      var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                      L2: while (true) {
                        if (var3_ref != null) {
                          var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                          if (var4 == 0) {
                            if (var2 <= 0.0f) {
                              return var3_ref;
                            } else {
                              var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                              continue L2;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                          return null;
                        }
                      }
                    } else {
                      this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                      var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                      continue L1;
                    }
                  }
                } else {
                  this.field_j = 0.7643955945968628f;
                  var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
                  L3: while (true) {
                    if (var2_ref_jb == null) {
                      var2 = (float)(Math.random() * (double)this.field_j);
                      var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                      L4: while (true) {
                        if (var3_ref != null) {
                          var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                          if (var4 == 0) {
                            if (var2 <= 0.0f) {
                              return var3_ref;
                            } else {
                              var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                              continue L4;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                          return null;
                        }
                      }
                    } else {
                      this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                      var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                      continue L3;
                    }
                  }
                }
              } else {
                var2_ref_jb.field_t = var2_ref_jb.field_t + (1.0f - this.field_k);
                var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                if (var4 == 0) {
                  continue L0;
                } else {
                  if (param0 <= -28) {
                    var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
                    L5: while (true) {
                      if (var2_ref_jb == null) {
                        var2 = (float)(Math.random() * (double)this.field_j);
                        var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                        L6: while (true) {
                          if (var3_ref != null) {
                            var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                            if (var4 == 0) {
                              if (var2 <= 0.0f) {
                                return var3_ref;
                              } else {
                                var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                                continue L6;
                              }
                            } else {
                              return null;
                            }
                          } else {
                            af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                            return null;
                          }
                        }
                      } else {
                        this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                        var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                        continue L5;
                      }
                    }
                  } else {
                    this.field_j = 0.7643955945968628f;
                    var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
                    L7: while (true) {
                      L8: {
                        if (var2_ref_jb == null) {
                          break L8;
                        } else {
                          this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                          var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                          if (var4 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var2 = (float)(Math.random() * (double)this.field_j);
                      var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                      L9: while (true) {
                        if (var3_ref != null) {
                          var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                          if (var4 == 0) {
                            if (var2 <= 0.0f) {
                              return var3_ref;
                            } else {
                              var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                              continue L9;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                          return null;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (param0 <= -28) {
              var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
              L10: while (true) {
                if (var2_ref_jb == null) {
                  var2 = (float)(Math.random() * (double)this.field_j);
                  var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                  L11: while (true) {
                    if (var3_ref != null) {
                      var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                      if (var4 == 0) {
                        if (var2 <= 0.0f) {
                          return var3_ref;
                        } else {
                          var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                          continue L11;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                      return null;
                    }
                  }
                } else {
                  this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                  var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                  continue L10;
                }
              }
            } else {
              this.field_j = 0.7643955945968628f;
              var2_ref_jb = (jb) ((Object) this.field_a.e((byte) 94));
              L12: while (true) {
                L13: {
                  if (var2_ref_jb == null) {
                    break L13;
                  } else {
                    this.field_j = (float)((double)this.field_j + Math.pow((double)(var2_ref_jb.field_t / this.field_k), 4.0));
                    var2_ref_jb = (jb) ((Object) this.field_a.a((byte) 123));
                    if (var4 == 0) {
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                var2 = (float)(Math.random() * (double)this.field_j);
                var3_ref = (jb) ((Object) this.field_a.e((byte) 116));
                L14: while (true) {
                  if (var3_ref != null) {
                    var2 = (float)((double)var2 - Math.pow((double)(var3_ref.field_t / this.field_k), 4.0));
                    if (var4 == 0) {
                      if (var2 <= 0.0f) {
                        return var3_ref;
                      } else {
                        var3_ref = (jb) ((Object) this.field_a.a((byte) 123));
                        continue L14;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    af.a((Throwable) null, -114, "ran out of orders! total " + this.field_j + ", num " + this.field_l + " w " + var2);
                    return null;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, jb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (param1.field_t < this.field_k) {
                this.field_k = param1.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ge.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void c(int param0) {
        boolean discarded$2 = false;
        if (param0 > -98) {
          discarded$2 = ge.a(39, 60);
          field_h = null;
          field_m = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_m = null;
          field_i = null;
          return;
        }
    }

    static {
        field_i = "Type your password again to make sure it's correct";
        field_m = "Cancel";
    }
}
