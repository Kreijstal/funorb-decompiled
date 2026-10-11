/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static fm field_d;
    private int field_k;
    private int field_a;
    private int field_g;
    private boolean field_c;
    private int field_i;
    int field_j;
    int field_h;
    static wm field_f;
    static String field_l;
    static boolean field_e;
    static String field_b;
    static String field_m;

    final void a(boolean param0, int param1) {
        if (param0) {
          this.a(false, -5, -120, 105);
          if (this.field_i == 0) {
            this.field_c = false;
            this.field_j = param1;
            return;
          }
          return;
        }
        if (this.field_i != 0) {
          return;
        }
        this.field_c = false;
        this.field_j = param1;
    }

    final static int a(boolean param0) {
        if (!param0) {
          return -75;
        }
        return (int)(1000000000L / wa.field_b);
    }

    final boolean d(int param0) {
        int var2 = -101 % ((param0 + 51) / 33);
        return this.field_g == 103 ? true : false;
    }

    final void a(byte param0) {
        this.field_g = 0;
        this.field_k = 0;
        boolean decompiledFrameRemainder0 = true;
        if (0 == this.field_i) {
          if (ke.field_a != 98) {
            if (this.field_i == 0) {
              this.field_g = ke.field_a;
            }
            if (this.field_i != 0) {
              if (param0 != -48) {
                this.c(64);
              }
              return;
            }
            if (ke.field_a == 99) {
              this.field_j = this.field_j + 1;
              this.field_c = false;
              if (this.field_h <= this.field_j) {
                this.field_j = 0;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (0 >= this.field_j) {
              this.field_j = this.field_h;
            }
            this.field_j = this.field_j - 1;
            this.field_c = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_i == 0) {
            this.field_g = ke.field_a;
          }
          if (this.field_i == 0 &&
            ke.field_a == 99) {
            this.field_j = this.field_j + 1;
            this.field_c = false;
            if (this.field_h <= this.field_j) {
              this.field_j = 0;
            }
          }
        }
        if (param0 == -48) {
          return;
        }
        this.c(64);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 < 19) {
          return;
        }
        field_m = null;
        field_f = null;
        field_l = null;
        field_d = null;
    }

    final void a(int param0, int param1) {
        if (param0 >= 46) {
          this.field_k = 0;
          this.field_g = 0;
          if (0 == this.field_i &&
            ke.field_a == 96) {
            if (this.field_j > 0) {
              this.field_c = false;
              this.field_j = this.field_j - 1;
              if (this.field_i == 0) {
                this.field_g = ke.field_a;
              }
              if (this.field_i == 0 &&
                ke.field_a == 97) {
                this.field_j = this.field_j + 1;
                if (this.field_j >= this.field_h) {
                  this.field_j = 0;
                }
                this.field_c = false;
              }
              if (this.field_i == 0) {
                if (ke.field_a != 98 &&
                  ke.field_a != 99) {
                  return;
                }
                this.field_c = false;
                if (this.field_j < 0) {
                  this.field_j = param1;
                }
              }
              return;
            }
            this.field_j = this.field_h;
            this.field_c = false;
            this.field_j = this.field_j - 1;
            if (this.field_i == 0) {
              this.field_g = ke.field_a;
            }
            if (this.field_i == 0 &&
              ke.field_a == 97) {
              this.field_j = this.field_j + 1;
              if (this.field_j >= this.field_h) {
                this.field_j = 0;
              }
              this.field_c = false;
            }
            if (this.field_i == 0) {
              if (ke.field_a != 98 &&
                ke.field_a != 99) {
                return;
              }
              this.field_c = false;
              if (this.field_j < 0) {
                this.field_j = param1;
              }
            }
            return;
          }
          if (this.field_i == 0) {
            this.field_g = ke.field_a;
          }
          if (this.field_i == 0) {
            if (ke.field_a != 97) {
              if (this.field_i == 0) {
                if (ke.field_a != 98 &&
                  ke.field_a != 99) {
                  return;
                }
                this.field_c = false;
                if (this.field_j < 0) {
                  this.field_j = param1;
                }
              }
              return;
            }
            this.field_j = this.field_j + 1;
            if (this.field_j >= this.field_h) {
              this.field_j = 0;
              this.field_c = false;
              if (this.field_i == 0) {
                if (ke.field_a != 98 &&
                  ke.field_a != 99) {
                  return;
                }
                this.field_c = false;
                if (this.field_j < 0) {
                  this.field_j = param1;
                }
              }
              return;
            }
            this.field_c = false;
          }
        } else {
          this.a(6);
          this.field_k = 0;
          this.field_g = 0;
          if (0 != this.field_i) {
            if (this.field_i == 0) {
              this.field_g = ke.field_a;
            }
            if (this.field_i == 0) {
              if (ke.field_a != 97) {
                if (this.field_i == 0) {
                  if (ke.field_a != 98 &&
                    ke.field_a != 99) {
                    return;
                  }
                  this.field_c = false;
                  if (this.field_j < 0) {
                    this.field_j = param1;
                  }
                }
                return;
              }
              this.field_j = this.field_j + 1;
              if (this.field_j >= this.field_h) {
                this.field_j = 0;
                this.field_c = false;
                if (this.field_i == 0) {
                  if (ke.field_a != 98 &&
                    ke.field_a != 99) {
                    return;
                  }
                  this.field_c = false;
                  if (this.field_j < 0) {
                    this.field_j = param1;
                  }
                }
                return;
              }
              this.field_c = false;
            }
          } else {
            if (ke.field_a == 96) {
              if (this.field_j > 0) {
                this.field_c = false;
                this.field_j = this.field_j - 1;
                if (this.field_i == 0) {
                  this.field_g = ke.field_a;
                }
                if (this.field_i == 0 &&
                  ke.field_a == 97) {
                  this.field_j = this.field_j + 1;
                  if (this.field_j >= this.field_h) {
                    this.field_j = 0;
                  }
                  this.field_c = false;
                }
                if (this.field_i == 0) {
                  if (ke.field_a != 98 &&
                    ke.field_a != 99) {
                    return;
                  }
                  this.field_c = false;
                  if (this.field_j < 0) {
                    this.field_j = param1;
                  }
                }
                return;
              }
              this.field_j = this.field_h;
              this.field_c = false;
              this.field_j = this.field_j - 1;
            }
            if (this.field_i == 0) {
              this.field_g = ke.field_a;
            }
            if (this.field_i == 0 &&
              ke.field_a == 97) {
              this.field_j = this.field_j + 1;
              if (this.field_j >= this.field_h) {
                this.field_j = 0;
              }
              this.field_c = false;
            }
          }
        }
        if (this.field_i != 0) {
          return;
        }
        if (ke.field_a != 98 &&
          ke.field_a != 99) {
          return;
        }
        this.field_c = false;
        if (this.field_j >= 0) {
          return;
        }
        this.field_j = param1;
    }

    final boolean c(byte param0) {
        if (param0 == 35) {
          return 0 != this.field_i ? true : false;
        }
        pf.b(116, 24);
        return 0 != this.field_i ? true : false;
    }

    final void b(byte param0) {
        if (param0 == -71) {
          this.field_g = 0;
          this.field_k = 0;
          if (this.field_i == 0) {
            this.field_g = ke.field_a;
          }
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != -97) {
          return true;
        }
        return this.field_g == 96 ? true : false;
    }

    final static jk[] a(pc param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        jk[] var4 = null;
        int var5 = 0;
        jk var6_ref_jk = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jk[] stackIn_6_0 = null;
        jk[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.c(8, (byte) -34);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (jk[]) (stackIn_3_0);
          }
          var3 = param0.c(12, (byte) -34);
          var4 = new jk[var3];
          var5 = 0;
          if (param1 != 77) {
            stackIn_6_0 = (jk[]) null;
            return stackIn_6_0;
          }
          while (var3 > var5) {
            if (!tj.a(param0, -32)) {
              var6 = param0.c(wg.a(var5 - 1, 15598), (byte) -34);
              var4[var5] = var4[var6];
            } else {
              var6_ref_jk = new jk();
              param0.c(24, (byte) -34);
              param0.c(24, (byte) -34);
              var6_ref_jk.field_b = param0.c(24, (byte) -34);
              param0.c(9, (byte) -34);
              param0.c(12, (byte) -34);
              param0.c(12, (byte) -34);
              param0.c(12, (byte) -34);
              var4[var5] = var6_ref_jk;
            }
            var5++;
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_h <= param1) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_h) {
          throw new IllegalArgumentException();
        }
        this.field_g = 0;
        this.field_k = 0;
        if (nm.field_c == 0) {
          if (this.field_i != 0 &&
            ef.field_b != 0) {
            if (this.field_a <= 0) {
              this.field_a = gb.field_a;
            }
            this.field_a = this.field_a - 1;
          }
          if (~nm.field_c == param2 &&
            0 == ef.field_b) {
            this.field_i = 0;
          }
          if (this.field_i != 0) {
            return;
          }
          if (!this.field_c &&
            !im.field_Jb) {
            return;
          }
          if (0 > param1) {
            if (!this.field_c) {
              return;
            }
            this.field_j = -1;
            return;
          }
          if (param1 != this.field_j) {
          }
          this.field_c = true;
          this.field_j = param1;
          return;
        }
        this.field_j = param0;
        this.field_c = true;
        this.field_i = nm.field_c;
        this.field_k = nm.field_c;
        this.field_a = tj.field_v;
        if (this.field_i == 0) {
          if (~nm.field_c == param2 &&
            0 == ef.field_b) {
            this.field_i = 0;
          }
          if (this.field_i == 0) {
            if (!this.field_c &&
              !im.field_Jb) {
              return;
            }
            if (0 > param1) {
              if (this.field_c) {
                this.field_j = -1;
              }
            } else {
              if (param1 != this.field_j) {
                this.field_c = true;
                this.field_j = param1;
              } else {
                this.field_c = true;
                this.field_j = param1;
              }
            }
          }
          return;
        }
        if (ef.field_b == 0) {
          if (~nm.field_c == param2 &&
            0 == ef.field_b) {
            this.field_i = 0;
          }
          if (this.field_i == 0) {
            if (!this.field_c &&
              !im.field_Jb) {
              return;
            }
            if (0 > param1) {
              if (this.field_c) {
                this.field_j = -1;
              }
            } else {
              if (param1 != this.field_j) {
                this.field_c = true;
                this.field_j = param1;
              } else {
                this.field_c = true;
                this.field_j = param1;
              }
            }
          }
          return;
        }
        if (this.field_a <= 0) {
          this.field_a = gb.field_a;
        }
        this.field_a = this.field_a - 1;
        if (~nm.field_c == param2 &&
          0 == ef.field_b) {
          this.field_i = 0;
        }
        if (this.field_i != 0) {
          return;
        }
        if (this.field_c) {
          if (0 > param1) {
            if (!this.field_c) {
              return;
            }
            this.field_j = -1;
            return;
          }
          if (param1 != this.field_j) {
          }
        } else {
          if (!im.field_Jb) {
            return;
          }
          if (0 > param1) {
            if (!this.field_c) {
              return;
            }
            this.field_j = -1;
            return;
          }
          if (param1 == this.field_j) {
          }
        }
        this.field_c = true;
        this.field_j = param1;
    }

    final static void b(int param0, int param1) {
        td.field_d = gn.field_w[param0];
        hm.field_a = un.field_k[param0];
        wa.field_a = uf.field_c[param0];
        if (param1 != -31383) {
          pf.b(63, 96);
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 == -118) {
          if (param1 > 0 &&
            param1 < 128) {
            var2 = (byte)param1;
            return (byte) var2;
          }
          if (160 <= param1 &&
            255 >= param1) {
            var2Lifetime3 = (byte)param1;
            return (byte) var2Lifetime3;
          }
          if (param1 != 8364) {
            if (param1 == 8218) {
              var2Lifetime4 = -126;
            } else {
              if (param1 == 402) {
                var2Lifetime4 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime4 = -123;
                  } else {
                    if (param1 == 8224) {
                      var2Lifetime4 = -122;
                    } else {
                      if (param1 == 8225) {
                        var2Lifetime4 = -121;
                      } else {
                        if (710 == param1) {
                          var2Lifetime4 = -120;
                        } else {
                          if (8240 == param1) {
                            var2Lifetime4 = -119;
                          } else {
                            if (param1 != 352) {
                              if (param1 != 8249) {
                                if (param1 != 338) {
                                  if (param1 == 381) {
                                    var2Lifetime4 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (8217 == param1) {
                                        var2Lifetime4 = -110;
                                      } else {
                                        if (param1 != 8220) {
                                          if (param1 != 8221) {
                                            if (param1 != 8226) {
                                              if (param1 != 8211) {
                                                if (param1 != 8212) {
                                                  if (param1 == 732) {
                                                    var2Lifetime4 = -104;
                                                  } else {
                                                    if (param1 != 8482) {
                                                      if (353 != param1) {
                                                        if (param1 != 8250) {
                                                          if (param1 == 339) {
                                                            var2Lifetime4 = -100;
                                                          } else {
                                                            if (382 == param1) {
                                                              var2Lifetime4 = -98;
                                                            } else {
                                                              var2Lifetime4 = (param1 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime4 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime4 = -102;
                                                      }
                                                    } else {
                                                      var2Lifetime4 = -103;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime4 = -105;
                                                }
                                              } else {
                                                var2Lifetime4 = -106;
                                              }
                                            } else {
                                              var2Lifetime4 = -107;
                                            }
                                          } else {
                                            var2Lifetime4 = -108;
                                          }
                                        } else {
                                          var2Lifetime4 = -109;
                                        }
                                      }
                                    } else {
                                      var2Lifetime4 = -111;
                                    }
                                  }
                                } else {
                                  var2Lifetime4 = -116;
                                }
                              } else {
                                var2Lifetime4 = -117;
                              }
                            } else {
                              var2Lifetime4 = -118;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2Lifetime4 = -124;
                }
              }
            }
          } else {
            var2Lifetime4 = -128;
          }
          return (byte) var2Lifetime4;
        }
        field_l = (String) null;
        if (param1 > 0) {
          if (param1 < 128) {
            var2Lifetime1 = (byte)param1;
            return (byte) var2Lifetime1;
          }
          if (160 <= param1 &&
            255 >= param1) {
            var2Lifetime1Lifetime1 = (byte)param1;
          } else {
            if (param1 != 8364) {
              if (param1 == 8218) {
                var2Lifetime1Lifetime1 = -126;
                return (byte) var2Lifetime1Lifetime1;
              }
              if (param1 == 402) {
                var2Lifetime1Lifetime1 = -125;
                return (byte) var2Lifetime1Lifetime1;
              }
              if (param1 != 8222) {
                if (param1 == 8230) {
                  var2Lifetime1Lifetime1 = -123;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (param1 == 8224) {
                  var2Lifetime1Lifetime1 = -122;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (param1 == 8225) {
                  var2Lifetime1Lifetime1 = -121;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (710 == param1) {
                  var2Lifetime1Lifetime1 = -120;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (8240 == param1) {
                  var2Lifetime1Lifetime1 = -119;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (param1 != 352) {
                  if (param1 != 8249) {
                    if (param1 != 338) {
                      if (param1 == 381) {
                        var2Lifetime1Lifetime1 = -114;
                        return (byte) var2Lifetime1Lifetime1;
                      }
                      if (param1 != 8216) {
                        if (8217 == param1) {
                          var2Lifetime1Lifetime1 = -110;
                          return (byte) var2Lifetime1Lifetime1;
                        }
                        if (param1 != 8220) {
                          if (param1 != 8221) {
                            if (param1 != 8226) {
                              if (param1 != 8211) {
                                if (param1 == 8212) {
                                  var2Lifetime1Lifetime1 = -105;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 732) {
                                  var2Lifetime1Lifetime1 = -104;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 8482) {
                                  var2Lifetime1Lifetime1 = -103;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (353 == param1) {
                                  var2Lifetime1Lifetime1 = -102;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 8250) {
                                  var2Lifetime1Lifetime1 = -101;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 339) {
                                  var2Lifetime1Lifetime1 = -100;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (382 == param1) {
                                  var2Lifetime1Lifetime1 = -98;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 376) {
                                  var2Lifetime1Lifetime1 = -97;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                var2Lifetime1Lifetime1 = 63;
                                return (byte) var2Lifetime1Lifetime1;
                              }
                              var2Lifetime1Lifetime1 = -106;
                            } else {
                              var2Lifetime1Lifetime1 = -107;
                            }
                          } else {
                            var2Lifetime1Lifetime1 = -108;
                          }
                        } else {
                          var2Lifetime1Lifetime1 = -109;
                        }
                      } else {
                        var2Lifetime1Lifetime1 = -111;
                      }
                    } else {
                      var2Lifetime1Lifetime1 = -116;
                    }
                  } else {
                    var2Lifetime1Lifetime1 = -117;
                  }
                } else {
                  var2Lifetime1Lifetime1 = -118;
                }
              } else {
                var2Lifetime1Lifetime1 = -124;
              }
            } else {
              var2Lifetime1Lifetime1 = -128;
            }
          }
          return (byte) var2Lifetime1Lifetime1;
        }
        if (160 > param1) {
          if (param1 != 8364) {
            if (param1 == 8218) {
              var2Lifetime2 = -126;
            } else {
              if (param1 == 402) {
                var2Lifetime2 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime2 = -123;
                  } else {
                    if (param1 == 8224) {
                      var2Lifetime2 = -122;
                    } else {
                      if (param1 == 8225) {
                        var2Lifetime2 = -121;
                      } else {
                        if (710 == param1) {
                          var2Lifetime2 = -120;
                        } else {
                          if (8240 == param1) {
                            var2Lifetime2 = -119;
                          } else {
                            if (param1 != 352) {
                              if (param1 != 8249) {
                                if (param1 != 338) {
                                  if (param1 == 381) {
                                    var2Lifetime2 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (8217 == param1) {
                                        var2Lifetime2 = -110;
                                      } else {
                                        if (param1 != 8220) {
                                          if (param1 != 8221) {
                                            if (param1 != 8226) {
                                              if (param1 != 8211) {
                                                if (param1 != 8212) {
                                                  if (param1 == 732) {
                                                    var2Lifetime2 = -104;
                                                  } else {
                                                    if (param1 != 8482) {
                                                      if (353 != param1) {
                                                        if (param1 != 8250) {
                                                          if (param1 == 339) {
                                                            var2Lifetime2 = -100;
                                                          } else {
                                                            if (382 == param1) {
                                                              var2Lifetime2 = -98;
                                                            } else {
                                                              var2Lifetime2 = (param1 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -102;
                                                      }
                                                    } else {
                                                      var2Lifetime2 = -103;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime2 = -105;
                                                }
                                              } else {
                                                var2Lifetime2 = -106;
                                              }
                                            } else {
                                              var2Lifetime2 = -107;
                                            }
                                          } else {
                                            var2Lifetime2 = -108;
                                          }
                                        } else {
                                          var2Lifetime2 = -109;
                                        }
                                      }
                                    } else {
                                      var2Lifetime2 = -111;
                                    }
                                  }
                                } else {
                                  var2Lifetime2 = -116;
                                }
                              } else {
                                var2Lifetime2 = -117;
                              }
                            } else {
                              var2Lifetime2 = -118;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2Lifetime2 = -124;
                }
              }
            }
          } else {
            var2Lifetime2 = -128;
          }
        } else {
          if (255 >= param1) {
            var2Lifetime2 = (byte)param1;
          } else {
            if (param1 != 8364) {
              if (param1 == 8218) {
                var2Lifetime2 = -126;
              } else {
                if (param1 == 402) {
                  var2Lifetime2 = -125;
                } else {
                  if (param1 != 8222) {
                    if (param1 == 8230) {
                      var2Lifetime2 = -123;
                    } else {
                      if (param1 == 8224) {
                        var2Lifetime2 = -122;
                      } else {
                        if (param1 == 8225) {
                          var2Lifetime2 = -121;
                        } else {
                          if (710 == param1) {
                            var2Lifetime2 = -120;
                          } else {
                            if (8240 == param1) {
                              var2Lifetime2 = -119;
                            } else {
                              if (param1 != 352) {
                                if (param1 != 8249) {
                                  if (param1 != 338) {
                                    if (param1 == 381) {
                                      var2Lifetime2 = -114;
                                    } else {
                                      if (param1 != 8216) {
                                        if (8217 == param1) {
                                          var2Lifetime2 = -110;
                                        } else {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (param1 != 8226) {
                                                if (param1 != 8211) {
                                                  if (param1 != 8212) {
                                                    if (param1 == 732) {
                                                      var2Lifetime2 = -104;
                                                    } else {
                                                      if (param1 != 8482) {
                                                        if (353 != param1) {
                                                          if (param1 != 8250) {
                                                            if (param1 == 339) {
                                                              var2Lifetime2 = -100;
                                                            } else {
                                                              if (382 == param1) {
                                                                var2Lifetime2 = -98;
                                                              } else {
                                                                var2Lifetime2 = (param1 == 376) ? -97 : 63;
                                                              }
                                                            }
                                                          } else {
                                                            var2Lifetime2 = -101;
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -102;
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -103;
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime2 = -105;
                                                  }
                                                } else {
                                                  var2Lifetime2 = -106;
                                                }
                                              } else {
                                                var2Lifetime2 = -107;
                                              }
                                            } else {
                                              var2Lifetime2 = -108;
                                            }
                                          } else {
                                            var2Lifetime2 = -109;
                                          }
                                        }
                                      } else {
                                        var2Lifetime2 = -111;
                                      }
                                    }
                                  } else {
                                    var2Lifetime2 = -116;
                                  }
                                } else {
                                  var2Lifetime2 = -117;
                                }
                              } else {
                                var2Lifetime2 = -118;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var2Lifetime2 = -124;
                  }
                }
              }
            } else {
              var2Lifetime2 = -128;
            }
          }
        }
        return (byte) var2Lifetime2;
    }

    final boolean c(int param0) {
        if (param0 == 102) {
          return 97 == this.field_g ? true : false;
        }
        this.a(-122, 90, 40);
        return 97 == this.field_g ? true : false;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          am.a(-7749, (java.awt.Component) ((Object) param0));
          te.a((byte) -47, (java.awt.Component) ((Object) param0));
          if (null != gp.field_Lb) {
            gp.field_Lb.a(param1 + 18421, (java.awt.Component) ((Object) param0));
          }
          if (param1 != 0) {
            field_d = (fm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("pf.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_i = 0;
        if (param2 != 17068) {
          return;
        }
        this.field_c = param0 ? true : false;
        if (this.field_c) {
          this.field_j = param1;
          return;
        }
        this.field_j = param3;
    }

    pf(int param0) {
        this.field_j = 0;
        this.field_c = false;
        this.field_h = param0;
    }

    final boolean d(byte param0) {
        if (param0 <= -75) {
          return 102 == this.field_g ? true : false;
        }
        this.field_k = 25;
        return 102 == this.field_g ? true : false;
    }

    final boolean a(int param0) {
        if (param0 < 4) {
          pf.a(true);
          if (this.field_k != 0) {
            return true;
          }
          if (this.field_g != 84) {
            return this.field_g == 83 ? true : false;
          }
          return true;
        }
        if (this.field_k != 0) {
          return true;
        }
        if (this.field_g == 84) {
          return true;
        }
        if (this.field_g != 83) {
          return false;
        }
        return true;
    }

    static {
        field_l = "Service unavailable";
        field_f = new wm(10, 2, 2, 0);
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_m = "Kick";
    }
}
