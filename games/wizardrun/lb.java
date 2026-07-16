/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    private int field_a;
    static String[] field_f;
    private int[] field_d;
    private boolean field_b;
    private int field_c;

    final static int a(byte param0) {
        if (param0 != 47) {
            field_f = null;
            return fh.field_f;
        }
        return fh.field_f;
    }

    final static void a(int param0, int param1, int param2, o param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = wizardrun.field_H;
        var6 = (param0 - param1 << -1229508728) / param3.field_x;
        param4 = param4 + param3.field_v;
        var7 = param3.field_u * var6 + (param1 << 1434520104);
        param2 = param2 + param3.field_u;
        var8 = param2 - -(ed.field_h * param4);
        var9 = 0;
        if (param5 < -80) {
          L0: {
            var10 = param3.field_p;
            var11 = param3.field_z;
            var12 = ed.field_h + -var11;
            var13 = 0;
            if (ed.field_i > param4) {
              var14 = -param4 + ed.field_i;
              var9 = var9 + var14 * var11;
              param4 = ed.field_i;
              var10 = var10 - var14;
              var8 = var8 + var14 * ed.field_h;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ed.field_c > param2) {
              var14 = ed.field_c - param2;
              var7 = var7 + var6 * var14;
              var8 = var8 + var14;
              var9 = var9 + var14;
              var11 = var11 - var14;
              var12 = var12 + var14;
              param2 = ed.field_c;
              var13 = var13 + var14;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (ed.field_b >= var10 + param4) {
              break L2;
            } else {
              var10 = var10 - (param4 - -var10 - ed.field_b);
              break L2;
            }
          }
          L3: {
            if (ed.field_l >= param2 - -var11) {
              break L3;
            } else {
              var14 = -ed.field_l + var11 + param2;
              var11 = var11 - var14;
              var13 = var13 + var14;
              var12 = var12 + var14;
              break L3;
            }
          }
          if (0 < var11) {
            if (0 >= var10) {
              return;
            } else {
              param4 = -var10;
              L4: while (true) {
                if (-1 >= (param4 ^ -1)) {
                  return;
                } else {
                  var14 = var7;
                  param2 = -var11;
                  L5: while (true) {
                    if (0 <= param2) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param4++;
                      continue L4;
                    } else {
                      var15 = var14 >> -642764376;
                      var16 = 256 - var15;
                      var14 = var14 + var6;
                      if (-1 >= (var15 ^ -1)) {
                        int incrementValue$2 = var9;
                        var9++;
                        var17 = param3.field_B[incrementValue$2];
                        if (var17 != 0) {
                          if (var15 <= 255) {
                            var18 = ed.field_k[var8];
                            var19 = 16711935 & (16711935 & var17) * var15 + (16711935 & var18) * var16 >> -1754499640;
                            ed.field_k[var8] = (kl.b(16711838, kl.b(65280, var18) * var16 + var15 * kl.b(var17, 65280)) >> -324843128) + var19;
                            var8++;
                            param2++;
                            continue L5;
                          } else {
                            ed.field_k[var8] = var17;
                            var8++;
                            param2++;
                            continue L5;
                          }
                        } else {
                          var8++;
                          param2++;
                          continue L5;
                        }
                      } else {
                        var9++;
                        var8++;
                        param2++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          L6: {
            field_f = null;
            var10 = param3.field_p;
            var11 = param3.field_z;
            var12 = ed.field_h + -var11;
            var13 = 0;
            if (ed.field_i > param4) {
              var14 = -param4 + ed.field_i;
              var9 = var9 + var14 * var11;
              param4 = ed.field_i;
              var10 = var10 - var14;
              var8 = var8 + var14 * ed.field_h;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (ed.field_c > param2) {
              var14 = ed.field_c - param2;
              var7 = var7 + var6 * var14;
              var8 = var8 + var14;
              var9 = var9 + var14;
              var11 = var11 - var14;
              var12 = var12 + var14;
              param2 = ed.field_c;
              var13 = var13 + var14;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (ed.field_b >= var10 + param4) {
              break L8;
            } else {
              var10 = var10 - (param4 - -var10 - ed.field_b);
              break L8;
            }
          }
          L9: {
            if (ed.field_l >= param2 - -var11) {
              break L9;
            } else {
              var14 = -ed.field_l + var11 + param2;
              var11 = var11 - var14;
              var13 = var13 + var14;
              var12 = var12 + var14;
              break L9;
            }
          }
          if (0 < var11) {
            if (0 >= var10) {
              return;
            } else {
              param4 = -var10;
              L10: while (true) {
                if (-1 >= (param4 ^ -1)) {
                  return;
                } else {
                  var14 = var7;
                  param2 = -var11;
                  L11: while (true) {
                    if (0 <= param2) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param4++;
                      continue L10;
                    } else {
                      var15 = var14 >> -642764376;
                      var16 = 256 - var15;
                      var14 = var14 + var6;
                      if (-1 >= (var15 ^ -1)) {
                        int incrementValue$3 = var9;
                        var9++;
                        var17 = param3.field_B[incrementValue$3];
                        if (var17 != 0) {
                          if (var15 <= 255) {
                            var18 = ed.field_k[var8];
                            var19 = 16711935 & (16711935 & var17) * var15 + (16711935 & var18) * var16 >> -1754499640;
                            ed.field_k[var8] = (kl.b(16711838, kl.b(65280, var18) * var16 + var15 * kl.b(var17, 65280)) >> -324843128) + var19;
                            var8++;
                            param2++;
                            continue L11;
                          } else {
                            ed.field_k[var8] = var17;
                            var8++;
                            param2++;
                            continue L11;
                          }
                        } else {
                          var8++;
                          param2++;
                          continue L11;
                        }
                      } else {
                        var9++;
                        var8++;
                        param2++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final int a(int param0) {
        int var2 = 46 / ((-57 - param0) / 42);
        return 1 + ((lb) this).field_a;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param2 <= ((lb) this).field_a) {
          if (param0 <= 100) {
            return;
          } else {
            L0: {
              if (param2 >= ((lb) this).field_d.length) {
                this.c(param2, 65);
                break L0;
              } else {
                break L0;
              }
            }
            ((lb) this).field_d[param2] = param1;
            return;
          }
        } else {
          ((lb) this).field_a = param2;
          if (param0 <= 100) {
            return;
          } else {
            L1: {
              if (param2 >= ((lb) this).field_d.length) {
                this.c(param2, 65);
                break L1;
              } else {
                break L1;
              }
            }
            ((lb) this).field_d[param2] = param1;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != 55) {
            field_f = null;
        }
    }

    final void e(int param0, int param1) {
        if (param0 != 16711838) {
          ((lb) this).field_d = null;
          this.a((byte) 103, param1, 1 + ((lb) this).field_a);
          return;
        } else {
          this.a((byte) 103, param1, 1 + ((lb) this).field_a);
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = wizardrun.field_H;
        if (param1 != 0) {
          var5 = null;
          lb.a(54, (java.applet.Applet) null);
          var3 = ((lb) this).field_d.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((lb) this).field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((lb) this).field_c;
                  continue L0;
                }
              } else {
                var3 = var3 + ((lb) this).field_c;
                continue L0;
              }
            }
          }
        } else {
          var3 = ((lb) this).field_d.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((lb) this).field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((lb) this).field_c;
                  continue L1;
                }
              } else {
                var3 = var3 + ((lb) this).field_c;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
            if (param0 < 16) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(jl.a(-119, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (((lb) this).field_a >= param1) {
            if (((lb) this).field_a != param1) {
              g.a(((lb) this).field_d, param1 - -1, ((lb) this).field_d, param1, -param1 + ((lb) this).field_a);
              ((lb) this).field_a = ((lb) this).field_a - 1;
              return;
            } else {
              ((lb) this).field_a = ((lb) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final void c(int param0, int param1) {
        int[] var5 = new int[this.b(param0, 0)];
        int[] var3 = var5;
        g.a(((lb) this).field_d, 0, var5, 0, ((lb) this).field_d.length);
        int var4 = 80 % ((1 - param1) / 41);
        ((lb) this).field_d = var5;
    }

    private lb() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 > -60) {
            Object var4 = null;
            lb.a(-122, (java.applet.Applet) null);
            if (!(((lb) this).field_a >= param1)) {
                throw new ArrayIndexOutOfBoundsException(param1);
            }
            return ((lb) this).field_d[param1];
        }
        if (!(((lb) this).field_a >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((lb) this).field_d[param1];
    }

    static {
    }
}
