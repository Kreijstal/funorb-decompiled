/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends en {
    private th field_V;
    private int field_W;
    private int field_ab;
    private int field_T;
    static boolean field_U;
    static int[] field_bb;
    static int field_Z;
    static hm[] field_S;
    private qm field_X;
    private int field_R;
    private fp field_Q;
    private int field_Y;

    private final void a(int param0, qm param1) {
        try {
            if (null != this.field_V) {
                this.field_V.a(false);
            }
            if (param1 == null) {
                this.field_V = new th();
            } else {
                param1.a(param1.field_f, 6, this.field_R + 6, param1.field_g, (byte) -52);
                this.field_V = new th(param1);
            }
            this.b(this.field_V, param0 + 26550);
            if (param0 != -26498) {
                this.k(103);
            }
            this.field_X = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ud.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean e(byte param0) {
        if (param0 != 79) {
          this.field_Q = (fp) null;
          this.j(-1);
          return super.e((byte) 79);
        } else {
          this.j(-1);
          return super.e((byte) 79);
        }
    }

    final void j(int param0) {
        if (null != this.field_Q) {
            if (!(mi.field_D == this.field_Q)) {
                this.a(12 - -this.field_R + this.field_X.field_f, (byte) -94, 12 + this.field_X.field_g);
                this.a(-26498, this.field_X);
            }
            this.field_V.field_z = 256;
            this.field_Q = null;
        }
        super.j(param0);
    }

    void a(qm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_X = param0;
              if (ok.field_b != this.field_Q) {
                if (this.field_Q != jh.field_f) {
                  this.field_Q = jh.field_f;
                  this.field_Y = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.a(this.field_ab, this.field_R + 12 + this.field_X.field_f, (byte) -93, 12 + this.field_X.field_g);
                this.field_Y = 0;
                break L1;
              }
            }
            if (param1 == -50) {
              break L0;
            } else {
              this.field_V = (th) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ud.CA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        if (this.field_Q == jh.field_f) {
          return;
        } else {
          this.field_Y = 0;
          this.field_Q = mi.field_D;
          this.a(-26498, this.field_X);
          this.field_V.field_z = 0;
          if (param0 != 42) {
            this.field_Y = 16;
            this.field_X = null;
            return;
          } else {
            this.field_X = null;
            return;
          }
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_V != null) {
                L1: {
                  if (98 == param0) {
                    this.field_V.a(true, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (99 != param0) {
                    break L2;
                  } else {
                    this.field_V.a(true, param2);
                    break L2;
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ud.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void h(byte param0) {
        CharSequence var2;
        if (param0 > -6) {
          var2 = (CharSequence) null;
          ud.a((CharSequence) null, -109, (byte) -70, false);
          field_bb = null;
          field_S = null;
          return;
        } else {
          field_bb = null;
          field_S = null;
          return;
        }
    }

    boolean g(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = CrazyCrystals.field_B;
        if (param0 == 8) {
          if (this.field_Q != null) {
            if (this.field_Q == jh.field_f) {
              fieldTemp$2 = this.field_Y + 1;
              this.field_Y = this.field_Y + 1;
              if (this.field_T != fieldTemp$2) {
                this.field_V.field_z = 256 - (this.field_Y << -984802936) / this.field_T;
                return super.g((byte) 8);
              } else {
                this.field_Q = ok.field_b;
                this.a(this.field_ab, this.field_X.field_f + (12 + this.field_R), (byte) -93, this.field_X.field_g + 12);
                this.field_Y = 0;
                this.field_V.field_z = 0;
                return super.g((byte) 8);
              }
            } else {
              if (mi.field_D == this.field_Q) {
                fieldTemp$3 = this.field_Y + 1;
                this.field_Y = this.field_Y + 1;
                if (fieldTemp$3 != this.field_W) {
                  this.field_V.field_z = (this.field_Y << -898946712) / this.field_W;
                  return super.g((byte) 8);
                } else {
                  this.field_V.field_z = 256;
                  this.field_Q = null;
                  return super.g((byte) 8);
                }
              } else {
                return super.g((byte) 8);
              }
            }
          } else {
            return super.g((byte) 8);
          }
        } else {
          return true;
        }
    }

    ud(ol param0, qm param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_g, param1.field_f + 12 - -param2);
        try {
            this.field_R = param2;
            this.field_W = param3;
            this.field_T = param3;
            this.field_ab = param4;
            this.a(-26498, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, java.awt.Color param3, boolean param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = jd.field_D.getGraphics();
                  if (null != fg.field_i) {
                    break L2;
                  } else {
                    fg.field_i = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param4) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, ap.field_r, rh.field_f);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param3 == null) {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == ba.field_h) {
                        ba.field_h = jd.field_D.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = ba.field_h.getGraphics();
                    var10.setColor(param3);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param2, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(param1, 1, 301, 31);
                    var10.fillRect(2 - -(param2 * 3), 2, -(param2 * 3) + 300, 30);
                    var10.setFont(fg.field_i);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (304 + -(param0.length() * 6)) / 2, 22);
                    var9.drawImage(ba.field_h, ap.field_r / 2 - 152, -18 + rh.field_f / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + ap.field_r / 2;
                    var8 = -18 + rh.field_f / 2;
                    var9.setColor(param3);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 + 2, 2 + var8, param2 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 - -1, 1 + var8, 301, 31);
                    var9.fillRect(3 * param2 + var7 - -2, var8 - -2, 300 - param2 * 3, 30);
                    var9.setFont(fg.field_i);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 + (304 + -(6 * param0.length())) / 2, 22 + var8);
                    break L7;
                  }
                }
                if (nd.field_o == null) {
                  break L1;
                } else {
                  var9.setFont(fg.field_i);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(nd.field_o, ap.field_r / 2 - 6 * nd.field_o.length() / 2, rh.field_f / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              jd.field_D.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("ud.LA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, int param1, byte param2, boolean param3) {
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (-3 < (param1 ^ -1)) {
                break L1;
              } else {
                if (-37 <= (param1 ^ -1)) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = 69 / ((param2 - 19) / 59);
                  var8 = param0.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_40_0 = var6;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var10 = param0.charAt(var9);
                          if (0 != var9) {
                            break L4;
                          } else {
                            if (45 == var10) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param3) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (122 < var10) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var10 >= param1) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = var6 * param1 - -var10;
                          if (var6 == var11 / param1) {
                            var5 = 1;
                            var6 = var11;
                            break L3;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("ud.RB(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_40_0;
    }

    static {
        field_bb = new int[8192];
        field_U = false;
        field_Z = 0;
    }
}
