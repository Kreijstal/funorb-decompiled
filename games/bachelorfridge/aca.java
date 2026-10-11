/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aca extends kj {
    static int[] field_g;
    private int field_f;
    static int field_i;
    private boolean field_j;
    static int field_k;
    private eaa field_h;

    final boolean b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_43_0 = 0;
        boolean stackIn_47_0 = false;
        Object var2;
        int var2_int;
        bma var2_ref;
        int var3;
        int var4;
        int var3Lifetime1;
        int var3Lifetime2;
        bma var2_refLifetime1;
        bma var2_refLifetime2;
        var2 = null;
        var4 = BachelorFridge.field_y;
        this.field_f = this.field_f - 1;
        if (this.field_f < 0) {
          var2_ref = (bma) (this.field_h.b((byte) 90));
          if (param0 <= 21) {
            return false;
          }
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (var2_ref == null))) {
            fieldTemp$2 = var2_ref.field_r + 1;
            var2_ref.field_r = var2_ref.field_r + 1;
            var3 = 8191 & 8192 * fieldTemp$2 / var2_ref.field_s;
            var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
            var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
            var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
            var2_ref.b(true);
            stackIn_10_0 = var2_ref.field_h;
            if (var4 == 0) {
              if (stackIn_10_0 < 0) {
                var2_ref.a(false);
              }
              var2_ref = (bma) (this.field_h.c(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_10_0 = this.field_f;
          }
          stackIn_14_0 = (stackIn_10_0 < 0) && (this.field_h.e(12917));
          return stackIn_14_0;
        }
        stackIn_19_0 = (!this.field_j) ? 3 : 7;
        var2_int = stackIn_19_0;
        if ((this.field_f & var2_int) != 0) {
          var2_refLifetime1 = (bma) (this.field_h.b((byte) 90));
          if (param0 <= 21) {
            return false;
          }
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var2_refLifetime1 == null))) {
            fieldTemp$1 = var2_refLifetime1.field_r + 1;
            var2_refLifetime1.field_r = var2_refLifetime1.field_r + 1;
            var3Lifetime1 = 8191 & 8192 * fieldTemp$1 / var2_refLifetime1.field_s;
            var2_refLifetime1.field_p = via.a(var3Lifetime1, (byte) 125) >> 12;
            var2_refLifetime1.field_k = -((via.a(var3Lifetime1, (byte) 109) >> 12) + 20);
            var2_refLifetime1.field_g = ft.a(var3Lifetime1, (byte) -128) >> 12;
            var2_refLifetime1.b(true);
            stackIn_29_0 = var2_refLifetime1.field_h;
            if (var4 == 0) {
              if (stackIn_29_0 < 0) {
                var2_refLifetime1.a(false);
              }
              var2_refLifetime1 = (bma) (this.field_h.c(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_29_0 = this.field_f;
          }
          stackIn_33_0 = (stackIn_29_0 < 0) && (this.field_h.e(12917));
          return stackIn_33_0;
        }
        this.c((byte) -100);
        var2_refLifetime2 = (bma) (this.field_h.b((byte) 90));
        if (param0 <= 21) {
          return false;
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var2_refLifetime2 == null))) {
          fieldTemp$0 = var2_refLifetime2.field_r + 1;
          var2_refLifetime2.field_r = var2_refLifetime2.field_r + 1;
          var3Lifetime2 = 8191 & 8192 * fieldTemp$0 / var2_refLifetime2.field_s;
          var2_refLifetime2.field_p = via.a(var3Lifetime2, (byte) 125) >> 12;
          var2_refLifetime2.field_k = -((via.a(var3Lifetime2, (byte) 109) >> 12) + 20);
          var2_refLifetime2.field_g = ft.a(var3Lifetime2, (byte) -128) >> 12;
          var2_refLifetime2.b(true);
          stackIn_43_0 = var2_refLifetime2.field_h;
          if (var4 == 0) {
            if (stackIn_43_0 < 0) {
              var2_refLifetime2.a(false);
            }
            var2_refLifetime2 = (bma) (this.field_h.c(0));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_43_0 = this.field_f;
        }
        stackIn_47_0 = (stackIn_43_0 < 0) && (this.field_h.e(12917));
        return stackIn_47_0;
    }

    private final void c(byte param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        int var4 = var3 + var2;
        int var5 = var2 - var3;
        int var6 = !this.field_j ? 200 : 60;
        bma var7 = new bma(var4, var6 << 4, var5, kla.a(mla.field_b.length, sma.field_I, -2147483648), 50 + kla.a(50, sma.field_I, -2147483648));
        if (param0 == -100) {
          this.field_h.a(var7, true);
          return;
        }
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 > 0) {
          if (param0 < 128) {
            var2 = (byte)param0;
          } else {
            L57: {
              if (param0 < 160 ||
                param0 > 255) {
                if (param0 != 8364) {
                  if (8218 == param0) {
                    var2 = -126;
                    if (var3 == 0) {
                      break L57;
                    }
                  }
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 != 8224) {
                          if (param0 != 8225) {
                            if (param0 == 710) {
                              var2 = -120;
                              if (var3 == 0) {
                                break L57;
                              }
                            }
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  if (var3 == 0) {
                                    break L57;
                                  }
                                }
                                if (338 != param0) {
                                  if (param0 != 381) {
                                    if (param0 != 8216) {
                                      if (8217 == param0) {
                                        var2 = -110;
                                        if (var3 == 0) {
                                          break L57;
                                        }
                                      }
                                      if (8220 != param0) {
                                        if (param0 == 8221) {
                                          var2 = -108;
                                          if (var3 == 0) {
                                            break L57;
                                          }
                                        }
                                        if (param0 == 8226) {
                                          var2 = -107;
                                          if (var3 == 0) {
                                            break L57;
                                          }
                                        }
                                        if (param0 != 8211) {
                                          if (8212 == param0) {
                                            var2 = -105;
                                            if (var3 == 0) {
                                              break L57;
                                            }
                                          }
                                          if (param0 != 732) {
                                            if (param0 != 8482) {
                                              if (param0 == 353) {
                                                var2 = -102;
                                                if (var3 == 0) {
                                                  break L57;
                                                }
                                              }
                                              if (param0 == 8250) {
                                                var2 = -101;
                                                if (var3 == 0) {
                                                  break L57;
                                                }
                                              }
                                              if (339 == param0) {
                                                var2 = -100;
                                                if (var3 == 0) {
                                                  break L57;
                                                }
                                              }
                                              if (param0 == 382) {
                                                var2 = -98;
                                                if (var3 == 0) {
                                                  break L57;
                                                }
                                              }
                                              if (376 == param0) {
                                                var2 = -97;
                                                if (var3 == 0) {
                                                  break L57;
                                                }
                                              }
                                              var2 = 63;
                                              if (var3 == 0) {
                                                break L57;
                                              }
                                            }
                                            var2 = -103;
                                            if (var3 == 0) {
                                              break L57;
                                            }
                                          }
                                          var2 = -104;
                                          if (var3 == 0) {
                                            break L57;
                                          }
                                        }
                                        var2 = -106;
                                        if (var3 == 0) {
                                          break L57;
                                        }
                                      }
                                      var2 = -109;
                                      if (var3 == 0) {
                                        break L57;
                                      }
                                    }
                                    var2 = -111;
                                    if (var3 == 0) {
                                      break L57;
                                    }
                                  }
                                  var2 = -114;
                                  if (var3 == 0) {
                                    break L57;
                                  }
                                }
                                var2 = -116;
                                if (var3 == 0) {
                                  break L57;
                                }
                              }
                              var2 = -118;
                              if (var3 == 0) {
                                break L57;
                              }
                            }
                            var2 = -119;
                            if (var3 == 0) {
                              break L57;
                            }
                          }
                          var2 = -121;
                          if (var3 == 0) {
                            break L57;
                          }
                        }
                        var2 = -122;
                        if (var3 == 0) {
                          break L57;
                        }
                      }
                      var2 = -123;
                      if (var3 == 0) {
                        break L57;
                      }
                    }
                    var2 = -124;
                    if (var3 != 0) {
                      var2 = -125;
                      var2 = -128;
                      var2 = (byte)param0;
                    }
                  } else {
                    var2 = -125;
                    if (var3 != 0) {
                      var2 = -128;
                      var2 = (byte)param0;
                    }
                  }
                } else {
                  var2 = -128;
                  if (var3 != 0) {
                    var2 = (byte)param0;
                  }
                }
              } else {
                var2 = (byte)param0;
              }
            }
          }
        } else {
          L0: {
            if (param0 < 160) {
              if (param0 != 8364) {
                if (8218 == param0) {
                  var2 = -126;
                  if (var3 == 0) {
                    break L0;
                  }
                }
                if (param0 != 402) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (param0 != 8225) {
                          if (param0 == 710) {
                            var2 = -120;
                            if (var3 == 0) {
                              break L0;
                            }
                          }
                          if (param0 != 8240) {
                            if (param0 != 352) {
                              if (param0 == 8249) {
                                var2 = -117;
                                if (var3 == 0) {
                                  break L0;
                                }
                              }
                              if (338 != param0) {
                                if (param0 != 381) {
                                  if (param0 != 8216) {
                                    if (8217 == param0) {
                                      var2 = -110;
                                      if (var3 == 0) {
                                        break L0;
                                      }
                                    }
                                    if (8220 != param0) {
                                      if (param0 == 8221) {
                                        var2 = -108;
                                        if (var3 == 0) {
                                          break L0;
                                        }
                                      }
                                      if (param0 == 8226) {
                                        var2 = -107;
                                        if (var3 == 0) {
                                          break L0;
                                        }
                                      }
                                      if (param0 != 8211) {
                                        if (8212 == param0) {
                                          var2 = -105;
                                          if (var3 == 0) {
                                            break L0;
                                          }
                                        }
                                        if (param0 != 732) {
                                          if (param0 != 8482) {
                                            if (param0 == 353) {
                                              var2 = -102;
                                              if (var3 == 0) {
                                                break L0;
                                              }
                                            }
                                            if (param0 == 8250) {
                                              var2 = -101;
                                              if (var3 == 0) {
                                                break L0;
                                              }
                                            }
                                            if (339 == param0) {
                                              var2 = -100;
                                              if (var3 == 0) {
                                                break L0;
                                              }
                                            }
                                            if (param0 == 382) {
                                              var2 = -98;
                                              if (var3 == 0) {
                                                break L0;
                                              }
                                            }
                                            if (376 == param0) {
                                              var2 = -97;
                                              if (var3 == 0) {
                                                break L0;
                                              }
                                            }
                                            var2 = 63;
                                            if (var3 == 0) {
                                              break L0;
                                            }
                                          }
                                          var2 = -103;
                                          if (var3 == 0) {
                                            break L0;
                                          }
                                        }
                                        var2 = -104;
                                        if (var3 == 0) {
                                          break L0;
                                        }
                                      }
                                      var2 = -106;
                                      if (var3 == 0) {
                                        break L0;
                                      }
                                    }
                                    var2 = -109;
                                    if (var3 == 0) {
                                      break L0;
                                    }
                                  }
                                  var2 = -111;
                                  if (var3 == 0) {
                                    break L0;
                                  }
                                }
                                var2 = -114;
                                if (var3 == 0) {
                                  break L0;
                                }
                              }
                              var2 = -116;
                              if (var3 == 0) {
                                break L0;
                              }
                            }
                            var2 = -118;
                            if (var3 == 0) {
                              break L0;
                            }
                          }
                          var2 = -119;
                          if (var3 == 0) {
                            break L0;
                          }
                        }
                        var2 = -121;
                        if (var3 == 0) {
                          break L0;
                        }
                      }
                      var2 = -122;
                      if (var3 == 0) {
                        break L0;
                      }
                    }
                    var2 = -123;
                    if (var3 == 0) {
                      break L0;
                    }
                  }
                  var2 = -124;
                  if (var3 == 0) {
                    break L0;
                  }
                }
                var2 = -125;
                if (var3 == 0) {
                  break L0;
                }
              }
              var2 = -128;
              if (var3 == 0) {
                break L0;
              }
            } else {
              if (param0 > 255) {
                L29: {
                  if (param0 != 8364) {
                    if (8218 == param0) {
                      var2 = -126;
                      if (var3 == 0) {
                        break L29;
                      }
                    }
                    if (param0 != 402) {
                      if (param0 != 8222) {
                        if (param0 != 8230) {
                          if (param0 != 8224) {
                            if (param0 != 8225) {
                              if (param0 == 710) {
                                var2 = -120;
                                if (var3 == 0) {
                                  break L29;
                                }
                              }
                              if (param0 != 8240) {
                                if (param0 != 352) {
                                  if (param0 == 8249) {
                                    var2 = -117;
                                    if (var3 == 0) {
                                      break L29;
                                    }
                                  }
                                  if (338 != param0) {
                                    if (param0 != 381) {
                                      if (param0 != 8216) {
                                        if (8217 == param0) {
                                          var2 = -110;
                                          if (var3 == 0) {
                                            break L29;
                                          }
                                        }
                                        if (8220 != param0) {
                                          if (param0 == 8221) {
                                            var2 = -108;
                                            if (var3 == 0) {
                                              break L29;
                                            }
                                          }
                                          if (param0 == 8226) {
                                            var2 = -107;
                                            if (var3 == 0) {
                                              break L29;
                                            }
                                          }
                                          if (param0 != 8211) {
                                            if (8212 == param0) {
                                              var2 = -105;
                                              if (var3 == 0) {
                                                break L29;
                                              }
                                            }
                                            if (param0 != 732) {
                                              if (param0 != 8482) {
                                                if (param0 == 353) {
                                                  var2 = -102;
                                                  if (var3 == 0) {
                                                    break L29;
                                                  }
                                                }
                                                if (param0 == 8250) {
                                                  var2 = -101;
                                                  if (var3 == 0) {
                                                    break L29;
                                                  }
                                                }
                                                if (339 == param0) {
                                                  var2 = -100;
                                                  if (var3 == 0) {
                                                    break L29;
                                                  }
                                                }
                                                if (param0 == 382) {
                                                  var2 = -98;
                                                  if (var3 == 0) {
                                                    break L29;
                                                  }
                                                }
                                                if (376 == param0) {
                                                  var2 = -97;
                                                  if (var3 == 0) {
                                                    break L29;
                                                  }
                                                }
                                                var2 = 63;
                                                if (var3 == 0) {
                                                  break L29;
                                                }
                                              }
                                              var2 = -103;
                                              if (var3 == 0) {
                                                break L29;
                                              }
                                            }
                                            var2 = -104;
                                            if (var3 == 0) {
                                              break L29;
                                            }
                                          }
                                          var2 = -106;
                                          if (var3 == 0) {
                                            break L29;
                                          }
                                        }
                                        var2 = -109;
                                        if (var3 == 0) {
                                          break L29;
                                        }
                                      }
                                      var2 = -111;
                                      if (var3 == 0) {
                                        break L29;
                                      }
                                    }
                                    var2 = -114;
                                    if (var3 == 0) {
                                      break L29;
                                    }
                                  }
                                  var2 = -116;
                                  if (var3 == 0) {
                                    break L29;
                                  }
                                }
                                var2 = -118;
                                if (var3 == 0) {
                                  break L29;
                                }
                              }
                              var2 = -119;
                              if (var3 == 0) {
                                break L29;
                              }
                            }
                            var2 = -121;
                            if (var3 == 0) {
                              break L29;
                            }
                          }
                          var2 = -122;
                          if (var3 == 0) {
                            break L29;
                          }
                        }
                        var2 = -123;
                        if (var3 == 0) {
                          break L29;
                        }
                      }
                      var2 = -124;
                      if (var3 != 0) {
                        var2 = -125;
                        var2 = -128;
                        var2 = (byte)param0;
                      }
                    } else {
                      var2 = -125;
                      if (var3 != 0) {
                        var2 = -128;
                        var2 = (byte)param0;
                      }
                    }
                  } else {
                    var2 = -128;
                    if (var3 != 0) {
                      var2 = (byte)param0;
                    }
                  }
                }
                if (param1 == 8220) {
                  return (byte) var2;
                }
                aca.a('ﾵ', 108);
                return (byte) var2;
              }
            }
            var2 = (byte)param0;
          }
        }
        if (param1 == 8220) {
          return (byte) var2;
        }
        aca.a('ﾵ', 108);
        return (byte) var2;
    }

    aca(gj param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_h = new eaa();
          stackIn_4_1 = (param3);
          this.field_j = stackIn_4_1;
          if (this.field_j) {
            this.field_f = 30;
            if (BachelorFridge.field_y == 0) {
              return;
            }
          }
          this.field_f = 100;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("aca.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        bma var4 = (bma) (this.field_h.b((byte) 90));
        if (!param1) {
          return;
        }
        do {
          if (var4 == null) {
            return;
          }
          var5 = (var4.field_i >> 4) + param2;
          var6 = (var4.field_q >> 4) + param0 - (var4.field_h >> 4);
          mla.field_b[var4.field_v].e(var5, var6);
          var4 = (bma) (this.field_h.c(0));
          if (var7 != 0) {
            return;
          }
        } while (var7 == 0);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 0) {
          return;
        }
        this.field_f = 8;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 <= -110) {
          return;
        }
        field_k = -103;
    }

    final static void a(byte param0, int param1) {
        fda.b(param0 ^ -117);
        if (param0 == -118) {
          return;
        }
        aca.a('q', -54);
    }

    final static hs a(byte param0, int param1, int param2) {
        byte[] var4_array = null;
        if (bca.field_n[param1][param2] == null) {
        }
        if (11 == param2) {
          param1 = 0;
        }
        if (param0 != -100) {
          field_i = -82;
        }
        if (param2 == 10) {
          param1 = 11;
        }
        hs var3 = bca.field_n[param1][param2].a(0);
        if (var3 == null) {
          Object var4 = null;
          try {
            var4_array = bk.field_v.a((byte) 123, hk.field_h[param2], fl.field_o[param1]);
          } catch (IllegalArgumentException illegalArgumentException) {
          }
          var3 = oo.a(param2, (byte) -77, var4_array, param1);
          bca.field_n[param1][param2] = new al(var3);
        }
        return var3;
    }

    static {
        field_i = 0;
        field_g = new int[12];
        field_k = -1;
    }
}
