/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mn extends aa implements ng {
    private boolean field_eb;
    private uc field_cb;
    private boolean field_Y;
    private boolean field_ab;
    static int[] field_Z;
    static int[] field_bb;
    private boolean field_fb;
    private kf field_db;

    final static t a(la param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        t stackIn_3_0 = null;
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
              var4_int = param0.a(-1, param1);
              if (param3 > 81) {
                break L1;
              } else {
                mn.h((byte) 123);
                break L1;
              }
            }
            var5 = param0.a(param2, -121, var4_int);
            stackIn_3_0 = wi.a(var5, (byte) -106, param0, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("mn.QA(");

            if (param0 == null) {
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

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte dupTemp$2 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        Object stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        byte[] var8 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var9 = new byte[param3];
            var4 = var9;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param3 <= var6) {
                L2: {
                  if (param0 == -6058) {
                    break L2;
                  } else {
                    var8 = (byte[]) null;
                    mn.a(-121, (byte[]) null, -61, -87);
                    break L2;
                  }
                }
                if (var5 != 0) {
                  stackIn_15_0 = (byte[]) (var9);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_13_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  dupTemp$2 = param1[var6];
                  var9[var6] = dupTemp$2;
                  if ((dupTemp$2 ^ -1) != (param2 ^ -1)) {
                    var5 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("mn.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_13_0);
        } else {
          return stackIn_15_0;
        }
    }

    final void a(int param0, String param1, int param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fo stackIn_13_0 = null;
        fo stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fo var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fo var6 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (!this.field_fb) {
              L1: {
                stackIn_5_0 = this;

                if (param0 != 256) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((mn) (this)).field_Y = stackIn_6_1 != 0;
                this.field_fb = true;
                if (param2 == -257) {
                  break L2;
                } else {
                  field_bb = (int[]) null;
                  break L2;
                }
              }
              L3: {
                this.field_db.c(4210752, 8405024, (byte) 125);
                var6 = new fo((mn) (this), this.field_cb, param1);
                var4 = var6;
                if ((param0 ^ -1) != -6) {
                  if (-257 == (param0 ^ -1)) {
                    var6.a(0, qm.field_b, (ca) (this));
                    break L3;
                  } else {
                    L4: {
                      stackIn_13_0 = (fo) (var6);

                      if (this.field_eb) {
                        stackIn_14_0 = (fo) ((Object) stackIn_13_0);
                        stackIn_14_1 = qm.field_b;
                        break L4;
                      } else {
                        stackIn_14_0 = (fo) ((Object) stackIn_13_0);
                        stackIn_14_1 = qh.field_a;
                        break L4;
                      }
                    }
                    ((fo) (Object) stackIn_14_0).a(stackIn_14_1, param2 ^ -5434, -1);
                    break L3;
                  }
                } else {
                  var6.a(kl.field_n, 5177, 11);
                  var6.a(pf.field_q, 5177, 17);
                  break L3;
                }
              }
              L5: {
                if (param0 == 3) {
                  var6.a(dc.field_b, 5177, 7);
                  break L5;
                } else {
                  if (4 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      var6.a(pf.field_u, param2 ^ -5434, 9);
                      break L5;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        var6.a(0, ml.field_c, (ca) (this));
                        break L5;
                      } else {
                        this.c(var6, 33);
                        return;
                      }
                    }
                  } else {
                    var6.a(cd.field_a, 5177, 8);
                    break L5;
                  }
                }
              }
              this.c(var6, 33);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("mn.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (param2 > 12) {
                  break L1;
                } else {
                  field_Z = (int[]) null;
                  break L1;
                }
              }
              if ((var3_int ^ -1) > -2) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var3_int ^ -1) >= -13) {
                  L2: {
                    var4 = hf.a(param0, 114);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (-2 < (var4.length() ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (ra.a(var4.charAt(0), 252)) {
                            break L3;
                          } else {
                            if (!ra.a(var4.charAt(var4.length() + -1), 252)) {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param0.length() <= var6) {
                                  if (0 >= var5) {
                                    stackIn_37_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_35_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param0.charAt(var6);
                                    if (!ra.a((char) var7, 252)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (!param1) {
                                        stackIn_31_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("mn.TA(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    return stackIn_37_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          if (!this.field_D) {
            return;
          } else {
            this.field_D = false;
            if (!this.field_eb) {
              if (this.field_ab) {
                kf.a((byte) -100);
                return;
              } else {
                return;
              }
            } else {
              wo.a(107);
              return;
            }
          }
        } else {
          mn.h((byte) 54);
          if (!this.field_D) {
            return;
          } else {
            this.field_D = false;
            if (!this.field_eb) {
              if (!this.field_ab) {
                return;
              } else {
                kf.a((byte) -100);
                return;
              }
            } else {
              wo.a(107);
              return;
            }
          }
        }
    }

    final void n(int param0) {
        fo var2;
        this.field_db.c(4210752, 2121792, (byte) 125);
        if (param0 != -20041) {
          return;
        } else {
          var2 = new fo((mn) (this), this.field_cb, kh.field_j);
          var2.a(pn.field_c, 5177, 15);
          this.c(var2, 33);
          return;
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        if (param0 != 77) {
            field_bb = (int[]) null;
            field_Z = null;
            return;
        }
        field_Z = null;
    }

    mn(ln param0, uc param1, String param2, boolean param3, boolean param4) {
        super(param0, new fo((mn) null, param1, param2), 77, 10, 10);
        try {
            this.field_cb = param1;
            this.field_fb = false;
            this.field_eb = param3 ? true : false;
            this.field_Y = false;
            this.field_ab = param4 ? true : false;
            this.field_db = new kf(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_db.field_M = true;
            this.a(this.field_db, -6938);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(byte param0, lg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        gm var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_Y) {
                ul.a(0, "tochangedisplayname.ws", ip.a(9));
                break L1;
              } else {
                od.b(128, 3);
                this.b(true);
                break L1;
              }
            }
            if (param0 < -85) {
              break L0;
            } else {
              var7 = (gm) null;
              this.a(-44, (gm) null, 'Z', 47);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("mn.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 13) {
              this.b(true);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -42 % ((param3 - -33) / 57);
              stackIn_5_0 = super.a(param0, param1, param2, 55);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("mn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    static {
        field_bb = new int[16384];
    }
}
