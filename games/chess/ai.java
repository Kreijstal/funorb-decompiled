/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    km field_k;
    private boolean field_i;
    private int field_d;
    private int field_g;
    static byte[] field_h;
    private int field_b;
    private int field_f;
    static int field_j;
    km[] field_e;
    private int field_c;
    static String[] field_a;

    final static void a(boolean param0, int param1, int param2) {
        CharSequence var31 = null;
        Object var5 = null;
        String var4 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        if (me.field_a == null) {
            if (param1 != 3) {
                ai.a((byte) 43, '�');
                return;
            }
            return;
        }
        int var3 = me.field_a.a(3, param0);
        if (var3 == 0) {
            if (param1 == 3) {
                return;
            }
            ai.a((byte) 43, '�');
            return;
        }
        if (var3 == 2 && null != me.field_a.field_db) {
            if (me.field_a.field_db.equals("")) {
                pk.field_b = -1;
                me.field_a = null;
                if (param1 != 3) {
                    ai.a((byte) 43, '�');
                    return;
                }
                return;
            }
            if (me.field_a.field_db.charAt(0) == 91) {
                var4 = me.field_a.field_db;
            } else {
                var31 = (CharSequence) ((Object) me.field_a.field_db);
                var4 = ad.a(var31, -2);
            }
            var5 = null;
            if (!(pk.field_b != 0)) {
                var5 = hf.a(param2, 79, var4);
            }
            if (pk.field_b == 1) {
                var5 = ab.a(param2, param1 + 21247, var4);
            }
            if (pk.field_b == 2) {
                var5 = a.a(param2, var4, (byte) 64);
            }
            if (!(3 != pk.field_b)) {
                var5 = of.a(var4, param2, var4, -1);
            }
            if (var5 != null) {
                String var6 = (String) null;
                lc.a(var4, (String) null, 2, 0, (String) (var5), false);
                pk.field_b = -1;
                me.field_a = null;
                if (param1 != 3) {
                    ai.a((byte) 43, '�');
                    return;
                }
                return;
            }
        }
        pk.field_b = -1;
        me.field_a = null;
        if (param1 != 3) {
            ai.a((byte) 43, '�');
            return;
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        if (param1 > 0) {
          if (128 <= param1) {
            L0: {
              L1: {
                if (param1 < 160) {
                  break L1;
                } else {
                  if (255 >= param1) {
                    var2 = (byte)param1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 == 8364) {
                var2 = -128;
                if (param0 == -43) {
                  return (byte) var2;
                } else {
                  field_h = (byte[]) null;
                  return (byte) var2;
                }
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                  if (param0 == -43) {
                    return (byte) var2;
                  } else {
                    field_h = (byte[]) null;
                    return (byte) var2;
                  }
                } else {
                  if (402 == param1) {
                    var2 = -125;
                    if (param0 == -43) {
                      return (byte) var2;
                    } else {
                      field_h = (byte[]) null;
                      return (byte) var2;
                    }
                  } else {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 == 8224) {
                          var2 = -122;
                          if (param0 == -43) {
                            return (byte) var2;
                          } else {
                            field_h = (byte[]) null;
                            return (byte) var2;
                          }
                        } else {
                          if (param1 == 8225) {
                            var2 = -121;
                            if (param0 == -43) {
                              return (byte) var2;
                            } else {
                              field_h = (byte[]) null;
                              return (byte) var2;
                            }
                          } else {
                            if (param1 == 710) {
                              var2 = -120;
                              if (param0 == -43) {
                                return (byte) var2;
                              } else {
                                field_h = (byte[]) null;
                                return (byte) var2;
                              }
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  if (param0 == -43) {
                                    return (byte) var2;
                                  } else {
                                    field_h = (byte[]) null;
                                    return (byte) var2;
                                  }
                                } else {
                                  if (8249 == param1) {
                                    var2 = -117;
                                    if (param0 == -43) {
                                      return (byte) var2;
                                    } else {
                                      field_h = (byte[]) null;
                                      return (byte) var2;
                                    }
                                  } else {
                                    if (338 != param1) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        if (param0 == -43) {
                                          return (byte) var2;
                                        } else {
                                          field_h = (byte[]) null;
                                          return (byte) var2;
                                        }
                                      } else {
                                        if (8216 == param1) {
                                          var2 = -111;
                                          if (param0 == -43) {
                                            return (byte) var2;
                                          } else {
                                            field_h = (byte[]) null;
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (param1 == 8217) {
                                            var2 = -110;
                                            if (param0 == -43) {
                                              return (byte) var2;
                                            } else {
                                              field_h = (byte[]) null;
                                              return (byte) var2;
                                            }
                                          } else {
                                            if (param1 == 8220) {
                                              var2 = -109;
                                              if (param0 == -43) {
                                                return (byte) var2;
                                              } else {
                                                field_h = (byte[]) null;
                                                return (byte) var2;
                                              }
                                            } else {
                                              if (8221 != param1) {
                                                if (param1 != 8226) {
                                                  if (8211 == param1) {
                                                    var2 = -106;
                                                    break L0;
                                                  } else {
                                                    if (8212 != param1) {
                                                      if (param1 != 732) {
                                                        if (8482 == param1) {
                                                          var2 = -103;
                                                          break L0;
                                                        } else {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L0;
                                                          } else {
                                                            if (param1 != 8250) {
                                                              if (339 == param1) {
                                                                var2 = -100;
                                                                break L0;
                                                              } else {
                                                                if (param1 == 382) {
                                                                  var2 = -98;
                                                                  break L0;
                                                                } else {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -108;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var2 = -116;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                var2 = -119;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        var2 = -123;
                        break L0;
                      }
                    } else {
                      var2 = -124;
                      break L0;
                    }
                  }
                }
              }
            }
            if (param0 == -43) {
              return (byte) var2;
            } else {
              field_h = (byte[]) null;
              return (byte) var2;
            }
          } else {
            var2 = (byte)param1;
            if (param0 == -43) {
              return (byte) var2;
            } else {
              field_h = (byte[]) null;
              return (byte) var2;
            }
          }
        } else {
          L2: {
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (255 >= param1) {
                  var2 = (byte)param1;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (param1 != 8364) {
              if (param1 == 8218) {
                var2 = -126;
                if (param0 != -43) {
                  field_h = (byte[]) null;
                  return (byte) var2;
                } else {
                  return (byte) var2;
                }
              } else {
                if (402 == param1) {
                  var2 = -125;
                  if (param0 != -43) {
                    field_h = (byte[]) null;
                    return (byte) var2;
                  } else {
                    return (byte) var2;
                  }
                } else {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2 = -122;
                        if (param0 == -43) {
                          return (byte) var2;
                        } else {
                          field_h = (byte[]) null;
                          return (byte) var2;
                        }
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                          if (param0 == -43) {
                            return (byte) var2;
                          } else {
                            field_h = (byte[]) null;
                            return (byte) var2;
                          }
                        } else {
                          if (param1 == 710) {
                            var2 = -120;
                            break L2;
                          } else {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                                break L2;
                              } else {
                                if (8249 == param1) {
                                  var2 = -117;
                                  break L2;
                                } else {
                                  if (338 != param1) {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      break L2;
                                    } else {
                                      if (8216 == param1) {
                                        var2 = -111;
                                        break L2;
                                      } else {
                                        if (param1 == 8217) {
                                          var2 = -110;
                                          break L2;
                                        } else {
                                          if (param1 == 8220) {
                                            var2 = -109;
                                            break L2;
                                          } else {
                                            if (8221 != param1) {
                                              if (param1 != 8226) {
                                                if (8211 == param1) {
                                                  var2 = -106;
                                                  break L2;
                                                } else {
                                                  if (8212 != param1) {
                                                    if (param1 != 732) {
                                                      if (8482 == param1) {
                                                        var2 = -103;
                                                        break L2;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                          break L2;
                                                        } else {
                                                          if (param1 != 8250) {
                                                            if (339 == param1) {
                                                              var2 = -100;
                                                              break L2;
                                                            } else {
                                                              if (param1 == 382) {
                                                                var2 = -98;
                                                                break L2;
                                                              } else {
                                                                if (param1 == 376) {
                                                                  var2 = -97;
                                                                  break L2;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -108;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -116;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      var2 = -123;
                      break L2;
                    }
                  } else {
                    var2 = -124;
                    break L2;
                  }
                }
              }
            } else {
              L4: {
                var2 = -128;
                if (param0 == -43) {
                  break L4;
                } else {
                  field_h = (byte[]) null;
                  break L4;
                }
              }
              return (byte) var2;
            }
          }
          if (param0 == -43) {
            return (byte) var2;
          } else {
            field_h = (byte[]) null;
            return (byte) var2;
          }
        }
    }

    final ai a(byte param0, km[] param1) {
        RuntimeException var3 = null;
        ai stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_e = param1;
            if (param0 >= 72) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ai) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ai.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ai) (this);
        }
    }

    final ai a(byte param0, boolean param1) {
        if (param0 >= -36) {
            return (ai) null;
        }
        this.field_i = param1 ? true : false;
        return (ai) (this);
    }

    final ai a(int param0, int param1) {
        if (param1 != 26631) {
            return (ai) null;
        }
        this.field_g = param0;
        return (ai) (this);
    }

    final void a(mf param0, ai param1, int param2, int param3, nj param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_i) {
                param1.a(param5, param4, param3 + 22057, param0, param2);
                param1.a((byte) 102);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_e != null) {
                param1.field_e = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null == this.field_k) {
                break L3;
              } else {
                param1.field_k = this.field_k;
                break L3;
              }
            }
            L4: {
              if (2147483647 == (this.field_d ^ -1)) {
                break L4;
              } else {
                param1.field_d = this.field_d;
                break L4;
              }
            }
            L5: {
              if (-1 <= this.field_b) {
                param1.field_b = this.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_g ^ -1) == 2147483647) {
                break L6;
              } else {
                param1.field_g = this.field_g;
                break L6;
              }
            }
            L7: {
              if (param3 == -22160) {
                break L7;
              } else {
                this.a(16, -69);
                break L7;
              }
            }
            L8: {
              if (2147483647 == (this.field_c ^ -1)) {
                break L8;
              } else {
                param1.field_c = this.field_c;
                break L8;
              }
            }
            L9: {
              if (0 < (this.field_f ^ -1)) {
                break L9;
              } else {
                param1.field_f = this.field_f;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("ai.M(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ',' + param5 + ')');
        }
    }

    final ai a(byte param0, int param1) {
        km[] var4;
        if (param0 != -128) {
          var4 = (km[]) null;
          this.a((byte) 114, (km[]) null);
          this.field_c = param1;
          return (ai) (this);
        } else {
          this.field_c = param1;
          return (ai) (this);
        }
    }

    final void a(ai param0, byte param1) {
        try {
            param0.field_d = this.field_d;
            param0.field_b = this.field_b;
            if (param1 != -103) {
                this.field_k = (km) null;
            }
            param0.field_f = this.field_f;
            param0.field_g = this.field_g;
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_e = this.field_e;
            param0.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ai.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ai a(int param0, byte param1) {
        this.field_b = param0;
        if (param1 >= -31) {
            this.field_f = -126;
            return (ai) (this);
        }
        return (ai) (this);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -90) {
            field_h = (byte[]) null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static km[] a(int param0, String param1, String param2, um param3) {
        km[] var4 = null;
        RuntimeException var4_ref = null;
        km[] var5 = null;
        km[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = ao.a(param3, param1, param0 ^ 24985, param2);
              var4 = var5;
              if (param0 == 27176) {
                break L1;
              } else {
                field_j = -12;
                break L1;
              }
            }
            var5[1].field_v = var5[1].field_w;
            var5[3].field_u = var5[3].field_t;
            var5[5].field_u = var5[5].field_t;
            var5[7].field_v = var5[7].field_w;
            stackIn_3_0 = (km[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ai.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0) {
        this.field_d = 256;
        this.field_g = 0;
        this.field_k = null;
        this.field_f = 0;
        if (param0 != 102) {
          this.a(69, false);
          this.field_c = 0;
          this.field_b = -1;
          this.field_e = null;
          return;
        } else {
          this.field_c = 0;
          this.field_b = -1;
          this.field_e = null;
          return;
        }
    }

    final ai a(int param0, boolean param1) {
        this.field_f = param0;
        if (param1) {
            this.field_g = 24;
            return (ai) (this);
        }
        return (ai) (this);
    }

    final void a(int param0, nj param1, int param2, mf param3, int param4) {
        lh stackIn_21_0;
        String stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        lh stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              em.a(param4 + param3.field_r, this.field_e, param3.field_y, param0 + param3.field_u, 24599, param3.field_C);
              if (null == this.field_k) {
                break L1;
              } else {
                L2: {
                  var6_int = this.field_g + (param3.field_u + param0);
                  if (param1.field_l == 1) {
                    var6_int = var6_int + (param3.field_y + -this.field_k.field_v) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_c + param4 - -param3.field_r;
                  if (param1.field_c == 1) {
                    var7 = var7 + (param3.field_C + -this.field_k.field_u) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-3 == (param1.field_l ^ -1)) {
                    var6_int = var6_int + (param3.field_y + -this.field_k.field_v);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param1.field_c ^ -1)) {
                    var7 = var7 + (-this.field_k.field_u + param3.field_C);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_k.b(var6_int, var7);
                break L1;
              }
            }
            if (param2 <= -51) {
              L6: {
                var6 = param1.a(-29558, param3);
                if (var6 == null) {
                  break L6;
                } else {
                  if (null == param1.field_e) {
                    break L6;
                  } else {
                    if (0 > this.field_f) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_21_0 = param1.field_e;

                        stackIn_21_1 = (String) (var6);

                        stackIn_21_2 = param1.field_r;

                        stackIn_21_3 = param3.field_u + param0;

                        if (-2147483648 == this.field_g) {
                          stackIn_22_0 = (lh) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = stackIn_21_3;
                          stackIn_22_4 = 0;
                          break L7;
                        } else {
                          stackIn_22_0 = (lh) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = stackIn_21_3;
                          stackIn_22_4 = this.field_g;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 + (stackIn_22_3 - -stackIn_22_4);

                        stackIn_24_3 = param3.field_r + param4;

                        stackIn_24_4 = -param1.field_m;

                        if (-2147483648 == this.field_c) {
                          stackIn_22_0 = (lh) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = 0;
                          break L8;
                        } else {
                          stackIn_22_0 = (lh) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = this.field_c;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 - (stackIn_25_4 - stackIn_25_5);

                        stackIn_27_4 = -param1.field_n + param3.field_y + -param1.field_r;

                        stackIn_27_5 = -param1.field_m + param3.field_C + -param1.field_k;

                        stackIn_27_6 = this.field_f;

                        stackIn_27_7 = this.field_b;

                        if (this.field_d == -2147483648) {
                          stackIn_22_0 = (lh) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L9;
                        } else {
                          stackIn_22_0 = (lh) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_d;
                          break L9;
                        }
                      }
                      ((lh) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_l, param1.field_c, param1.field_j);
                      break L6;
                    }
                  }
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
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("ai.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ai() {
        this.field_g = -2147483648;
        this.field_b = -2;
        this.field_k = null;
        this.field_i = false;
        this.field_e = null;
        this.field_f = -2;
        this.field_c = -2147483648;
        this.field_d = -2147483648;
    }

    static {
        field_h = new byte[]{(byte)7};
        field_a = new String[]{"Promote a pawn to a queen in a Rated game", "Perform the king's castling move in a Rated game", "Win a Rated game in no more than six moves from both players combined", "Win a Rated game without losing any pieces", "Win a Rated game without taking any pieces", "Play 5 Rated games", "Play 10 Rated games", "Win 5 Rated games", "Win 10 Rated games", "Win 25 Rated games", "Win a Rated game with the Halloween set"};
    }
}
