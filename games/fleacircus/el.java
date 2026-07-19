/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends wi {
    private bi field_z;
    dd field_w;
    private boolean field_x;
    static sf field_C;
    static dd[] field_s;
    private int field_q;
    private dd field_y;
    private bi field_v;
    static String field_B;
    private bi field_u;
    boolean field_r;
    int field_A;
    int field_t;

    final static void a(String param0, byte param1) {
        boolean discarded$0 = false;
        try {
            if (param1 != 126) {
                discarded$0 = el.b((byte) 28);
            }
            ae.a(109, param0);
            wf.a(ll.field_o, false, false);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "el.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_B = null;
        if (param0 != 30537) {
            return;
        }
        field_C = null;
        field_s = null;
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        var1 = -14 % ((param0 - 73) / 47);
        if (sg.field_h != null) {
          if (!rh.field_k.b(0)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        RuntimeException var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              pi.field_e = param0.getParameter("overxgames");
              if (null == pi.field_e) {
                pi.field_e = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              id.field_i = param0.getParameter("overxachievements");
              if (id.field_i == null) {
                id.field_i = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var6_ref = param0.getParameter("currency");
                if (var6_ref == null) {
                  break L4;
                } else {
                  if (ii.a(12969, (CharSequence) ((Object) var6_ref))) {
                    di.field_d = pl.a((CharSequence) ((Object) var6_ref), -9816);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              di.field_d = 2;
              if (var8 == 0) {
                break L3;
              } else {
                di.field_d = pl.a((CharSequence) ((Object) var6_ref), -9816);
                break L3;
              }
            }
            fi.field_j = param5;
            rc.field_e = param3;
            pb.field_i = param1;
            of.field_h = new dd[param4.length];
            var7 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (param4.length <= var7) {
                    break L7;
                  } else {
                    of.field_h[var7] = new dd(317, 34);
                    var7++;
                    if (var8 != 0) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                vg.field_u = param4;
                break L6;
              }
              L8: {
                if (param2 > 24) {
                  break L8;
                } else {
                  el.d(18);
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("el.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param5 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_l;
          var3 = 0;
          if (this.field_v != null) {
            var3 = var3 + this.field_v.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_u == null) {
            break L1;
          } else {
            var3 = var3 + this.field_u.field_e;
            break L1;
          }
        }
        L2: {
          if (this.field_v == null) {
            break L2;
          } else {
            this.field_v.a(var2, this.field_a);
            var2 = var2 + this.field_v.field_c;
            break L2;
          }
        }
        this.field_z.a(var2, this.field_a, -var3 + this.field_n, this.field_z.field_d);
        var2 = var2 + (-var3 + this.field_n);
        if (null == this.field_u) {
          var4 = (-this.field_q + this.field_A) * this.field_n / (this.field_t + -this.field_q);
          if (param0 == 72) {
            if (!this.field_r) {
              this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
              if (fleas.field_A) {
                this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                return;
              } else {
                return;
              }
            } else {
              if (this.field_w == null) {
                this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
                if (fleas.field_A) {
                  this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                return;
              }
            }
          } else {
            this.field_t = 37;
            if (!this.field_r) {
              this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
              if (fleas.field_A) {
                this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                return;
              } else {
                return;
              }
            } else {
              if (this.field_w == null) {
                L3: {
                  this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
                  if (!fleas.field_A) {
                    break L3;
                  } else {
                    this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                    break L3;
                  }
                }
                return;
              } else {
                this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                return;
              }
            }
          }
        } else {
          this.field_u.a(var2, this.field_a);
          var4 = (-this.field_q + this.field_A) * this.field_n / (this.field_t + -this.field_q);
          if (param0 != 72) {
            this.field_t = 37;
            if (this.field_r) {
              if (this.field_w == null) {
                this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
                if (fleas.field_A) {
                  this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                return;
              }
            } else {
              L4: {
                this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
                if (!fleas.field_A) {
                  break L4;
                } else {
                  this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              L6: {
                L7: {
                  if (!this.field_r) {
                    break L7;
                  } else {
                    if (this.field_w != null) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_y.c(this.field_l + (var4 + -(this.field_y.field_w / 8)), -(this.field_y.field_t / 8) + this.field_a);
                if (!fleas.field_A) {
                  break L5;
                } else {
                  break L6;
                }
              }
              this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
              break L5;
            }
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        L0: {
          var2 = 0;
          var3 = this.field_l;
          var4 = 0;
          if (null != this.field_v) {
            var4 = var4 + this.field_v.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null == this.field_u) {
            break L1;
          } else {
            var4 = var4 + this.field_u.field_e;
            break L1;
          }
        }
        L2: {
          if (null == this.field_v) {
            break L2;
          } else {
            var2 = var2 != 0 | this.field_v.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
            var3 = var3 + this.field_v.field_c;
            break L2;
          }
        }
        if (param0 > 67) {
          stackOut_35_0 = var2;
          stackIn_40_0 = stackOut_35_0;
          stackIn_36_0 = stackOut_35_0;
          if (ag.field_f < var3) {
            stackOut_40_0 = stackIn_40_0;
            stackIn_45_0 = stackOut_40_0;
            stackIn_41_0 = stackOut_40_0;
            if (kc.field_b < this.field_a) {
              stackOut_45_0 = stackIn_45_0;
              stackIn_52_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (-var4 + this.field_n < ag.field_f) {
                stackOut_52_0 = stackIn_52_0;
                stackIn_57_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (this.field_z.field_d >= kc.field_b) {
                  L3: {
                    var2 = stackIn_57_0 | 1;
                    var3 = var3 + (this.field_n - var4);
                    if (null != this.field_u) {
                      var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var2 != 0;
                } else {
                  L4: {
                    var2 = stackIn_53_0 | 0;
                    var3 = var3 + (this.field_n - var4);
                    if (null != this.field_u) {
                      var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return var2 != 0;
                }
              } else {
                stackOut_46_0 = stackIn_46_0;
                stackOut_46_1 = 1;
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                L5: {
                  var2 = stackIn_48_0 | stackIn_48_1;
                  var3 = var3 + (this.field_n - var4);
                  if (null != this.field_u) {
                    var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return var2 != 0;
              }
            } else {
              L6: {
                var2 = stackIn_41_0 | 1;
                var3 = var3 + (this.field_n - var4);
                if (null != this.field_u) {
                  var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              return var2 != 0;
            }
          } else {
            L7: {
              var2 = stackIn_36_0 | 1;
              var3 = var3 + (this.field_n - var4);
              if (null != this.field_u) {
                var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                break L7;
              } else {
                break L7;
              }
            }
            return var2 != 0;
          }
        } else {
          this.field_z = (bi) null;
          stackOut_8_0 = var2;
          stackIn_13_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (ag.field_f < var3) {
            stackOut_13_0 = stackIn_13_0;
            stackIn_18_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (kc.field_b < this.field_a) {
              stackOut_18_0 = stackIn_18_0;
              stackIn_25_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (-var4 + this.field_n < ag.field_f) {
                stackOut_25_0 = stackIn_25_0;
                stackIn_30_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (this.field_z.field_d >= kc.field_b) {
                  L8: {
                    var2 = stackIn_30_0 | 1;
                    var3 = var3 + (this.field_n - var4);
                    if (null != this.field_u) {
                      var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return var2 != 0;
                } else {
                  L9: {
                    var2 = stackIn_26_0 | 0;
                    var3 = var3 + (this.field_n - var4);
                    if (null != this.field_u) {
                      var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return var2 != 0;
                }
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                L10: {
                  var2 = stackIn_21_0 | stackIn_21_1;
                  var3 = var3 + (this.field_n - var4);
                  if (null != this.field_u) {
                    var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return var2 != 0;
              }
            } else {
              L11: {
                var2 = stackIn_14_0 | 1;
                var3 = var3 + (this.field_n - var4);
                if (null != this.field_u) {
                  var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                  break L11;
                } else {
                  break L11;
                }
              }
              return var2 != 0;
            }
          } else {
            L12: {
              var2 = stackIn_9_0 | 1;
              var3 = var3 + (this.field_n - var4);
              if (null != this.field_u) {
                var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
                break L12;
              } else {
                break L12;
              }
            }
            return var2 != 0;
          }
        }
    }

    final void c(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          if (param0 >= 20) {
            break L0;
          } else {
            discarded$1 = el.b((byte) 72);
            break L0;
          }
        }
        if (this.field_k) {
          L1: {
            L2: {
              if (!this.field_r) {
                break L2;
              } else {
                if (null == this.field_w) {
                  break L2;
                } else {
                  var2 = this.field_w.field_t;
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = this.field_y.field_t / 4;
            break L1;
          }
          L3: {
            if (0 != jk.field_r) {
              break L3;
            } else {
              if (-1 == (kc.field_f ^ -1)) {
                L4: {
                  this.field_g = false;
                  this.field_x = false;
                  if (this.field_A < this.field_q) {
                    this.field_A = this.field_q;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (this.field_A <= this.field_t) {
                  return;
                } else {
                  this.field_A = this.field_t;
                  return;
                }
              } else {
                break L3;
              }
            }
          }
          L5: {
            if (this.field_x) {
              if (!this.field_x) {
                if (kc.field_b > this.field_a - (var2 / 2 + -var2)) {
                  this.field_g = false;
                  if (var4 == 0) {
                    break L5;
                  } else {
                    L6: {
                      var3 = ag.field_f - this.field_l;
                      if (this.field_x) {
                        break L6;
                      } else {
                        if (0 > var3) {
                          this.field_g = false;
                          return;
                        } else {
                          if (this.field_n >= var3) {
                            break L6;
                          } else {
                            this.field_g = false;
                            return;
                          }
                        }
                      }
                    }
                    var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                    this.field_x = true;
                    this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                    this.field_g = true;
                    if (var4 == 0) {
                      L7: {
                        if (this.field_A < this.field_q) {
                          this.field_A = this.field_q;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (this.field_A <= this.field_t) {
                        return;
                      } else {
                        this.field_A = this.field_t;
                        return;
                      }
                    } else {
                      L8: {
                        this.field_g = false;
                        this.field_g = false;
                        this.field_x = false;
                        if (this.field_A < this.field_q) {
                          this.field_A = this.field_q;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (this.field_A <= this.field_t) {
                          break L9;
                        } else {
                          this.field_A = this.field_t;
                          break L9;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L10: {
                    var3 = ag.field_f - this.field_l;
                    if (this.field_x) {
                      break L10;
                    } else {
                      if (0 <= var3) {
                        if (this.field_n >= var3) {
                          break L10;
                        } else {
                          this.field_g = false;
                          return;
                        }
                      } else {
                        this.field_g = false;
                        return;
                      }
                    }
                  }
                  var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                  this.field_x = true;
                  this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                  this.field_g = true;
                  if (var4 == 0) {
                    L11: {
                      if (this.field_A < this.field_q) {
                        this.field_A = this.field_q;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (this.field_A > this.field_t) {
                      this.field_A = this.field_t;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L12: {
                      this.field_g = false;
                      this.field_g = false;
                      this.field_x = false;
                      if (this.field_A < this.field_q) {
                        this.field_A = this.field_q;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (this.field_A > this.field_t) {
                      this.field_A = this.field_t;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L13: {
                  var3 = ag.field_f - this.field_l;
                  if (this.field_x) {
                    break L13;
                  } else {
                    if (0 <= var3) {
                      if (this.field_n >= var3) {
                        break L13;
                      } else {
                        this.field_g = false;
                        return;
                      }
                    } else {
                      this.field_g = false;
                      return;
                    }
                  }
                }
                var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                this.field_x = true;
                this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                this.field_g = true;
                if (var4 == 0) {
                  L14: {
                    if (this.field_A < this.field_q) {
                      this.field_A = this.field_q;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (this.field_A <= this.field_t) {
                    return;
                  } else {
                    this.field_A = this.field_t;
                    return;
                  }
                } else {
                  L15: {
                    this.field_g = false;
                    this.field_g = false;
                    this.field_x = false;
                    if (this.field_A < this.field_q) {
                      this.field_A = this.field_q;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  if (this.field_A <= this.field_t) {
                    return;
                  } else {
                    this.field_A = this.field_t;
                    return;
                  }
                }
              }
            } else {
              if (kc.field_b < -(var2 / 2) + this.field_a) {
                this.field_g = false;
                if (var4 == 0) {
                  break L5;
                } else {
                  L16: {
                    this.field_g = false;
                    this.field_x = false;
                    if (this.field_A < this.field_q) {
                      this.field_A = this.field_q;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (this.field_A <= this.field_t) {
                    return;
                  } else {
                    this.field_A = this.field_t;
                    return;
                  }
                }
              } else {
                if (!this.field_x) {
                  if (kc.field_b > this.field_a - (var2 / 2 + -var2)) {
                    this.field_g = false;
                    if (var4 != 0) {
                      var3 = ag.field_f - this.field_l;
                      if (!this.field_x) {
                        if (0 <= var3) {
                          if (this.field_n < var3) {
                            this.field_g = false;
                            return;
                          } else {
                            L17: {
                              var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                              this.field_x = true;
                              this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                              this.field_g = true;
                              if (var4 == 0) {
                                break L17;
                              } else {
                                this.field_g = false;
                                this.field_g = false;
                                this.field_x = false;
                                break L17;
                              }
                            }
                            L18: {
                              if (this.field_A < this.field_q) {
                                this.field_A = this.field_q;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (this.field_A <= this.field_t) {
                                break L19;
                              } else {
                                this.field_A = this.field_t;
                                break L19;
                              }
                            }
                            return;
                          }
                        } else {
                          this.field_g = false;
                          return;
                        }
                      } else {
                        L20: {
                          var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                          this.field_x = true;
                          this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                          this.field_g = true;
                          if (var4 == 0) {
                            break L20;
                          } else {
                            this.field_g = false;
                            this.field_g = false;
                            this.field_x = false;
                            break L20;
                          }
                        }
                        L21: {
                          if (this.field_A < this.field_q) {
                            this.field_A = this.field_q;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (this.field_A <= this.field_t) {
                            break L22;
                          } else {
                            this.field_A = this.field_t;
                            break L22;
                          }
                        }
                        return;
                      }
                    } else {
                      L23: {
                        if (this.field_A < this.field_q) {
                          this.field_A = this.field_q;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (this.field_A <= this.field_t) {
                          break L24;
                        } else {
                          this.field_A = this.field_t;
                          break L24;
                        }
                      }
                      return;
                    }
                  } else {
                    var3 = ag.field_f - this.field_l;
                    if (!this.field_x) {
                      if (0 <= var3) {
                        if (this.field_n < var3) {
                          this.field_g = false;
                          return;
                        } else {
                          L25: {
                            var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                            this.field_x = true;
                            this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                            this.field_g = true;
                            if (var4 == 0) {
                              break L25;
                            } else {
                              this.field_g = false;
                              this.field_g = false;
                              this.field_x = false;
                              break L25;
                            }
                          }
                          L26: {
                            if (this.field_A < this.field_q) {
                              this.field_A = this.field_q;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (this.field_A <= this.field_t) {
                              break L27;
                            } else {
                              this.field_A = this.field_t;
                              break L27;
                            }
                          }
                          return;
                        }
                      } else {
                        this.field_g = false;
                        return;
                      }
                    } else {
                      L28: {
                        var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                        this.field_x = true;
                        this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                        this.field_g = true;
                        if (var4 == 0) {
                          break L28;
                        } else {
                          this.field_g = false;
                          this.field_g = false;
                          this.field_x = false;
                          break L28;
                        }
                      }
                      L29: {
                        if (this.field_A < this.field_q) {
                          this.field_A = this.field_q;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if (this.field_A <= this.field_t) {
                          break L30;
                        } else {
                          this.field_A = this.field_t;
                          break L30;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var3 = ag.field_f - this.field_l;
                  if (!this.field_x) {
                    if (0 <= var3) {
                      if (this.field_n < var3) {
                        this.field_g = false;
                        return;
                      } else {
                        L31: {
                          var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                          this.field_x = true;
                          this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                          this.field_g = true;
                          if (var4 == 0) {
                            break L31;
                          } else {
                            this.field_g = false;
                            this.field_g = false;
                            this.field_x = false;
                            break L31;
                          }
                        }
                        L32: {
                          if (this.field_A < this.field_q) {
                            this.field_A = this.field_q;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (this.field_A <= this.field_t) {
                            break L33;
                          } else {
                            this.field_A = this.field_t;
                            break L33;
                          }
                        }
                        return;
                      }
                    } else {
                      this.field_g = false;
                      return;
                    }
                  } else {
                    L34: {
                      var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> -1443259423);
                      this.field_x = true;
                      this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                      this.field_g = true;
                      if (var4 == 0) {
                        break L34;
                      } else {
                        this.field_g = false;
                        this.field_g = false;
                        this.field_x = false;
                        break L34;
                      }
                    }
                    L35: {
                      if (this.field_A < this.field_q) {
                        this.field_A = this.field_q;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      if (this.field_A <= this.field_t) {
                        break L36;
                      } else {
                        this.field_A = this.field_t;
                        break L36;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          L37: {
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
              break L37;
            } else {
              break L37;
            }
          }
          if (this.field_A <= this.field_t) {
            return;
          } else {
            this.field_A = this.field_t;
            return;
          }
        } else {
          this.field_g = false;
          this.field_c = false;
          return;
        }
    }

    el(int param0, int param1, int param2, bi param3, bi param4, bi param5, dd param6, dd param7) {
        this.field_x = false;
        this.field_q = 0;
        this.field_r = false;
        this.field_A = 50;
        this.field_t = 100;
        try {
            this.field_u = param5;
            this.field_w = param7;
            this.field_n = param2;
            this.field_y = param6;
            this.field_l = param1;
            this.field_v = param3;
            this.field_a = param0;
            this.field_z = param4;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "el.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "This password is part of your Player Name, and would be easy to guess";
    }
}
