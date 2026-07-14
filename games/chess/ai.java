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
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        CharSequence var31 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        if (me.field_a != null) {
          var3 = me.field_a.a(3, param0);
          if (var3 != 0) {
            L0: {
              if (var3 != 2) {
                break L0;
              } else {
                if (null == me.field_a.field_db) {
                  break L0;
                } else {
                  if (!me.field_a.field_db.equals((Object) (Object) "")) {
                    L1: {
                      if (me.field_a.field_db.charAt(0) != 91) {
                        var31 = (CharSequence) (Object) me.field_a.field_db;
                        var4 = ad.a(var31, -2);
                        break L1;
                      } else {
                        var4 = me.field_a.field_db;
                        break L1;
                      }
                    }
                    L2: {
                      var5 = null;
                      if (pk.field_b == 0) {
                        var5 = hf.a(param2, 79, var4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (pk.field_b != 1) {
                        break L3;
                      } else {
                        var5 = ab.a(param2, param1 + 21247, var4);
                        break L3;
                      }
                    }
                    L4: {
                      if (pk.field_b != 2) {
                        break L4;
                      } else {
                        var5 = a.a(param2, var4, (byte) 64);
                        break L4;
                      }
                    }
                    L5: {
                      if (3 == pk.field_b) {
                        var5 = of.a(var4, param2, var4, -1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var5 == null) {
                      break L0;
                    } else {
                      var6 = null;
                      lc.a(var4, (String) null, 2, 0, var5, false);
                      pk.field_b = -1;
                      me.field_a = null;
                      if (param1 == 3) {
                        return;
                      } else {
                        byte discarded$5 = ai.a((byte) 43, '�');
                        return;
                      }
                    }
                  } else {
                    pk.field_b = -1;
                    me.field_a = null;
                    if (param1 == 3) {
                      return;
                    } else {
                      byte discarded$6 = ai.a((byte) 43, '�');
                      return;
                    }
                  }
                }
              }
            }
            pk.field_b = -1;
            me.field_a = null;
            if (param1 == 3) {
              return;
            } else {
              byte discarded$7 = ai.a((byte) 43, '�');
              return;
            }
          } else {
            if (param1 != 3) {
              byte discarded$8 = ai.a((byte) 43, '�');
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 == 3) {
            return;
          } else {
            byte discarded$9 = ai.a((byte) 43, '�');
            return;
          }
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
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
                  field_h = null;
                  return (byte) var2;
                }
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                  if (param0 == -43) {
                    return (byte) var2;
                  } else {
                    field_h = null;
                    return (byte) var2;
                  }
                } else {
                  if (402 == param1) {
                    var2 = -125;
                    if (param0 == -43) {
                      return (byte) var2;
                    } else {
                      field_h = null;
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
                            field_h = null;
                            return (byte) var2;
                          }
                        } else {
                          if (param1 == 8225) {
                            var2 = -121;
                            if (param0 == -43) {
                              return (byte) var2;
                            } else {
                              field_h = null;
                              return (byte) var2;
                            }
                          } else {
                            if (param1 == 710) {
                              var2 = -120;
                              if (param0 == -43) {
                                return (byte) var2;
                              } else {
                                field_h = null;
                                return (byte) var2;
                              }
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  if (param0 == -43) {
                                    return (byte) var2;
                                  } else {
                                    field_h = null;
                                    return (byte) var2;
                                  }
                                } else {
                                  if (8249 == param1) {
                                    var2 = -117;
                                    if (param0 == -43) {
                                      return (byte) var2;
                                    } else {
                                      field_h = null;
                                      return (byte) var2;
                                    }
                                  } else {
                                    if (338 != param1) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        if (param0 == -43) {
                                          return (byte) var2;
                                        } else {
                                          field_h = null;
                                          return (byte) var2;
                                        }
                                      } else {
                                        if (8216 == param1) {
                                          var2 = -111;
                                          if (param0 == -43) {
                                            return (byte) var2;
                                          } else {
                                            field_h = null;
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (param1 == 8217) {
                                            var2 = -110;
                                            if (param0 == -43) {
                                              return (byte) var2;
                                            } else {
                                              field_h = null;
                                              return (byte) var2;
                                            }
                                          } else {
                                            if (param1 == 8220) {
                                              var2 = -109;
                                              if (param0 == -43) {
                                                return (byte) var2;
                                              } else {
                                                field_h = null;
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
              field_h = null;
              return (byte) var2;
            }
          } else {
            var2 = (byte)param1;
            if (param0 == -43) {
              return (byte) var2;
            } else {
              field_h = null;
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
                  field_h = null;
                  return (byte) var2;
                } else {
                  return (byte) var2;
                }
              } else {
                if (402 == param1) {
                  var2 = -125;
                  if (param0 != -43) {
                    field_h = null;
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
                          field_h = null;
                          return (byte) var2;
                        }
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                          if (param0 == -43) {
                            return (byte) var2;
                          } else {
                            field_h = null;
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
                  field_h = null;
                  break L4;
                }
              }
              return (byte) var2;
            }
          }
          if (param0 == -43) {
            return (byte) var2;
          } else {
            field_h = null;
            return (byte) var2;
          }
        }
    }

    final ai a(byte param0, km[] param1) {
        ((ai) this).field_e = param1;
        if (param0 < 72) {
            return null;
        }
        return (ai) this;
    }

    final ai a(byte param0, boolean param1) {
        if (param0 >= -36) {
            return null;
        }
        ((ai) this).field_i = param1 ? true : false;
        return (ai) this;
    }

    final ai a(int param0, int param1) {
        if (param1 != 26631) {
            return null;
        }
        ((ai) this).field_g = param0;
        return (ai) this;
    }

    final void a(mf param0, ai param1, int param2, int param3, nj param4, int param5) {
        if (!(!((ai) this).field_i)) {
            param1.a(param5, param4, param3 + 22057, param0, param2);
            param1.a((byte) 102);
        }
        if (!(((ai) this).field_e == null)) {
            param1.field_e = ((ai) this).field_e;
        }
        if (null != ((ai) this).field_k) {
            param1.field_k = ((ai) this).field_k;
        }
        if (2147483647 != (((ai) this).field_d ^ -1)) {
            param1.field_d = ((ai) this).field_d;
        }
        if (!(-1 > ((ai) this).field_b)) {
            param1.field_b = ((ai) this).field_b;
        }
        if ((((ai) this).field_g ^ -1) != 2147483647) {
            param1.field_g = ((ai) this).field_g;
        }
        if (param3 != -22160) {
            ai discarded$0 = ((ai) this).a(16, -69);
        }
        if (2147483647 != ((ai) this).field_c) {
            param1.field_c = ((ai) this).field_c;
        }
        if (0 <= ((ai) this).field_f) {
            param1.field_f = ((ai) this).field_f;
        }
    }

    final ai a(byte param0, int param1) {
        Object var4 = null;
        if (param0 != -128) {
          var4 = null;
          ai discarded$2 = ((ai) this).a((byte) 114, (km[]) null);
          ((ai) this).field_c = param1;
          return (ai) this;
        } else {
          ((ai) this).field_c = param1;
          return (ai) this;
        }
    }

    final void a(ai param0, byte param1) {
        param0.field_d = ((ai) this).field_d;
        param0.field_b = ((ai) this).field_b;
        if (param1 != -103) {
          ((ai) this).field_k = null;
          param0.field_f = ((ai) this).field_f;
          param0.field_g = ((ai) this).field_g;
          param0.field_i = ((ai) this).field_i;
          param0.field_c = ((ai) this).field_c;
          param0.field_e = ((ai) this).field_e;
          param0.field_k = ((ai) this).field_k;
          return;
        } else {
          param0.field_f = ((ai) this).field_f;
          param0.field_g = ((ai) this).field_g;
          param0.field_i = ((ai) this).field_i;
          param0.field_c = ((ai) this).field_c;
          param0.field_e = ((ai) this).field_e;
          param0.field_k = ((ai) this).field_k;
          return;
        }
    }

    final ai a(int param0, byte param1) {
        ((ai) this).field_b = param0;
        if (param1 >= -31) {
            ((ai) this).field_f = -126;
            return (ai) this;
        }
        return (ai) this;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -90) {
            field_h = null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static km[] a(int param0, String param1, String param2, um param3) {
        km[] var5 = ao.a(param3, param1, param0 ^ 24985, param2);
        km[] var4 = var5;
        if (param0 != 27176) {
            field_j = -12;
        }
        var5[1].field_v = var5[1].field_w;
        var5[3].field_u = var5[3].field_t;
        var5[5].field_u = var5[5].field_t;
        var5[7].field_v = var5[7].field_w;
        return var4;
    }

    final void a(byte param0) {
        ((ai) this).field_d = 256;
        ((ai) this).field_g = 0;
        ((ai) this).field_k = null;
        ((ai) this).field_f = 0;
        if (param0 != 102) {
          ai discarded$2 = ((ai) this).a(69, false);
          ((ai) this).field_c = 0;
          ((ai) this).field_b = -1;
          ((ai) this).field_e = null;
          return;
        } else {
          ((ai) this).field_c = 0;
          ((ai) this).field_b = -1;
          ((ai) this).field_e = null;
          return;
        }
    }

    final ai a(int param0, boolean param1) {
        ((ai) this).field_f = param0;
        if (param1) {
            ((ai) this).field_g = 24;
            return (ai) this;
        }
        return (ai) this;
    }

    final void a(int param0, nj param1, int param2, mf param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        lh stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        lh stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        lh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        lh stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        lh stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        lh stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        lh stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        lh stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        lh stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        lh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        lh stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        lh stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        lh stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        lh stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        lh stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        lh stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        lh stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        lh stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        L0: {
          em.a(param4 + param3.field_r, ((ai) this).field_e, param3.field_y, param0 + param3.field_u, 24599, param3.field_C);
          if (null == ((ai) this).field_k) {
            break L0;
          } else {
            L1: {
              var6_int = ((ai) this).field_g + (param3.field_u + param0);
              if (param1.field_l == 1) {
                var6_int = var6_int + (param3.field_y + -((ai) this).field_k.field_v) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = ((ai) this).field_c + param4 - -param3.field_r;
              if (param1.field_c == 1) {
                var7 = var7 + (param3.field_C + -((ai) this).field_k.field_u) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 == param1.field_l) {
                var6_int = var6_int + (param3.field_y + -((ai) this).field_k.field_v);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-3 == param1.field_c) {
                var7 = var7 + (-((ai) this).field_k.field_u + param3.field_C);
                break L4;
              } else {
                break L4;
              }
            }
            ((ai) this).field_k.b(var6_int, var7);
            break L0;
          }
        }
        if (param2 <= -51) {
          var6 = param1.a(-29558, param3);
          if (var6 != null) {
            if (null == param1.field_e) {
              return;
            } else {
              L5: {
                if (0 > ((ai) this).field_f) {
                  break L5;
                } else {
                  L6: {
                    stackOut_20_0 = param1.field_e;
                    stackOut_20_1 = (String) var6;
                    stackOut_20_2 = param1.field_r;
                    stackOut_20_3 = param3.field_u + param0;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    stackIn_22_3 = stackOut_20_3;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    if (-2147483648 == ((ai) this).field_g) {
                      stackOut_22_0 = (lh) (Object) stackIn_22_0;
                      stackOut_22_1 = (String) (Object) stackIn_22_1;
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3;
                      stackOut_22_4 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      break L6;
                    } else {
                      stackOut_21_0 = (lh) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = stackIn_21_3;
                      stackOut_21_4 = ((ai) this).field_g;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_23_0 = (lh) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2 + (stackIn_23_3 - -stackIn_23_4);
                    stackOut_23_3 = param3.field_r + param4;
                    stackOut_23_4 = -param1.field_m;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    stackIn_25_4 = stackOut_23_4;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    if (-2147483648 == ((ai) this).field_c) {
                      stackOut_25_0 = (lh) (Object) stackIn_25_0;
                      stackOut_25_1 = (String) (Object) stackIn_25_1;
                      stackOut_25_2 = stackIn_25_2;
                      stackOut_25_3 = stackIn_25_3;
                      stackOut_25_4 = stackIn_25_4;
                      stackOut_25_5 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      stackIn_26_3 = stackOut_25_3;
                      stackIn_26_4 = stackOut_25_4;
                      stackIn_26_5 = stackOut_25_5;
                      break L7;
                    } else {
                      stackOut_24_0 = (lh) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = ((ai) this).field_c;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_26_4 = stackOut_24_4;
                      stackIn_26_5 = stackOut_24_5;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_26_0 = (lh) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3 - (stackIn_26_4 - stackIn_26_5);
                    stackOut_26_4 = -param1.field_n + param3.field_y + -param1.field_r;
                    stackOut_26_5 = -param1.field_m + param3.field_C + -param1.field_k;
                    stackOut_26_6 = ((ai) this).field_f;
                    stackOut_26_7 = ((ai) this).field_b;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    stackIn_28_2 = stackOut_26_2;
                    stackIn_28_3 = stackOut_26_3;
                    stackIn_28_4 = stackOut_26_4;
                    stackIn_28_5 = stackOut_26_5;
                    stackIn_28_6 = stackOut_26_6;
                    stackIn_28_7 = stackOut_26_7;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    if (((ai) this).field_d == -2147483648) {
                      stackOut_28_0 = (lh) (Object) stackIn_28_0;
                      stackOut_28_1 = (String) (Object) stackIn_28_1;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = stackIn_28_3;
                      stackOut_28_4 = stackIn_28_4;
                      stackOut_28_5 = stackIn_28_5;
                      stackOut_28_6 = stackIn_28_6;
                      stackOut_28_7 = stackIn_28_7;
                      stackOut_28_8 = 256;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      stackIn_29_4 = stackOut_28_4;
                      stackIn_29_5 = stackOut_28_5;
                      stackIn_29_6 = stackOut_28_6;
                      stackIn_29_7 = stackOut_28_7;
                      stackIn_29_8 = stackOut_28_8;
                      break L8;
                    } else {
                      stackOut_27_0 = (lh) (Object) stackIn_27_0;
                      stackOut_27_1 = (String) (Object) stackIn_27_1;
                      stackOut_27_2 = stackIn_27_2;
                      stackOut_27_3 = stackIn_27_3;
                      stackOut_27_4 = stackIn_27_4;
                      stackOut_27_5 = stackIn_27_5;
                      stackOut_27_6 = stackIn_27_6;
                      stackOut_27_7 = stackIn_27_7;
                      stackOut_27_8 = ((ai) this).field_d;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      stackIn_29_2 = stackOut_27_2;
                      stackIn_29_3 = stackOut_27_3;
                      stackIn_29_4 = stackOut_27_4;
                      stackIn_29_5 = stackOut_27_5;
                      stackIn_29_6 = stackOut_27_6;
                      stackIn_29_7 = stackOut_27_7;
                      stackIn_29_8 = stackOut_27_8;
                      break L8;
                    }
                  }
                  int discarded$1 = ((lh) (Object) stackIn_29_0).a((String) (Object) stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param1.field_l, param1.field_c, param1.field_j);
                  break L5;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ai() {
        ((ai) this).field_g = -2147483648;
        ((ai) this).field_b = -2;
        ((ai) this).field_k = null;
        ((ai) this).field_i = false;
        ((ai) this).field_e = null;
        ((ai) this).field_f = -2;
        ((ai) this).field_c = -2147483648;
        ((ai) this).field_d = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new byte[]{(byte)7};
        field_a = new String[]{"Promote a pawn to a queen in a Rated game", "Perform the king's castling move in a Rated game", "Win a Rated game in no more than six moves from both players combined", "Win a Rated game without losing any pieces", "Win a Rated game without taking any pieces", "Play 5 Rated games", "Play 10 Rated games", "Win 5 Rated games", "Win 10 Rated games", "Win 25 Rated games", "Win a Rated game with the Halloween set"};
    }
}
