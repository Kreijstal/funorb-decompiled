/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_a;
    private int field_h;
    private int field_v;
    private int field_c;
    static String field_m;
    private int field_p;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_j;
    private int field_f;
    private int field_g;
    private float field_i;
    static java.awt.Color field_q;
    private int field_o;
    static String field_e;
    private db field_u;
    private int field_s;
    static String field_n;
    private boolean field_t;
    static gk field_l;
    static long field_r;

    public static void a(boolean param0) {
        byte[] var2;
        field_n = null;
        field_m = null;
        field_l = null;
        if (!param0) {
          var2 = (byte[]) null;
          v.a((byte[]) null, -18);
          field_q = null;
          field_e = null;
          return;
        } else {
          field_q = null;
          field_e = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_d = param2;
        if (param0 < 125) {
            this.a((byte) 31);
            this.field_p = param1;
            return;
        }
        this.field_p = param1;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        qc var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new qc(param0);
              var3 = var9.c((byte) 34);
              var4 = var9.a((byte) -97);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (-1 == (uj.field_b ^ -1)) {
                    break L2;
                  } else {
                    if (var4 > uj.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param1 != (var3 ^ -1)) {
                  L3: {
                    var5 = var9.a((byte) -49);
                    if ((var5 ^ -1) > -1) {
                      break L3;
                    } else {
                      L4: {
                        if (uj.field_b == 0) {
                          break L4;
                        } else {
                          if (uj.field_b < var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (-2 == (var3 ^ -1)) {
                          tb.a(var13, var5, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = sc.field_b;
                          synchronized (var7) {
                            L6: {
                              sc.field_b.a(param1 + 0, var9, var13);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.b(29915, var4, var12, 0);
                  stackIn_7_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("v.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_21_0;
        }
    }

    final void b(byte param0) {
        this.field_u.a(-2964, this.field_g, this.field_b);
        if (param0 > -5) {
            this.b(false);
        }
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null != vl.field_n) {
          return;
        } else {
          if (param0 < -108) {
            if ((og.field_n ^ -1) < -1) {
              if (this.field_t) {
                fieldTemp$0 = this.field_c - 1;
                this.field_c = this.field_c - 1;
                if (0 < fieldTemp$0) {
                  return;
                } else {
                  this.field_c = this.field_s;
                  if (this.field_k > li.field_c) {
                    this.field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                if (this.field_d <= kh.field_d) {
                  if (this.field_d <= 0) {
                    if (kh.field_d == this.field_a) {
                      if (ok.field_c == this.field_h) {
                        return;
                      } else {
                        this.field_u.a(-2964, this.field_a, this.field_h);
                        return;
                      }
                    } else {
                      this.field_u.a(-2964, this.field_a, this.field_h);
                      return;
                    }
                  } else {
                    qa.field_b = 0;
                    if (kh.field_d == this.field_a) {
                      if (ok.field_c != this.field_h) {
                        this.field_u.a(-2964, this.field_a, this.field_h);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_u.a(-2964, this.field_a, this.field_h);
                      return;
                    }
                  }
                } else {
                  qa.field_b = (-kh.field_d + this.field_d) / 2;
                  if (kh.field_d == this.field_a) {
                    if (ok.field_c != this.field_h) {
                      this.field_u.a(-2964, this.field_a, this.field_h);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_u.a(-2964, this.field_a, this.field_h);
                    return;
                  }
                }
              }
            } else {
              this.field_t = false;
              if (this.field_t) {
                fieldTemp$1 = this.field_c - 1;
                this.field_c = this.field_c - 1;
                if (0 < fieldTemp$1) {
                  return;
                } else {
                  this.field_c = this.field_s;
                  if (this.field_k > li.field_c) {
                    this.field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                L0: {
                  if (this.field_d <= kh.field_d) {
                    if (this.field_d <= 0) {
                      break L0;
                    } else {
                      qa.field_b = 0;
                      break L0;
                    }
                  } else {
                    qa.field_b = (-kh.field_d + this.field_d) / 2;
                    break L0;
                  }
                }
                if (kh.field_d == this.field_a) {
                  if (ok.field_c != this.field_h) {
                    this.field_u.a(-2964, this.field_a, this.field_h);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_u.a(-2964, this.field_a, this.field_h);
                  return;
                }
              }
            }
          } else {
            this.field_a = -79;
            if ((og.field_n ^ -1) >= -1) {
              this.field_t = false;
              if (this.field_t) {
                fieldTemp$2 = this.field_c - 1;
                this.field_c = this.field_c - 1;
                if (0 < fieldTemp$2) {
                  return;
                } else {
                  this.field_c = this.field_s;
                  if (this.field_k > li.field_c) {
                    this.field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                if (this.field_d <= kh.field_d) {
                  if (this.field_d <= 0) {
                    L1: {
                      if (kh.field_d != this.field_a) {
                        this.field_u.a(-2964, this.field_a, this.field_h);
                        break L1;
                      } else {
                        if (ok.field_c == this.field_h) {
                          break L1;
                        } else {
                          this.field_u.a(-2964, this.field_a, this.field_h);
                          break L1;
                        }
                      }
                    }
                    return;
                  } else {
                    qa.field_b = 0;
                    L2: {
                      if (kh.field_d != this.field_a) {
                        this.field_u.a(-2964, this.field_a, this.field_h);
                        break L2;
                      } else {
                        if (ok.field_c == this.field_h) {
                          break L2;
                        } else {
                          this.field_u.a(-2964, this.field_a, this.field_h);
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  qa.field_b = (-kh.field_d + this.field_d) / 2;
                  L3: {
                    if (kh.field_d != this.field_a) {
                      this.field_u.a(-2964, this.field_a, this.field_h);
                      break L3;
                    } else {
                      if (ok.field_c == this.field_h) {
                        break L3;
                      } else {
                        this.field_u.a(-2964, this.field_a, this.field_h);
                        break L3;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (this.field_t) {
                fieldTemp$3 = this.field_c - 1;
                this.field_c = this.field_c - 1;
                if (0 < fieldTemp$3) {
                  return;
                } else {
                  this.field_c = this.field_s;
                  if (this.field_k > li.field_c) {
                    this.field_t = false;
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              } else {
                L4: {
                  if (this.field_d <= kh.field_d) {
                    if (this.field_d <= 0) {
                      break L4;
                    } else {
                      qa.field_b = 0;
                      break L4;
                    }
                  } else {
                    qa.field_b = (-kh.field_d + this.field_d) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (kh.field_d != this.field_a) {
                    this.field_u.a(-2964, this.field_a, this.field_h);
                    break L5;
                  } else {
                    if (ok.field_c == this.field_h) {
                      break L5;
                    } else {
                      this.field_u.a(-2964, this.field_a, this.field_h);
                      break L5;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        var2 = this.field_d;
        var3 = this.field_p;
        if (!this.a(-123)) {
          this.field_t = false;
          return;
        } else {
          L0: {
            if (this.field_j >= var2) {
              if (var2 >= this.field_f) {
                break L0;
              } else {
                var2 = this.field_f;
                break L0;
              }
            } else {
              var2 = this.field_j;
              break L0;
            }
          }
          if (var3 <= this.field_v) {
            L1: {
              if (var3 >= this.field_o) {
                break L1;
              } else {
                var3 = this.field_o;
                break L1;
              }
            }
            if (0.0f < this.field_i) {
              var4 = (int)(0.5f + (float)var3 * this.field_i);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_i);
                if (param0) {
                  if (kh.field_d != var2) {
                    this.field_u.a(-2964, var2, var3);
                    if (this.field_d <= 0) {
                      return;
                    } else {
                      qa.field_b = (-kh.field_d + this.field_d) / 2;
                      return;
                    }
                  } else {
                    if (var3 != ok.field_c) {
                      this.field_u.a(-2964, var2, var3);
                      if (this.field_d <= 0) {
                        return;
                      } else {
                        qa.field_b = (-kh.field_d + this.field_d) / 2;
                        return;
                      }
                    } else {
                      if (this.field_d <= 0) {
                        return;
                      } else {
                        qa.field_b = (-kh.field_d + this.field_d) / 2;
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  if (param0) {
                    if (kh.field_d != var2) {
                      L2: {
                        this.field_u.a(-2964, var2, var3);
                        if (this.field_d <= 0) {
                          break L2;
                        } else {
                          qa.field_b = (-kh.field_d + this.field_d) / 2;
                          break L2;
                        }
                      }
                      return;
                    } else {
                      if (var3 != ok.field_c) {
                        L3: {
                          this.field_u.a(-2964, var2, var3);
                          if (this.field_d <= 0) {
                            break L3;
                          } else {
                            qa.field_b = (-kh.field_d + this.field_d) / 2;
                            break L3;
                          }
                        }
                        return;
                      } else {
                        if (this.field_d <= 0) {
                          return;
                        } else {
                          qa.field_b = (-kh.field_d + this.field_d) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (param0) {
                    if (kh.field_d != var2) {
                      this.field_u.a(-2964, var2, var3);
                      if (this.field_d > 0) {
                        qa.field_b = (-kh.field_d + this.field_d) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 != ok.field_c) {
                        this.field_u.a(-2964, var2, var3);
                        if (this.field_d <= 0) {
                          return;
                        } else {
                          qa.field_b = (-kh.field_d + this.field_d) / 2;
                          return;
                        }
                      } else {
                        if (this.field_d > 0) {
                          qa.field_b = (-kh.field_d + this.field_d) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0) {
                if (kh.field_d != var2) {
                  this.field_u.a(-2964, var2, var3);
                  if (this.field_d > 0) {
                    qa.field_b = (-kh.field_d + this.field_d) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var3 != ok.field_c) {
                    this.field_u.a(-2964, var2, var3);
                    if (this.field_d > 0) {
                      qa.field_b = (-kh.field_d + this.field_d) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (this.field_d > 0) {
                      qa.field_b = (-kh.field_d + this.field_d) / 2;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var3 = this.field_v;
            if (0.0f < this.field_i) {
              L4: {
                var4 = (int)(0.5f + (float)var3 * this.field_i);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / this.field_i);
                  break L4;
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    break L4;
                  } else {
                    if (!param0) {
                      return;
                    } else {
                      L5: {
                        if (kh.field_d != var2) {
                          this.field_u.a(-2964, var2, var3);
                          break L5;
                        } else {
                          if (var3 != ok.field_c) {
                            this.field_u.a(-2964, var2, var3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (this.field_d <= 0) {
                          break L6;
                        } else {
                          qa.field_b = (-kh.field_d + this.field_d) / 2;
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0) {
                L7: {
                  if (kh.field_d != var2) {
                    this.field_u.a(-2964, var2, var3);
                    break L7;
                  } else {
                    if (var3 != ok.field_c) {
                      this.field_u.a(-2964, var2, var3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if (this.field_d <= 0) {
                  return;
                } else {
                  qa.field_b = (-kh.field_d + this.field_d) / 2;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!param0) {
                return;
              } else {
                L8: {
                  if (kh.field_d != var2) {
                    this.field_u.a(-2964, var2, var3);
                    break L8;
                  } else {
                    if (var3 != ok.field_c) {
                      this.field_u.a(-2964, var2, var3);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (this.field_d <= 0) {
                    break L9;
                  } else {
                    qa.field_b = (-kh.field_d + this.field_d) / 2;
                    break L9;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 <= -91) {
          if (li.field_c >= this.field_k) {
            if (og.field_n <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_m = (String) null;
          if (li.field_c >= this.field_k) {
            if (og.field_n <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private v() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 12) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              if (jg.a((byte) -62, param0) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("v.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_m = "Confirm Password: ";
        field_e = null;
        field_n = "To skip this tutorial, press <img=3> at any point.";
        field_q = new java.awt.Color(10040319);
        field_l = new gk();
    }
}
