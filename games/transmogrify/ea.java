/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_n;
    private boolean field_g;
    private int field_j;
    private int field_a;
    private int field_d;
    private int field_b;
    private int field_h;
    private int field_l;
    private jb field_r;
    private int field_c;
    private float field_s;
    private int field_o;
    private int field_i;
    private int field_k;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_f;
    private int field_e;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_c;
        if (param0 >= 83) {
          var3 = this.field_q;
          if (!this.a(48)) {
            this.field_g = false;
            return;
          } else {
            L0: {
              L1: {
                if (var3 > this.field_j) {
                  break L1;
                } else {
                  if (this.field_k > var3) {
                    var3 = this.field_k;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    L2: {
                      L3: {
                        if (this.field_i < var2) {
                          break L3;
                        } else {
                          if (var2 >= this.field_l) {
                            break L2;
                          } else {
                            var2 = this.field_l;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var2 = this.field_i;
                      break L2;
                    }
                    L4: {
                      if (this.field_s > 0.0f) {
                        L5: {
                          var4 = (int)((float)var3 * this.field_s + 0.5f);
                          if (var4 > var2) {
                            break L5;
                          } else {
                            if (var4 >= var2) {
                              break L4;
                            } else {
                              var2 = var4;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var3 = (int)((float)var2 / this.field_s);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (fk.field_E != var2) {
                        this.field_r.a(var2, var3, -23222);
                        break L6;
                      } else {
                        if (var3 == mk.field_x) {
                          break L6;
                        } else {
                          this.field_r.a(var2, var3, -23222);
                          break L6;
                        }
                      }
                    }
                    if (0 < this.field_c) {
                      gl.field_D = (-fk.field_E + this.field_c) / 2;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              var3 = this.field_j;
              break L0;
            }
            L7: {
              L8: {
                if (this.field_i < var2) {
                  break L8;
                } else {
                  if (var2 >= this.field_l) {
                    break L7;
                  } else {
                    var2 = this.field_l;
                    if (var5 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var2 = this.field_i;
              break L7;
            }
            if (this.field_s > 0.0f) {
              L9: {
                L10: {
                  var4 = (int)((float)var3 * this.field_s + 0.5f);
                  if (var4 > var2) {
                    break L10;
                  } else {
                    if (var4 >= var2) {
                      break L9;
                    } else {
                      var2 = var4;
                      if (var5 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_s);
                break L9;
              }
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3, -23222);
                if (0 < this.field_c) {
                  gl.field_D = (-fk.field_E + this.field_c) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (var3 == mk.field_x) {
                  if (0 < this.field_c) {
                    gl.field_D = (-fk.field_E + this.field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_r.a(var2, var3, -23222);
                  if (0 < this.field_c) {
                    gl.field_D = (-fk.field_E + this.field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3, -23222);
                if (0 >= this.field_c) {
                  return;
                } else {
                  gl.field_D = (-fk.field_E + this.field_c) / 2;
                  return;
                }
              } else {
                if (var3 == mk.field_x) {
                  if (0 < this.field_c) {
                    gl.field_D = (-fk.field_E + this.field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_r.a(var2, var3, -23222);
                  if (0 < this.field_c) {
                    gl.field_D = (-fk.field_E + this.field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          field_n = (String) null;
          var3 = this.field_q;
          if (!this.a(48)) {
            this.field_g = false;
            return;
          } else {
            L11: {
              L12: {
                if (var3 > this.field_j) {
                  break L12;
                } else {
                  if (this.field_k > var3) {
                    var3 = this.field_k;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              var3 = this.field_j;
              break L11;
            }
            L13: {
              L14: {
                if (this.field_i < var2) {
                  break L14;
                } else {
                  if (var2 >= this.field_l) {
                    break L13;
                  } else {
                    var2 = this.field_l;
                    if (var5 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var2 = this.field_i;
              break L13;
            }
            L15: {
              if (this.field_s > 0.0f) {
                L16: {
                  var4 = (int)((float)var3 * this.field_s + 0.5f);
                  if (var4 > var2) {
                    break L16;
                  } else {
                    if (var4 >= var2) {
                      break L15;
                    } else {
                      var2 = var4;
                      if (var5 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_s);
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3, -23222);
                break L17;
              } else {
                if (var3 != mk.field_x) {
                  this.field_r.a(var2, var3, -23222);
                  break L17;
                } else {
                  L18: {
                    if (0 >= this.field_c) {
                      break L18;
                    } else {
                      gl.field_D = (-fk.field_E + this.field_c) / 2;
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
            if (0 >= this.field_c) {
              return;
            } else {
              gl.field_D = (-fk.field_E + this.field_c) / 2;
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 <= 102) {
          this.field_h = 4;
          this.field_q = param0;
          this.field_c = param1;
          return;
        } else {
          this.field_q = param0;
          this.field_c = param1;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 >= 47) {
          if (this.field_h <= qa.field_p) {
            if (-1 <= (wj.field_o ^ -1)) {
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

    final dg d(byte param0) {
        dg var2 = null;
        this.field_p = fk.field_E;
        this.field_e = mk.field_x;
        this.field_r.a(this.field_a, this.field_o, -23222);
        if (param0 != -18) {
          L0: {
            this.a((byte) -73);
            mg.field_c = false;
            var2 = ql.a(0, 0, lk.field_b, 0, this.field_a, this.field_o);
            if (var2 == null) {
              this.c((byte) -125);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            mg.field_c = false;
            var2 = ql.a(0, 0, lk.field_b, 0, this.field_a, this.field_o);
            if (var2 == null) {
              this.c((byte) -125);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final void b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (ub.field_c != null) {
          return;
        } else {
          if (param0 < wj.field_o) {
            if (!this.field_g) {
              L0: {
                if (this.field_c > fk.field_E) {
                  break L0;
                } else {
                  if (this.field_c > 0) {
                    gl.field_D = 0;
                    if (!Transmogrify.field_A) {
                      if (this.field_d == fk.field_E) {
                        if (mk.field_x != this.field_f) {
                          this.field_r.a(this.field_d, this.field_f, -23222);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_r.a(this.field_d, this.field_f, -23222);
                        return;
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    if (this.field_d == fk.field_E) {
                      if (mk.field_x != this.field_f) {
                        this.field_r.a(this.field_d, this.field_f, -23222);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_r.a(this.field_d, this.field_f, -23222);
                      return;
                    }
                  }
                }
              }
              gl.field_D = (-fk.field_E + this.field_c) / 2;
              if (this.field_d == fk.field_E) {
                if (mk.field_x != this.field_f) {
                  this.field_r.a(this.field_d, this.field_f, -23222);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_r.a(this.field_d, this.field_f, -23222);
                return;
              }
            } else {
              fieldTemp$2 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              if (-1 <= (fieldTemp$2 ^ -1)) {
                this.field_m = this.field_b;
                if (qa.field_p < this.field_h) {
                  this.field_g = false;
                  return;
                } else {
                  this.a((byte) 107);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_g = false;
            if (!this.field_g) {
              L1: {
                L2: {
                  if (this.field_c > fk.field_E) {
                    break L2;
                  } else {
                    if (this.field_c > 0) {
                      gl.field_D = 0;
                      if (Transmogrify.field_A) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_d != fk.field_E) {
                            this.field_r.a(this.field_d, this.field_f, -23222);
                            break L3;
                          } else {
                            if (mk.field_x == this.field_f) {
                              break L3;
                            } else {
                              this.field_r.a(this.field_d, this.field_f, -23222);
                              break L3;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                gl.field_D = (-fk.field_E + this.field_c) / 2;
                break L1;
              }
              if (this.field_d == fk.field_E) {
                if (mk.field_x == this.field_f) {
                  return;
                } else {
                  this.field_r.a(this.field_d, this.field_f, -23222);
                  return;
                }
              } else {
                this.field_r.a(this.field_d, this.field_f, -23222);
                return;
              }
            } else {
              fieldTemp$3 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              if (-1 <= (fieldTemp$3 ^ -1)) {
                this.field_m = this.field_b;
                if (qa.field_p < this.field_h) {
                  this.field_g = false;
                  return;
                } else {
                  this.a((byte) 107);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = -90 / ((param0 - -63) / 61);
        this.field_r.a(this.field_p, this.field_e, -23222);
    }

    final static void a(byte param0, java.applet.Applet param1, boolean param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  if (fe.field_k.startsWith("win")) {
                    if (ca.a(param3, param0 + 2117267372)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    L3: {
                      if (param0 == 68) {
                        break L3;
                      } else {
                        field_n = (String) null;
                        break L3;
                      }
                    }
                    param1.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    d.a((Throwable) null, param0 + -180, "MGR1: " + param3);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var4_ref);
                stackOut_11_1 = new StringBuilder().append("ea.H(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param3 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static mi a(byte[] param0, int param1) {
        mi var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        mi stackIn_5_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_6_0 = null;
        mi stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 == 0) {
                var2 = new mi(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, re.field_K);
                wd.d(-109);
                stackOut_6_0 = (mi) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (mi) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("ea.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mi) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = -83 / ((-62 - param0) / 63);
        field_n = null;
    }

    private ea() throws Throwable {
        throw new Error();
    }

    static {
    }
}
