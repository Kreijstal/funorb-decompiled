/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ug {
    private boolean field_P;
    private vb field_R;
    private vb field_O;
    private vb field_M;
    static LevelPack[] field_L;
    static String field_N;
    static NodeDeque field_Q;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, (byte) -119, param4);
        int var6 = -130 + param4 >> 1;
        if (!this.field_P) {
          this.field_R.a(param0, var6, 0, (byte) -119, 25);
          this.field_M.a(param0, var6 + 45, 0, (byte) -119, 25);
          this.field_O.a(param0, 90 + var6, 0, param3, 40);
          return;
        }
        this.field_M.a(param0, var6, 0, (byte) -119, 25);
        this.field_R.a(param0, 45 + var6, 0, (byte) -119, 25);
        this.field_O.a(param0, 90 + var6, 0, param3, 40);
    }

    final String d(int param0) {
        String var2 = this.field_M.d(77);
        if (var2 != null) {
          return var2;
        }
        if (param0 <= 6) {
          na.j((byte) -82);
          if (this.field_q) {
            return this.field_z == null ? this.field_A : this.field_z;
          }
          return null;
        }
        if (this.field_q) {
          return this.field_z == null ? this.field_A : this.field_z;
        }
        return null;
    }

    final void a(an param0, byte param1) {
        try {
          super.a(param0, param1);
          this.field_R.field_i = (uh) ((Object) param0);
          this.field_M.field_i = (uh) ((Object) param0);
          this.field_O.field_i = (uh) ((Object) param0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "na.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 5390) {
          this.field_M = (vb) null;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_O.field_A);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static RgbSprite[] a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RgbSprite var16 = null;
        int[] var18 = Rasterizer2D.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = Rasterizer2D.width;
        int var8 = Rasterizer2D.height;
        RgbSprite var9 = new RgbSprite(param2, param4 - param2 * 2);
        var9.bindRasterTarget();
        Rasterizer2D.fillVerticalGradient(0, 0, param2, param4 - param2 * 2, param3, param1);
        RgbSprite var10 = new RgbSprite(param2, param2);
        var10.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, param2, param2, param3);
        RgbSprite var11 = new RgbSprite(16, param2);
        var11.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, 16, param2, param3);
        RgbSprite var12 = new RgbSprite(param2, param2);
        var12.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, param2, param2, param1);
        RgbSprite var13 = new RgbSprite(16, param2);
        var13.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, 16, param2, param1);
        Object var14 = null;
        if (0 < param5) {
          var16 = new RgbSprite(16, 16);
          var14 = var16;
          var16.bindRasterTarget();
          Rasterizer2D.fillRectangle(0, 0, 16, 16, param5);
        }
        Rasterizer2D.bind(var18, var7, var8);
        if (!param0) {
          return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
        }
        na.a(false, 118, 124, -92, 47, -40);
        return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
    }

    private na(ub param0, boolean param1) {
        super(0, 0, 0, 0, (ub) null);
        try {
          this.field_R = (vb) ((Object) new sf("", (uh) null, 2));
          this.field_M = (vb) ((Object) new sf("", (uh) null, 2));
          this.field_O = (vb) ((Object) new sf("", (uh) null, 4));
          this.field_O.field_l = param0;
          this.field_M.field_l = param0;
          this.field_R.field_l = param0;
          this.field_P = param1 ? true : false;
          if (!this.field_P) {
            this.a(this.field_R, true);
            this.a(this.field_M, true);
          } else {
            this.a(this.field_M, true);
            this.a(this.field_R, true);
          }
          this.a(this.field_O, true);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean j(byte param0) {
        if (param0 != -60) {
          na.a(true, 76, -125, -71, 104, -123);
          if (tn.field_m == null) {
            return false;
          }
          if (tn.field_m.h(param0 ^ -55)) {
            return true;
          }
          return false;
        }
        if (tn.field_m == null) {
          return false;
        }
        if (tn.field_m.h(param0 ^ -55)) {
          return true;
        }
        return false;
    }

    final boolean h(byte param0) {
        if (null == this.field_R.field_A) {
          return true;
        }
        if (0 == this.field_R.field_A.length()) {
          return true;
        }
        if (this.field_M.field_A == null) {
          return true;
        }
        if (this.field_M.field_A.length() == 0) {
          return true;
        }
        if (param0 != -124) {
          field_Q = (NodeDeque) null;
        }
        if (this.field_O.field_A != null &&
          this.field_O.field_A.length() != 0) {
          return false;
        }
        return true;
    }

    private final void a(oc param0, String param1, byte param2, int param3, int param4) {
        try {
          og.field_Yb.b(param1, param3 + param0.field_o + (param0.field_t >> 1), param0.field_w + (param4 - 5), 16777215, -1);
          int var6_int = -127 % ((-2 - param2) / 59);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "na.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        try {
          g.field_n.field_X = param4;
          g.field_n.field_Cb = param1;
          g.field_n.field_Mb = param2;
          g.field_n.field_Ib = g.field_n.field_Ib + ap.field_e.field_Ib;
          ap.field_e.field_P = ap.field_e.field_P + ap.field_e.field_Ib;
          ap.field_e.field_Ib = param3;
          if (param0 >= -72) {
            na.a(true, true, 77, -47);
          }
          g.field_n.field_Ib = g.field_n.field_Ib - ap.field_e.field_Ib;
          ap.field_e.field_P = ap.field_e.field_P - ap.field_e.field_Ib;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "na.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        mh stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        mh stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        mh stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        mh stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        mh stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        mh stackIn_60_0 = null;
        boolean stackIn_61_1 = false;
        int var4;
        Brick.e(-79);
        if (m.field_h >= 0) {
          dn.field_N.field_Mb = rd.a(rm.field_c, new String[]{Integer.toString(m.field_h)}, (byte) 103);
          var4 = 34 / ((-10 - param2) / 53);
          stackIn_48_0 = fe.field_gb;
          stackIn_49_1 = (param0) && (!param1) && (!sc.field_c) && (null == o.field_e) && (nl.field_f == null);
          ((mh) (Object) stackIn_48_0).a(stackIn_49_1, -15211);
          stackIn_55_0 = rm.field_a;
          stackIn_56_1 = (param0) && (!param1) && (!sc.field_c) && (o.field_e == null) && (null == nl.field_f);
          ((mh) (Object) stackIn_55_0).a(stackIn_56_1, -15211);
          stackIn_60_0 = qp.field_f;
          stackIn_61_1 = (param0) && (!param1) && (sc.field_c);
          ((mh) (Object) stackIn_60_0).a(stackIn_61_1, -15211);
        } else {
          dn.field_N.field_Mb = null;
          var4 = 34 / ((-10 - param2) / 53);
          stackIn_7_0 = fe.field_gb;
          stackIn_8_1 = (param0) && (!param1) && (!sc.field_c) && (null == o.field_e) && (nl.field_f == null);
          ((mh) (Object) stackIn_7_0).a(stackIn_8_1, -15211);
          stackIn_14_0 = rm.field_a;
          stackIn_15_1 = (param0) && (!param1) && (!sc.field_c) && (o.field_e == null) && (null == nl.field_f);
          ((mh) (Object) stackIn_14_0).a(stackIn_15_1, -15211);
          stackIn_19_0 = qp.field_f;
          stackIn_20_1 = (param0) && (!param1) && (sc.field_c);
          ((mh) (Object) stackIn_19_0).a(stackIn_20_1, -15211);
        }
        ap.field_b.field_d.i(0);
        if (HighscorePackSelector.field_k.field_L != 0) {
          tq.field_c = true;
        }
        if (gj.field_b.field_L != 0) {
          if (ea.field_g) {
            ml.a(param3, -1);
          } else {
            if (go.field_c > 0) {
              ml.a(param3, -1);
            } else {
              if (kb.field_Yb >= 2 &&
                pe.heldKeys[12]) {
                ml.a(param3, -1);
              }
            }
          }
        }
        if (td.field_v.field_L != 0) {
          if (1 == w.field_n.length &&
            pf.field_i != w.field_n[0]) {
            pf.field_i = w.field_n[0];
          }
          pl.a(param3, Brick.field_O, pf.field_i, true, 0, (byte) -102);
        }
        if (0 != nh.field_a.field_L) {
          sc.field_c = false;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (param2 == 0) {
          param0 = param0 + this.field_w;
          param1 = param1 + this.field_o;
          this.a(this.field_R, ej.field_M, (byte) 127, param1, param0);
          this.a(this.field_M, rl.field_f, (byte) 123, param1, param0);
          this.a(this.field_O, kk.field_f, (byte) -86, param1, param0);
          return;
        }
    }

    na(ub param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= 0) {
          if (param1 < 160) {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (8218 != param1) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 != 8230) {
                      if (8224 != param1) {
                        if (8225 != param1) {
                          if (param1 == 710) {
                            var2 = -120;
                          } else {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (param1 != 8249) {
                                  if (param1 == 338) {
                                    var2 = -116;
                                  } else {
                                    if (381 != param1) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 != param1) {
                                                if (8211 != param1) {
                                                  if (param1 != 8212) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                        } else {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                          } else {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                            } else {
                                                              if (param1 != 382) {
                                                                var2 = (param1 == 376) ? -97 : 63;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                }
                                              } else {
                                                var2 = -107;
                                              }
                                            } else {
                                              var2 = -108;
                                            }
                                          } else {
                                            var2 = -109;
                                          }
                                        } else {
                                          var2 = -110;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            } else {
                              var2 = -119;
                            }
                          }
                        } else {
                          var2 = -121;
                        }
                      } else {
                        var2 = -122;
                      }
                    } else {
                      var2 = -123;
                    }
                  }
                } else {
                  var2 = -125;
                }
              } else {
                var2 = -126;
              }
            }
            if (param0 != -8250) {
              return (byte) 9;
            }
            return (byte) var2;
          }
          if (param1 <= 255) {
            var2 = (byte)param1;
          } else {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (8218 != param1) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 != 8230) {
                      if (8224 != param1) {
                        if (8225 != param1) {
                          if (param1 == 710) {
                            var2 = -120;
                          } else {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (param1 != 8249) {
                                  if (param1 == 338) {
                                    var2 = -116;
                                  } else {
                                    if (381 != param1) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 != param1) {
                                                if (8211 != param1) {
                                                  if (param1 != 8212) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                        } else {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                          } else {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                            } else {
                                                              if (param1 != 382) {
                                                                var2 = (param1 == 376) ? -97 : 63;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                }
                                              } else {
                                                var2 = -107;
                                              }
                                            } else {
                                              var2 = -108;
                                            }
                                          } else {
                                            var2 = -109;
                                          }
                                        } else {
                                          var2 = -110;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            } else {
                              var2 = -119;
                            }
                          }
                        } else {
                          var2 = -121;
                        }
                      } else {
                        var2 = -122;
                      }
                    } else {
                      var2 = -123;
                    }
                  }
                } else {
                  var2 = -125;
                }
              } else {
                var2 = -126;
              }
            }
          }
        } else {
          if (param1 < 128) {
            var2 = (byte)param1;
          } else {
            if (param1 < 160) {
              if (param1 == 8364) {
                var2 = -128;
              } else {
                if (8218 != param1) {
                  if (param1 != 402) {
                    if (param1 == 8222) {
                      var2 = -124;
                    } else {
                      if (param1 != 8230) {
                        if (8224 != param1) {
                          if (8225 != param1) {
                            if (param1 == 710) {
                              var2 = -120;
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                    } else {
                                      if (381 != param1) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                        } else {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (8226 != param1) {
                                                  if (8211 != param1) {
                                                    if (param1 != 8212) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2 = -103;
                                                        } else {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                          } else {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                              } else {
                                                                if (param1 != 382) {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                  } else {
                                                                    var2 = 63;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                }
                                              } else {
                                                var2 = -108;
                                              }
                                            } else {
                                              var2 = -109;
                                            }
                                          } else {
                                            var2 = -110;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                  }
                                }
                              } else {
                                var2 = -119;
                              }
                            }
                          } else {
                            var2 = -121;
                          }
                        } else {
                          var2 = -122;
                        }
                      } else {
                        var2 = -123;
                      }
                    }
                  } else {
                    var2 = -125;
                  }
                } else {
                  var2 = -126;
                }
              }
            } else {
              if (param1 <= 255) {
                var2 = (byte)param1;
              } else {
                if (param1 == 8364) {
                  var2 = -128;
                } else {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 == 8221) {
                                                  var2 = -108;
                                                } else {
                                                  if (8226 == param1) {
                                                    var2 = -107;
                                                  } else {
                                                    if (8211 == param1) {
                                                      var2 = -106;
                                                    } else {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                      } else {
                                                        if (param1 == 732) {
                                                          var2 = -104;
                                                        } else {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                } else {
                                                                  if (param1 == 382) {
                                                                    var2 = -98;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                    } else {
                                                                      var2 = 63;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -109;
                                              }
                                            } else {
                                              var2 = -110;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                }
                              }
                            } else {
                              var2 = -121;
                            }
                          } else {
                            var2 = -122;
                          }
                        } else {
                          var2 = -123;
                        }
                      }
                    } else {
                      var2 = -125;
                    }
                  } else {
                    var2 = -126;
                  }
                }
              }
            }
          }
        }
        if (param0 == -8250) {
          return (byte) var2;
        }
        return (byte) 9;
    }

    public static void k(byte param0) {
        int var1 = 13 / ((-32 - param0) / 57);
        field_L = null;
        field_Q = null;
        field_N = null;
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 > -79) {
          this.field_P = true;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_R.field_A);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final int i(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != -117) {
            field_N = (String) null;
          }
          stackIn_3_0 = Integer.parseInt(this.field_M.field_A) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    static {
        field_N = "Create a free account to start using this feature";
        field_Q = new NodeDeque();
    }
}
