/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private int field_i;
    static int field_f;
    private tb[] field_b;
    private int[] field_a;
    private int field_e;
    static uf field_d;
    private int field_k;
    static boolean field_g;
    private int field_j;
    private int field_h;
    private tb field_c;

    final static String a(ah param0, String param1, int param2, String param3, byte param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.c(120)) {
              L1: {
                if (param4 == 15) {
                  break L1;
                } else {
                  ma.d(54);
                  break L1;
                }
              }
              stackIn_6_0 = param3 + " - " + param0.e(-11337, param2) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ma.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(String param0, long param1, java.applet.Applet param2, int param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param3 >= 102) {
                      L2: {
                        var8 = param2.getParameter("cookiehost");
                        var7 = var8;
                        var7 = var8;
                        var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        if (-1L >= (param1 ^ -1L)) {
                          var7 = var9 + "; Expires=" + ei.a((byte) 2, k.a(0) - -(1000L * param1)) + "; Max-Age=" + param1;
                          break L2;
                        } else {
                          var7 = var9 + "; Discard;";
                          break L2;
                        }
                      }
                      ii.a(-19149, "document.cookie=\"" + var7 + "\"", param2);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("ma.H(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean b(int param0) {
        if (param0 == 0) {
          this.field_j = this.field_j + 1;
          if (this.field_j >= this.field_c.field_f.length) {
            this.field_e = this.field_e + 1;
            if (!this.field_c.field_i) {
              if (this.field_e < this.field_c.field_b) {
                if (-1 >= (this.field_c.field_k ^ -1)) {
                  if (this.field_c.field_f.length <= this.field_c.field_k) {
                    this.field_j = 0;
                    this.field_i = this.field_c.field_f[this.field_j];
                    this.field_h = this.field_c.field_l[this.field_j];
                    return false;
                  } else {
                    this.field_j = this.field_c.field_k;
                    this.field_i = this.field_c.field_f[this.field_j];
                    this.field_h = this.field_c.field_l[this.field_j];
                    return false;
                  }
                } else {
                  this.field_j = 0;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (-1 >= (this.field_c.field_k ^ -1)) {
                if (this.field_c.field_f.length > this.field_c.field_k) {
                  this.field_j = this.field_c.field_k;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                } else {
                  this.field_j = 0;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                }
              } else {
                this.field_j = 0;
                this.field_i = this.field_c.field_f[this.field_j];
                this.field_h = this.field_c.field_l[this.field_j];
                return false;
              }
            }
          } else {
            this.field_i = this.field_c.field_f[this.field_j];
            this.field_h = this.field_c.field_l[this.field_j];
            return false;
          }
        } else {
          field_d = (uf) null;
          this.field_j = this.field_j + 1;
          if (this.field_j >= this.field_c.field_f.length) {
            this.field_e = this.field_e + 1;
            if (!this.field_c.field_i) {
              if (this.field_e < this.field_c.field_b) {
                if (-1 >= (this.field_c.field_k ^ -1)) {
                  if (this.field_c.field_f.length > this.field_c.field_k) {
                    this.field_j = this.field_c.field_k;
                    this.field_i = this.field_c.field_f[this.field_j];
                    this.field_h = this.field_c.field_l[this.field_j];
                    return false;
                  } else {
                    this.field_j = 0;
                    this.field_i = this.field_c.field_f[this.field_j];
                    this.field_h = this.field_c.field_l[this.field_j];
                    return false;
                  }
                } else {
                  this.field_j = 0;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (-1 >= (this.field_c.field_k ^ -1)) {
                if (this.field_c.field_f.length > this.field_c.field_k) {
                  this.field_j = this.field_c.field_k;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                } else {
                  this.field_j = 0;
                  this.field_i = this.field_c.field_f[this.field_j];
                  this.field_h = this.field_c.field_l[this.field_j];
                  return false;
                }
              } else {
                this.field_j = 0;
                this.field_i = this.field_c.field_f[this.field_j];
                this.field_h = this.field_c.field_l[this.field_j];
                return false;
              }
            }
          } else {
            this.field_i = this.field_c.field_f[this.field_j];
            this.field_h = this.field_c.field_l[this.field_j];
            return false;
          }
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != -3) {
            field_f = 127;
        }
    }

    final static String a(boolean param0, String param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ud var7 = null;
        ud var8 = null;
        bc var9 = null;
        CharSequence var10 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param1);
            if (!gi.a(param0, var10)) {
              stackIn_4_0 = uk.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ji.field_Tb ^ -1) == -3) {
                var8 = ke.a(param1, false);
                if (var8 != null) {
                  og.field_j.a((byte) -10, var8);
                  L1: while (true) {
                    var7 = (ud) ((Object) og.field_j.a((byte) -70));
                    if (var7 != null) {
                      var7.field_Rb = var7.field_Rb - 1;
                      continue L1;
                    } else {
                      var8.b(false);
                      var8.e(0);
                      qi.field_q = qi.field_q - 1;
                      var9 = nd.field_Lb;
                      var9.f(param2, (byte) -92);
                      var9.field_t = var9.field_t + 1;
                      var5 = var9.field_t;
                      var9.a(1, param0);
                      var9.a(param1, 0);
                      var9.b(-var5 + var9.field_t, -2);
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = sk.a(new String[]{param1}, sf.field_b, 127);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = te.field_Q;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("ma.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_16_0);
            }
          }
        }
    }

    final void a(byte param0, tb param1) {
        try {
            this.a(109);
            this.field_c = param1;
            this.field_i = this.field_c.field_f[this.field_j];
            this.field_h = this.field_c.field_l[this.field_j];
            if (param0 < 17) {
                this.field_i = -96;
            }
            this.field_k = -1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        this.field_j = 0;
        this.field_e = 0;
        if (param0 < 65) {
            return;
        }
        this.field_h = 0;
        this.field_i = 0;
    }

    final fc a(boolean param0, int param1, fc param2, boolean param3) {
        fc var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fc stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        fc stackIn_3_0;
        boolean stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        fc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = 77 / ((param1 - -78) / 40);
              stackIn_2_0 = (fc) (param2);

              stackIn_2_1 = param3;

              stackIn_2_2 = 0;

              if (param0) {
                stackIn_3_0 = (fc) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 0;
                break L1;
              } else {
                stackIn_3_0 = (fc) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 1;
                break L1;
              }
            }
            var5 = ((fc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, stackIn_3_3 != 0);
            var5.a(im.field_c, this.field_i, (f) null, -1, 0, 0, param0);
            stackIn_4_0 = (fc) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                  var3 = 84 / ((72 - param1) / 34);
                  param0.getAppletContext().showDocument(ai.a(var2, (byte) -119, param0), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("ma.D(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        int dupTemp$0 = 0;
        int var2;
        if (null != this.field_b) {
          if (0 <= this.field_k) {
            dupTemp$0 = this.field_a[this.field_k];
            this.field_a[this.field_k] = dupTemp$0 - 1;
            if (dupTemp$0 < 0) {
              var2 = this.field_k;
              this.a((byte) 64, this.field_b[this.field_k]);
              this.field_k = var2;
              this.field_b[this.field_k] = null;
              this.field_k = this.field_k + 1;
              if (this.field_b.length != this.field_k) {
                if (this.field_b[this.field_k] == null) {
                  this.field_k = -1;
                  if (this.field_c == null) {
                    return true;
                  } else {
                    this.field_h = this.field_h - 1;
                    if (this.field_h <= 0) {
                      return this.b(0);
                    } else {
                      var2 = -92 % ((param0 - -67) / 50);
                      return false;
                    }
                  }
                } else {
                  if (this.field_c == null) {
                    return true;
                  } else {
                    this.field_h = this.field_h - 1;
                    if (this.field_h <= 0) {
                      return this.b(0);
                    } else {
                      var2 = -92 % ((param0 - -67) / 50);
                      return false;
                    }
                  }
                }
              } else {
                L0: {
                  this.field_k = 0;
                  if (this.field_b[this.field_k] == null) {
                    this.field_k = -1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (this.field_c == null) {
                  return true;
                } else {
                  this.field_h = this.field_h - 1;
                  if (this.field_h <= 0) {
                    return this.b(0);
                  } else {
                    var2 = -92 % ((param0 - -67) / 50);
                    return false;
                  }
                }
              }
            } else {
              if (this.field_c == null) {
                return true;
              } else {
                this.field_h = this.field_h - 1;
                if (this.field_h <= 0) {
                  return this.b(0);
                } else {
                  var2 = -92 % ((param0 - -67) / 50);
                  return false;
                }
              }
            }
          } else {
            if (this.field_c == null) {
              return true;
            } else {
              this.field_h = this.field_h - 1;
              if (this.field_h <= 0) {
                return this.b(0);
              } else {
                var2 = -92 % ((param0 - -67) / 50);
                return false;
              }
            }
          }
        } else {
          if (this.field_c == null) {
            return true;
          } else {
            this.field_h = this.field_h - 1;
            if (this.field_h <= 0) {
              return this.b(0);
            } else {
              var2 = -92 % ((param0 - -67) / 50);
              return false;
            }
          }
        }
    }

    final static void c(int param0) {
        bb.field_d = new String[co.field_q];
        bb.field_d[19] = uk.field_v;
        bb.field_d[20] = ok.field_e;
        bb.field_d[4] = kf.field_b;
        bb.field_d[16] = rb.field_Lb;
        bb.field_d[15] = wd.field_a;
        bb.field_d[21] = em.field_a;
        bb.field_d[11] = gh.field_b;
        if (param0 != 24657) {
          return;
        } else {
          bb.field_d[9] = ha.field_f;
          bb.field_d[17] = pg.field_e;
          bb.field_d[6] = qf.field_e;
          bb.field_d[18] = gm.field_c;
          bb.field_d[13] = nm.field_p;
          bb.field_d[7] = rj.field_a;
          bb.field_d[5] = dj.field_d;
          return;
        }
    }

    static {
        field_f = 20;
        field_g = false;
    }
}
