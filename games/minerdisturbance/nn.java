/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    int field_e;
    private int field_j;
    boolean field_d;
    int field_i;
    private int field_p;
    private int field_o;
    static ag field_f;
    private int field_b;
    static char field_l;
    static int field_k;
    static ea field_c;
    private int field_g;
    static boolean field_n;
    static r field_r;
    static ae field_m;
    static boolean field_q;
    static ea[] field_h;
    static String field_a;

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -16) {
          L0: {
            this.d(89);
            if (102 != this.field_g) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (102 != this.field_g) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (nj.field_a == null) {
                break L1;
              } else {
                if (nj.field_a.equals(param1.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = nj.field_a;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 >= 83) {
                break L2;
              } else {
                field_n = true;
                break L2;
              }
            }
            L3: {
              if (null == w.field_T) {
                break L3;
              } else {
                if (w.field_T.equals(param1.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = w.field_T;
                  break L3;
                }
              }
            }
            stackIn_9_0 = mj.a((String) (var4), -1, false, (String) (var3), param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("nn.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        var6 = this.a(param0, param3, gb.field_e, param4, param1, 113, nk.field_w);
        var7 = this.a(param0, param3, m.field_e, param4, param1, 50, wi.field_w);
        this.a(var6, var7, -1);
        if (param2 != 140) {
          this.e((byte) -78);
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        java.net.URL var2;
        field_f = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_m = null;
        if (!param0) {
          var2 = (java.net.URL) null;
          nn.a(-84, (java.applet.Applet) null, (java.net.URL) null);
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    final boolean e(byte param0) {
        java.net.URL var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 124) {
          L0: {
            var3 = (java.net.URL) null;
            nn.a(-85, (java.applet.Applet) null, (java.net.URL) null);
            if ((this.field_g ^ -1) != -98) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.field_g ^ -1) != -98) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          this.field_p = param0;
          stackIn_2_0 = this;

          if (!param3) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((nn) (this)).field_d = stackIn_3_1 != 0;
        if (this.field_d) {
          this.field_e = param2;
          return;
        } else {
          this.field_e = param1;
          return;
        }
    }

    final void a(int param0, int param1) {
        if (this.field_p == param1) {
            this.field_e = param0;
            this.field_d = false;
        }
    }

    final boolean a(byte param0) {
        int var2;
        var2 = 77 / ((75 - param0) / 33);
        if (-1 == (this.field_j ^ -1)) {
          if (84 != this.field_g) {
            if (-84 == (this.field_g ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((nn) (this)).field_d = stackIn_3_1 != 0;
        this.field_p = 0;
        if (!this.field_d) {
          if (param2 < 82) {
            this.field_p = 102;
            return;
          } else {
            return;
          }
        } else {
          this.field_e = param1;
          if (param2 >= 82) {
            return;
          } else {
            this.field_p = 102;
            return;
          }
        }
    }

    final boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        if (param0) {
          if (this.field_o == 0) {
            if (this.field_g != 84) {
              if (this.field_g == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.b(12);
          if (this.field_o == 0) {
            if (this.field_g == 84) {
              return true;
            } else {
              L0: {
                if (this.field_g != 83) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void d(int param0) {
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (this.field_p == 0) {
          if ((lj.field_t ^ -1) == -97) {
            L0: {
              if ((this.field_e ^ -1) >= -1) {
                this.field_e = this.field_i;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              this.field_e = this.field_e - 1;
              this.field_d = false;
              if (0 == this.field_p) {
                this.field_g = lj.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != (this.field_p ^ -1)) {
                break L2;
              } else {
                if (lj.field_t == 97) {
                  L3: {
                    this.field_e = this.field_e + 1;
                    if (this.field_i <= this.field_e) {
                      this.field_e = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_d = false;
                  break L2;
                } else {
                  if (param0 != -4664) {
                    this.b(90);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -4664) {
              this.b(90);
              return;
            } else {
              return;
            }
          } else {
            L4: {
              if (0 == this.field_p) {
                this.field_g = lj.field_t;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 != (this.field_p ^ -1)) {
                break L5;
              } else {
                if (lj.field_t == 97) {
                  L6: {
                    this.field_e = this.field_e + 1;
                    if (this.field_i <= this.field_e) {
                      this.field_e = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_d = false;
                  break L5;
                } else {
                  if (param0 != -4664) {
                    this.b(90);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -4664) {
              this.b(90);
              return;
            } else {
              return;
            }
          }
        } else {
          L7: {
            if (0 == this.field_p) {
              this.field_g = lj.field_t;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (-1 != (this.field_p ^ -1)) {
              break L8;
            } else {
              if (lj.field_t == 97) {
                L9: {
                  this.field_e = this.field_e + 1;
                  if (this.field_i <= this.field_e) {
                    this.field_e = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_d = false;
                break L8;
              } else {
                if (param0 != -4664) {
                  this.b(90);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param0 != -4664) {
            this.b(90);
            return;
          } else {
            return;
          }
        }
    }

    final boolean c(int param0) {
        int var2 = 117 / ((param0 - 42) / 55);
        return (this.field_g ^ -1) == -104 ? true : false;
    }

    final boolean a(int param0) {
        int var2 = 43 / ((4 - param0) / 55);
        return this.field_g == 96 ? true : false;
    }

    final void b(byte param0) {
        int var2;
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (0 == this.field_p) {
          if (lj.field_t == 98) {
            if (this.field_e > 0) {
              this.field_d = false;
              this.field_e = this.field_e - 1;
              if (0 != this.field_p) {
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 == (this.field_p ^ -1)) {
                  if (-100 == (lj.field_t ^ -1)) {
                    this.field_e = this.field_e + 1;
                    this.field_d = false;
                    if (this.field_i > this.field_e) {
                      return;
                    } else {
                      this.field_e = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_g = lj.field_t;
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 == (this.field_p ^ -1)) {
                  if (-100 == (lj.field_t ^ -1)) {
                    L0: {
                      this.field_e = this.field_e + 1;
                      this.field_d = false;
                      if (this.field_i <= this.field_e) {
                        this.field_e = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.field_e = this.field_i;
              this.field_d = false;
              this.field_e = this.field_e - 1;
              if (0 != this.field_p) {
                L1: {
                  var2 = 91 % ((param0 - 33) / 54);
                  if (-1 != (this.field_p ^ -1)) {
                    break L1;
                  } else {
                    if (-100 != (lj.field_t ^ -1)) {
                      break L1;
                    } else {
                      this.field_e = this.field_e + 1;
                      this.field_d = false;
                      if (this.field_i <= this.field_e) {
                        this.field_e = 0;
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                this.field_g = lj.field_t;
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 == (this.field_p ^ -1)) {
                  L2: {
                    if (-100 != (lj.field_t ^ -1)) {
                      break L2;
                    } else {
                      this.field_e = this.field_e + 1;
                      this.field_d = false;
                      if (this.field_i <= this.field_e) {
                        this.field_e = 0;
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (0 != this.field_p) {
              var2 = 91 % ((param0 - 33) / 54);
              if (-1 == (this.field_p ^ -1)) {
                if (-100 == (lj.field_t ^ -1)) {
                  this.field_e = this.field_e + 1;
                  this.field_d = false;
                  if (this.field_i <= this.field_e) {
                    this.field_e = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_g = lj.field_t;
              var2 = 91 % ((param0 - 33) / 54);
              if (-1 == (this.field_p ^ -1)) {
                if (-100 == (lj.field_t ^ -1)) {
                  this.field_e = this.field_e + 1;
                  this.field_d = false;
                  if (this.field_i <= this.field_e) {
                    this.field_e = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (0 != this.field_p) {
            var2 = 91 % ((param0 - 33) / 54);
            if (-1 == (this.field_p ^ -1)) {
              if (-100 == (lj.field_t ^ -1)) {
                this.field_e = this.field_e + 1;
                this.field_d = false;
                if (this.field_i > this.field_e) {
                  return;
                } else {
                  this.field_e = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_g = lj.field_t;
            var2 = 91 % ((param0 - 33) / 54);
            if (-1 == (this.field_p ^ -1)) {
              if (-100 == (lj.field_t ^ -1)) {
                this.field_e = this.field_e + 1;
                this.field_d = false;
                if (this.field_i > this.field_e) {
                  return;
                } else {
                  this.field_e = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 77) {
          L0: {
            this.c((byte) -76);
            if (0 == this.field_p) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == this.field_p) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    nn(int param0) {
        this.field_e = 0;
        this.field_d = false;
        this.field_i = param0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= param4) {
          if (param3 > param6) {
            if (param0 > param2) {
              if (param5 < 34) {
                this.a(-46, 20, -121, 53, 72);
                return -1;
              } else {
                return -1;
              }
            } else {
              if (param0 - -(param1 * this.field_i) <= param2) {
                if (param5 < 34) {
                  this.a(-46, 20, -121, 53, 72);
                  return -1;
                } else {
                  return -1;
                }
              } else {
                return (param2 + -param0) / param1;
              }
            }
          } else {
            if (param5 < 34) {
              this.a(-46, 20, -121, 53, 72);
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param5 < 34) {
            this.a(-46, 20, -121, 53, 72);
            return -1;
          } else {
            return -1;
          }
        }
    }

    final void c(byte param0) {
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (param0 > 80) {
          if (this.field_p == 0) {
            this.field_g = lj.field_t;
            return;
          } else {
            return;
          }
        } else {
          this.a(false, 50, -65);
          if (this.field_p != 0) {
            return;
          } else {
            this.field_g = lj.field_t;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_i > param0) {
          if (param1 < this.field_i) {
            L0: {
              this.field_j = 0;
              this.field_g = 0;
              this.field_o = 0;
              if (0 != jk.field_ab) {
                this.field_b = q.field_d;
                this.field_d = true;
                this.field_j = jk.field_ab;
                this.field_o = jk.field_ab;
                this.field_e = param1;
                this.field_p = jk.field_ab;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (this.field_p ^ -1)) {
              if (-1 != (ld.field_B ^ -1)) {
                if (this.field_b > 0) {
                  this.field_b = this.field_b - 1;
                  if (0 == jk.field_ab) {
                    L1: {
                      if (-1 == (ld.field_B ^ -1)) {
                        this.field_p = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param2 == (this.field_p ^ -1)) {
                      L2: {
                        if (this.field_d) {
                          break L2;
                        } else {
                          if (k.field_i) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= param0) {
                        if (param0 == this.field_e) {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        } else {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        }
                      } else {
                        L3: {
                          if (this.field_d) {
                            this.field_e = -1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param2 == (this.field_p ^ -1)) {
                      L4: {
                        if (this.field_d) {
                          break L4;
                        } else {
                          if (k.field_i) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= param0) {
                        if (param0 == this.field_e) {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        } else {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        }
                      } else {
                        L5: {
                          if (this.field_d) {
                            this.field_e = -1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  this.field_j = this.field_p;
                  this.field_b = bi.field_q;
                  L6: {
                    this.field_b = this.field_b - 1;
                    if (0 != jk.field_ab) {
                      break L6;
                    } else {
                      if (-1 == (ld.field_B ^ -1)) {
                        this.field_p = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (param2 == (this.field_p ^ -1)) {
                    L7: {
                      if (this.field_d) {
                        break L7;
                      } else {
                        if (k.field_i) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 <= param0) {
                      if (param0 == this.field_e) {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      } else {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      }
                    } else {
                      if (this.field_d) {
                        this.field_e = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  if (0 != jk.field_ab) {
                    break L8;
                  } else {
                    if (-1 == (ld.field_B ^ -1)) {
                      this.field_p = 0;
                      break L8;
                    } else {
                      if (param2 == (this.field_p ^ -1)) {
                        if (this.field_d) {
                          if (0 <= param0) {
                            if (param0 == this.field_e) {
                              this.field_e = param0;
                              this.field_d = true;
                              return;
                            } else {
                              this.field_e = param0;
                              this.field_d = true;
                              return;
                            }
                          } else {
                            if (this.field_d) {
                              this.field_e = -1;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (k.field_i) {
                            if (0 <= param0) {
                              if (param0 == this.field_e) {
                                this.field_e = param0;
                                this.field_d = true;
                                return;
                              } else {
                                this.field_e = param0;
                                this.field_d = true;
                                return;
                              }
                            } else {
                              if (this.field_d) {
                                this.field_e = -1;
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param2 == (this.field_p ^ -1)) {
                  if (this.field_d) {
                    if (0 <= param0) {
                      if (param0 == this.field_e) {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      } else {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      }
                    } else {
                      if (!this.field_d) {
                        return;
                      } else {
                        this.field_e = -1;
                        return;
                      }
                    }
                  } else {
                    if (k.field_i) {
                      if (0 <= param0) {
                        if (param0 == this.field_e) {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        } else {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        }
                      } else {
                        if (!this.field_d) {
                          return;
                        } else {
                          this.field_e = -1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L9: {
                if (0 != jk.field_ab) {
                  break L9;
                } else {
                  if (-1 == (ld.field_B ^ -1)) {
                    this.field_p = 0;
                    break L9;
                  } else {
                    if (param2 == (this.field_p ^ -1)) {
                      L10: {
                        if (this.field_d) {
                          break L10;
                        } else {
                          if (k.field_i) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= param0) {
                        if (param0 == this.field_e) {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        } else {
                          this.field_e = param0;
                          this.field_d = true;
                          return;
                        }
                      } else {
                        L11: {
                          if (this.field_d) {
                            this.field_e = -1;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param2 == (this.field_p ^ -1)) {
                if (this.field_d) {
                  if (0 <= param0) {
                    if (param0 == this.field_e) {
                      this.field_e = param0;
                      this.field_d = true;
                      return;
                    } else {
                      this.field_e = param0;
                      this.field_d = true;
                      return;
                    }
                  } else {
                    if (!this.field_d) {
                      return;
                    } else {
                      this.field_e = -1;
                      return;
                    }
                  }
                } else {
                  if (k.field_i) {
                    if (0 <= param0) {
                      if (param0 == this.field_e) {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      } else {
                        this.field_e = param0;
                        this.field_d = true;
                        return;
                      }
                    } else {
                      L12: {
                        if (this.field_d) {
                          this.field_e = -1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
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
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    static {
        field_f = new ag();
        field_l = ',';
        field_k = 5;
        field_c = new ea(540, 140);
        field_r = new r();
        field_m = new ae();
        field_h = new ea[2];
        field_a = "<%0> <times> 1,000 = <%1>";
    }
}
