/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int field_f;
    int field_n;
    static String field_a;
    private int field_s;
    static je field_d;
    private int field_r;
    boolean field_h;
    private int field_o;
    private int field_p;
    static String field_u;
    private ok field_k;
    private int field_e;
    private int field_j;
    private float field_v;
    static String[] field_q;
    private int field_t;
    static String field_w;
    private int field_i;
    private int field_m;
    private int field_x;
    static boolean field_c;
    private int field_l;
    private int field_g;
    private int field_b;

    final void a(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_n = param1;
        if (param2 == -8717) {
            return;
        }
        this.c((byte) -71);
    }

    final static void a(byte param0, tc param1, tc param2) {
        try {
            if (!(param1.field_j == null)) {
                param1.d(-105);
            }
            param1.field_j = param2.field_j;
            if (param0 != -123) {
                field_a = (String) null;
            }
            param1.field_b = param2;
            param1.field_j.field_b = param1;
            param1.field_b.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_g = param0;
        this.field_m = param1;
        if (param2 == -30514) {
            return;
        }
        this.field_o = 12;
    }

    final static void a(java.awt.Frame param0, hd param1, int param2) {
        wo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 == -2) {
              L1: while (true) {
                var3 = param1.a((byte) -68, param0);
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        if (-1 != (var3.field_g ^ -1)) {
                          break L5;
                        } else {
                          nu.a(10L, 0);
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if ((var3.field_g ^ -1) != -2) {
                        nu.a(100L, 0);
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          nu.a(100L, 0);
                          break L4;
                        }
                      }
                    }
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                  param0.setVisible(false);
                  param0.dispose();
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("fj.J(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fj(ok param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final boolean c(int param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 == 122) {
          if (param0 >= this.field_l) {
            if (this.field_r >= param0) {
              if (param2 >= this.field_i) {
                if (param2 <= this.field_x) {
                  if (this.field_v != 0.0f) {
                    if (Math.round(this.field_v * (float)param2) == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0) {
        if (param0 == 103) {
          if (this.field_o <= hq.field_f) {
            if ((df.field_M ^ -1) >= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(-97);
          if (this.field_o <= hq.field_f) {
            if ((df.field_M ^ -1) >= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0) {
        this.field_k.a(this.field_j, -32263, this.field_e);
        if (param0 >= 114) {
            return;
        }
        this.field_j = -64;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            if (param1 != 35) {
                tc var3 = (tc) null;
                fj.a((byte) -121, (tc) null, (tc) null);
            }
            param0.removeKeyListener(va.field_w);
            param0.removeFocusListener(va.field_w);
            us.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 > 38) {
          if (-1 > (df.field_M ^ -1)) {
            if (this.field_o <= hq.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_w = (String) null;
          if (-1 > (df.field_M ^ -1)) {
            if (this.field_o <= hq.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0) {
        int fieldTemp$1 = 0;
        if (null == wq.field_a) {
          L0: {
            if (-1 <= (df.field_M ^ -1)) {
              this.field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_h) {
            if (bn.field_b < this.field_m) {
              sp.field_b = (this.field_m - bn.field_b) / 2;
              if (bn.field_b == this.field_t) {
                if (dt.field_a == this.field_s) {
                  return;
                } else {
                  this.field_k.a(this.field_s, -32263, this.field_t);
                  return;
                }
              } else {
                this.field_k.a(this.field_s, -32263, this.field_t);
                return;
              }
            } else {
              if ((this.field_m ^ -1) < -1) {
                sp.field_b = 0;
                if (ArmiesOfGielinor.field_M) {
                  sp.field_b = (this.field_m - bn.field_b) / 2;
                  if (bn.field_b == this.field_t) {
                    if (dt.field_a == this.field_s) {
                      return;
                    } else {
                      this.field_k.a(this.field_s, -32263, this.field_t);
                      return;
                    }
                  } else {
                    this.field_k.a(this.field_s, -32263, this.field_t);
                    return;
                  }
                } else {
                  if (bn.field_b == this.field_t) {
                    if (dt.field_a == this.field_s) {
                      return;
                    } else {
                      this.field_k.a(this.field_s, -32263, this.field_t);
                      return;
                    }
                  } else {
                    this.field_k.a(this.field_s, -32263, this.field_t);
                    return;
                  }
                }
              } else {
                if (bn.field_b == this.field_t) {
                  if (dt.field_a == this.field_s) {
                    return;
                  } else {
                    this.field_k.a(this.field_s, -32263, this.field_t);
                    return;
                  }
                } else {
                  this.field_k.a(this.field_s, -32263, this.field_t);
                  return;
                }
              }
            }
          } else {
            fieldTemp$1 = this.field_p - 1;
            this.field_p = this.field_p - 1;
            if (-1 <= (fieldTemp$1 ^ -1)) {
              this.field_p = this.field_b;
              if (this.field_o <= hq.field_f) {
                if (param0 == 0) {
                  this.c((byte) 56);
                  return;
                } else {
                  this.field_e = 67;
                  this.c((byte) 56);
                  return;
                }
              } else {
                this.field_h = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final rd c(int param0) {
        rd var2 = null;
        this.field_j = dt.field_a;
        if (param0 == -1) {
          this.field_e = bn.field_b;
          this.field_k.a(this.field_n, param0 ^ 32262, this.field_f);
          tq.field_a = false;
          var2 = dj.a(this.field_f, 0, ft.field_m, -71, 0, this.field_n);
          if (var2 == null) {
            this.b(124);
            return var2;
          } else {
            return var2;
          }
        } else {
          fj.b((byte) -86);
          this.field_e = bn.field_b;
          this.field_k.a(this.field_n, param0 ^ 32262, this.field_f);
          tq.field_a = false;
          var2 = dj.a(this.field_f, 0, ft.field_m, -71, 0, this.field_n);
          if (var2 != null) {
            return var2;
          } else {
            this.b(124);
            return var2;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = -107 / ((57 - param0) / 47);
        field_q = null;
        field_a = null;
        field_w = null;
        field_d = null;
        field_u = null;
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_m;
        if (param0 == 56) {
          var3 = this.field_g;
          if (!this.a((byte) 103)) {
            this.field_h = false;
            return;
          } else {
            L0: {
              L1: {
                if (var2 <= this.field_r) {
                  break L1;
                } else {
                  var2 = this.field_r;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (var2 >= this.field_l) {
                break L0;
              } else {
                var2 = this.field_l;
                break L0;
              }
            }
            L2: {
              L3: {
                if (var3 <= this.field_x) {
                  break L3;
                } else {
                  var3 = this.field_x;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_i <= var3) {
                break L2;
              } else {
                var3 = this.field_i;
                break L2;
              }
            }
            if (0.0f < this.field_v) {
              L4: {
                L5: {
                  var4 = (int)(this.field_v * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    break L5;
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      if (bn.field_b != var2) {
                        this.field_k.a(var3, -32263, var2);
                        if ((this.field_m ^ -1) >= -1) {
                          return;
                        } else {
                          sp.field_b = (-bn.field_b + this.field_m) / 2;
                          return;
                        }
                      } else {
                        if (dt.field_a == var3) {
                          if ((this.field_m ^ -1) >= -1) {
                            return;
                          } else {
                            sp.field_b = (-bn.field_b + this.field_m) / 2;
                            return;
                          }
                        } else {
                          this.field_k.a(var3, -32263, var2);
                          if ((this.field_m ^ -1) >= -1) {
                            return;
                          } else {
                            sp.field_b = (-bn.field_b + this.field_m) / 2;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_v);
                break L4;
              }
              if (bn.field_b != var2) {
                this.field_k.a(var3, -32263, var2);
                if ((this.field_m ^ -1) < -1) {
                  sp.field_b = (-bn.field_b + this.field_m) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (dt.field_a == var3) {
                  if ((this.field_m ^ -1) < -1) {
                    sp.field_b = (-bn.field_b + this.field_m) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_k.a(var3, -32263, var2);
                  if ((this.field_m ^ -1) < -1) {
                    sp.field_b = (-bn.field_b + this.field_m) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (bn.field_b != var2) {
                this.field_k.a(var3, -32263, var2);
                if ((this.field_m ^ -1) >= -1) {
                  return;
                } else {
                  sp.field_b = (-bn.field_b + this.field_m) / 2;
                  return;
                }
              } else {
                if (dt.field_a != var3) {
                  this.field_k.a(var3, -32263, var2);
                  if ((this.field_m ^ -1) >= -1) {
                    return;
                  } else {
                    sp.field_b = (-bn.field_b + this.field_m) / 2;
                    return;
                  }
                } else {
                  if ((this.field_m ^ -1) >= -1) {
                    return;
                  } else {
                    sp.field_b = (-bn.field_b + this.field_m) / 2;
                    return;
                  }
                }
              }
            }
          }
        } else {
          this.field_n = 17;
          var3 = this.field_g;
          if (!this.a((byte) 103)) {
            this.field_h = false;
            return;
          } else {
            L6: {
              L7: {
                if (var2 <= this.field_r) {
                  break L7;
                } else {
                  var2 = this.field_r;
                  if (var5 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (var2 >= this.field_l) {
                break L6;
              } else {
                var2 = this.field_l;
                break L6;
              }
            }
            L8: {
              L9: {
                if (var3 <= this.field_x) {
                  break L9;
                } else {
                  var3 = this.field_x;
                  if (var5 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (this.field_i <= var3) {
                break L8;
              } else {
                var3 = this.field_i;
                break L8;
              }
            }
            L10: {
              if (0.0f < this.field_v) {
                L11: {
                  var4 = (int)(this.field_v * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    break L11;
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_v);
                break L10;
              } else {
                break L10;
              }
            }
            L12: {
              if (bn.field_b != var2) {
                this.field_k.a(var3, -32263, var2);
                break L12;
              } else {
                if (dt.field_a != var3) {
                  this.field_k.a(var3, -32263, var2);
                  break L12;
                } else {
                  if ((this.field_m ^ -1) >= -1) {
                    return;
                  } else {
                    sp.field_b = (-bn.field_b + this.field_m) / 2;
                    return;
                  }
                }
              }
            }
            if ((this.field_m ^ -1) >= -1) {
              return;
            } else {
              sp.field_b = (-bn.field_b + this.field_m) / 2;
              return;
            }
          }
        }
    }

    private fj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ok param8) {
        try {
            this.field_v = 0.0f;
            this.field_k = param8;
            this.field_t = param4;
            this.field_x = param3;
            this.field_r = param2;
            this.field_s = param5;
            this.field_l = param0;
            this.field_b = param7;
            this.field_i = param1;
            this.field_f = 640;
            this.field_n = 480;
            this.field_h = false;
            this.field_o = param6;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Back";
        field_w = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Spells of great power to cause harm to your enemies.";
    }
}
