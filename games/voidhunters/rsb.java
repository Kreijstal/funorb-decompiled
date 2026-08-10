/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsb extends tja implements ntb, utb {
    lbb field_e;
    tr field_f;
    pe field_g;
    nwa field_d;

    public final void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        faa stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              super.b(param0, -128);
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = -90;

              if (this.field_g == null) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                this.field_g.b(param0, -113);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              stackIn_8_0 = (faa) (param0);

              stackIn_8_1 = 46;

              if (null == this.field_f) {
                stackIn_9_0 = (faa) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = 0;
                break L3;
              } else {
                stackIn_9_0 = (faa) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = 1;
                break L3;
              }
            }
            L4: {
              if (vq.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 != 0)) {
                this.field_f.b(param0, -128);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              stackIn_14_0 = (faa) (param0);

              stackIn_14_1 = 62;

              if (null == this.field_e) {
                stackIn_15_0 = (faa) ((Object) stackIn_14_0);
                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = 0;
                break L5;
              } else {
                stackIn_15_0 = (faa) ((Object) stackIn_14_0);
                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = 1;
                break L5;
              }
            }
            L6: {
              if (!vq.a(stackIn_15_0, stackIn_15_1, stackIn_15_2 != 0)) {
                break L6;
              } else {
                this.field_e.b(param0, -110);
                break L6;
              }
            }
            L7: {
              if (param1 <= -109) {
                break L7;
              } else {
                this.field_g = (pe) null;
                break L7;
              }
            }
            L8: {
              stackIn_21_0 = (faa) (param0);

              stackIn_21_1 = -93;

              if (this.field_d == null) {
                stackIn_22_0 = (faa) ((Object) stackIn_21_0);
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = 0;
                break L8;
              } else {
                stackIn_22_0 = (faa) ((Object) stackIn_21_0);
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = 1;
                break L8;
              }
            }
            L9: {
              if (vq.a(stackIn_22_0, stackIn_22_1, stackIn_22_2 != 0)) {
                this.field_d.b(param0, -125);
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("rsb.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_28_0 = 0;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        var7 = VoidHunters.field_G;
        if (-1 < (param0 ^ -1)) {
          return false;
        } else {
          if (param0 <= 1) {
            var10 = new int[2];
            var9 = var10;
            var8 = var9;
            var4 = var8;
            var5 = 0;
            L0: while (true) {
              if (var5 >= this.field_c.length) {
                L1: {
                  var10 = var9;
                  var10 = var9;
                  if (param2 < param1) {
                    break L1;
                  } else {
                    if (param2 < var10.length) {
                      var8[param2] = var8[param2] - 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5 = 2147483647;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var10.length) {
                    L3: {
                      if (var5 >= var10[param0]) {
                        stackIn_28_0 = 1;
                        break L3;
                      } else {
                        stackIn_28_0 = 0;
                        break L3;
                      }
                    }
                    var6 = stackIn_28_0;
                    return var6 != 0;
                  } else {
                    if (var5 > var10[var6]) {
                      var5 = var10[var6];
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                L4: {
                  if (this.field_c[var5].field_a) {
                    break L4;
                  } else {
                    if (-2 == (foa.field_p ^ -1)) {
                      break L4;
                    } else {
                      var5++;
                      continue L0;
                    }
                  }
                }
                var10 = var9;
                var6 = ((tfa) ((Object) this.field_c[var5])).field_h;
                if (0 <= var6) {
                  if (var10.length > var6) {
                    var8[var6] = var8[var6] + 1;
                    var5++;
                    continue L0;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (!kv.a(false, param0)) {
                this.field_g = null;
                break L1;
              } else {
                L2: {
                  if (this.field_g != null) {
                    break L2;
                  } else {
                    this.field_g = new pe();
                    break L2;
                  }
                }
                this.field_g.a(param0, false);
                break L1;
              }
            }
            L3: {
              if (kv.a(param1, param0)) {
                L4: {
                  if (null == this.field_f) {
                    this.field_f = new tr();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_f.a(param0, param1);
                break L3;
              } else {
                this.field_f = null;
                break L3;
              }
            }
            L5: {
              if (!kv.a(param1, param0)) {
                this.field_e = null;
                break L5;
              } else {
                L6: {
                  if (this.field_e == null) {
                    this.field_e = new lbb();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_e.a(param0, false);
                break L5;
              }
            }
            L7: {
              if (kv.a(false, param0)) {
                L8: {
                  if (this.field_d == null) {
                    this.field_d = new nwa();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.field_d.a(param0, false);
                break L7;
              } else {
                this.field_d = null;
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("rsb.H(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(param0, 122);
        if (param1 <= 93) {
            faa var4 = (faa) null;
            this.a((faa) null, -44);
        }
        this.field_g = new pe(param0);
        this.field_f = new tr();
        this.field_e = new lbb();
        this.field_d = new nwa();
    }

    final tfa a(int param0, byte param1) {
        if (param1 != 59) {
            tv var4 = (tv) null;
            this.a((tv) null, -70);
        }
        if (param0 < 0) {
            return null;
        }
        if (param0 >= this.field_c.length) {
            return null;
        }
        return (tfa) ((Object) this.field_c[param0]);
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        rsb var6 = null;
        rsb var7 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.b((byte) 115, param1);
              var6 = (rsb) ((Object) param1);
              var7 = var6;
              if (null != this.field_g) {
                L2: {
                  if (null == var7.field_g) {
                    var7.field_g = new pe();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_g.b((byte) 125, var7.field_g);
                break L1;
              } else {
                var6.field_g = null;
                break L1;
              }
            }
            L3: {
              if (this.field_f != null) {
                L4: {
                  if (var7.field_f == null) {
                    var7.field_f = new tr();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_f.b((byte) 96, var7.field_f);
                break L3;
              } else {
                var7.field_f = null;
                break L3;
              }
            }
            L5: {
              if (param0 > 54) {
                break L5;
              } else {
                var5 = (faa) null;
                this.b((faa) null, 64);
                break L5;
              }
            }
            L6: {
              if (null != this.field_e) {
                L7: {
                  if (null != var7.field_e) {
                    break L7;
                  } else {
                    var7.field_e = new lbb();
                    break L7;
                  }
                }
                this.field_e.b((byte) 91, var7.field_e);
                break L6;
              } else {
                var7.field_e = null;
                break L6;
              }
            }
            L8: {
              if (this.field_d == null) {
                var7.field_d = null;
                break L8;
              } else {
                L9: {
                  if (null == var7.field_d) {
                    var7.field_d = new nwa();
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_d.b((byte) 87, var7.field_d);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("rsb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        rsb var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -68);
              var5 = (rsb) ((Object) param0);
              if (this.field_g == null) {
                break L1;
              } else {
                if (null == var5.field_g) {
                  break L1;
                } else {
                  this.field_g.a(var5.field_g, -97);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_f == null) {
                break L2;
              } else {
                if (var5.field_f != null) {
                  this.field_f.a(var5.field_f, -89);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (null == this.field_e) {
                break L3;
              } else {
                if (null != var5.field_e) {
                  this.field_e.a(var5.field_e, -88);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == this.field_d) {
                break L4;
              } else {
                if (null != var5.field_d) {
                  this.field_d.a(var5.field_d, -64);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var4 = 0;
              if (null != var5.field_g) {
                stackIn_18_0 = 0;
                break L5;
              } else {
                stackIn_18_0 = 1;
                break L5;
              }
            }
            L6: {


              if (null != this.field_g) {

                stackIn_21_1 = 0;
                break L6;
              } else {

                stackIn_21_1 = 1;
                break L6;
              }
            }
            L7: {
              L8: {
                if ((stackIn_18_0 ^ stackIn_21_1) != 0) {
                  break L8;
                } else {
                  if (this.field_g == null) {
                    break L7;
                  } else {
                    if (this.field_g.a((byte) 81, var5.field_g)) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              System.out.println("World world has changed. before=" + var5.field_g + ", now=" + this.field_g);
              var4 = 1;
              break L7;
            }
            L9: {
              if (null != var5.field_f) {
                stackIn_29_0 = 0;
                break L9;
              } else {
                stackIn_29_0 = 1;
                break L9;
              }
            }
            L10: {


              if (this.field_f != null) {

                stackIn_32_1 = 0;
                break L10;
              } else {

                stackIn_32_1 = 1;
                break L10;
              }
            }
            L11: {
              L12: {
                if ((stackIn_29_0 ^ stackIn_32_1) != 0) {
                  break L12;
                } else {
                  if (null == this.field_f) {
                    break L11;
                  } else {
                    if (this.field_f.a((byte) -103, var5.field_f)) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              System.out.println("SettingsInstance settings has changed. before=" + var5.field_f + ", now=" + this.field_f);
              var4 = 1;
              break L11;
            }
            L13: {
              if (this.field_e != null) {
                stackIn_40_0 = 0;
                break L13;
              } else {
                stackIn_40_0 = 1;
                break L13;
              }
            }
            L14: {


              if (null != var5.field_e) {

                stackIn_43_1 = 0;
                break L14;
              } else {

                stackIn_43_1 = 1;
                break L14;
              }
            }
            L15: {
              L16: {
                if ((stackIn_40_0 ^ stackIn_43_1) != 0) {
                  break L16;
                } else {
                  if (null == this.field_e) {
                    break L15;
                  } else {
                    if (!this.field_e.a((byte) -88, var5.field_e)) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("MissionState mission_state has changed. before=" + var5.field_e + ", now=" + this.field_e);
              break L15;
            }
            if (param1 < -19) {
              L17: {
                if (null != this.field_d) {
                  stackIn_53_0 = 0;
                  break L17;
                } else {
                  stackIn_53_0 = 1;
                  break L17;
                }
              }
              L18: {


                if (var5.field_d != null) {

                  stackIn_56_1 = 0;
                  break L18;
                } else {

                  stackIn_56_1 = 1;
                  break L18;
                }
              }
              L19: {
                L20: {
                  if ((stackIn_53_0 ^ stackIn_56_1) != 0) {
                    break L20;
                  } else {
                    if (null == this.field_d) {
                      break L19;
                    } else {
                      if (this.field_d.a((byte) -115, var5.field_d)) {
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                var4 = 1;
                System.out.println("MessageLog message_log has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L19;
              }
              L21: {
                if (var4 != 0) {
                  System.out.println("This instance of MyCarouselSlot has changed");
                  break L21;
                } else {
                  break L21;
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
          L22: {
            var3 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var3);

            stackIn_67_1 = new StringBuilder().append("rsb.F(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L22;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L22;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(tja param0, int param1, int param2, boolean param3) {
        tfa var6 = null;
        int var8 = 0;
        int var5_int = 0;
        int var7 = VoidHunters.field_G;
        try {
            ka.a(param1, param2 ^ -19265);
            this.field_f.a((byte) 125);
            this.field_g.a(1799937864, param3, this.field_d, (tfa[]) ((Object) param0.field_c), this.field_e, param1, (tfa[]) ((Object) this.field_c));
            this.field_e.a((rsb) (this), param1, (byte) -19);
            if (!(param2 != fra.field_a)) {
                for (var5_int = 0; this.field_c.length > var5_int; var5_int++) {
                    var6 = (tfa) ((Object) this.field_c[var5_int]);
                    var6.field_f = -17 & var6.field_f;
                }
            }
            if (null != this.field_c) {
                var8 = 0;
                var5_int = var8;
                while (this.field_c.length > var8) {
                    if (!(this.field_c[var8] == null)) {
                        ((tfa) ((Object) this.field_c[var8])).c((byte) 11);
                    }
                    var8++;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rsb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(faa param0, int param1) {
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            super.a(param0, false);
            if (param1 == 32) {
              L1: {
                if (kv.a(false, param0)) {
                  L2: {
                    if (null != this.field_g) {
                      break L2;
                    } else {
                      this.field_g = new pe();
                      break L2;
                    }
                  }
                  this.field_g.a(param0, 32);
                  break L1;
                } else {
                  this.field_g = null;
                  break L1;
                }
              }
              L3: {
                if (!kv.a(false, param0)) {
                  this.field_f = null;
                  break L3;
                } else {
                  L4: {
                    if (null != this.field_f) {
                      break L4;
                    } else {
                      this.field_f = new tr();
                      break L4;
                    }
                  }
                  this.field_f.a(param0, false);
                  break L3;
                }
              }
              L5: {
                if (!kv.a(false, param0)) {
                  this.field_e = null;
                  break L5;
                } else {
                  L6: {
                    if (this.field_e == null) {
                      this.field_e = new lbb();
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_e.a(param0, false);
                  break L5;
                }
              }
              L7: {
                if (kv.a(false, param0)) {
                  L8: {
                    if (this.field_d != null) {
                      break L8;
                    } else {
                      this.field_d = new nwa();
                      break L8;
                    }
                  }
                  this.field_d.a(param0, false);
                  break L7;
                } else {
                  this.field_d = null;
                  break L7;
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
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("rsb.L(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        faa stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              super.b(param0, -118);
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = -121;

              if (this.field_g == null) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                this.field_g.a(param0, (byte) -126);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 < -91) {
              L3: {
                stackIn_10_0 = (faa) (param0);

                stackIn_10_1 = -53;

                if (null == this.field_f) {
                  stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 1;
                  break L3;
                }
              }
              L4: {
                if (!vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                  break L4;
                } else {
                  this.field_f.b(param0, -127);
                  break L4;
                }
              }
              L5: {
                stackIn_15_0 = (faa) (param0);

                stackIn_15_1 = -88;

                if (this.field_e == null) {
                  stackIn_16_0 = (faa) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 0;
                  break L5;
                } else {
                  stackIn_16_0 = (faa) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 1;
                  break L5;
                }
              }
              L6: {
                if (!vq.a(stackIn_16_0, stackIn_16_1, stackIn_16_2 != 0)) {
                  break L6;
                } else {
                  this.field_e.b(param0, -127);
                  break L6;
                }
              }
              L7: {
                stackIn_20_0 = (faa) (param0);

                stackIn_20_1 = 91;

                if (this.field_d == null) {
                  stackIn_21_0 = (faa) ((Object) stackIn_20_0);
                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 0;
                  break L7;
                } else {
                  stackIn_21_0 = (faa) ((Object) stackIn_20_0);
                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 1;
                  break L7;
                }
              }
              L8: {
                if (!vq.a(stackIn_21_0, stackIn_21_1, stackIn_21_2 != 0)) {
                  break L8;
                } else {
                  this.field_d.b(param0, -125);
                  break L8;
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
          L9: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("rsb.E(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        rsb var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -114 / ((param0 - 22) / 59);
                var5 = (rsb) ((Object) param1);
                if (super.a((byte) -123, param1)) {
                  break L2;
                } else {
                  L3: {
                    if (var5.field_g != null) {
                      stackIn_4_0 = 0;
                      break L3;
                    } else {
                      stackIn_4_0 = 1;
                      break L3;
                    }
                  }
                  L4: {


                    if (this.field_g != null) {

                      stackIn_7_1 = 0;
                      break L4;
                    } else {

                      stackIn_7_1 = 1;
                      break L4;
                    }
                  }
                  if ((stackIn_4_0 ^ stackIn_7_1) != 0) {
                    break L2;
                  } else {
                    L5: {
                      if (null == this.field_g) {
                        break L5;
                      } else {
                        if (this.field_g.a((byte) -127, var5.field_g)) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_f != null) {
                        stackIn_14_0 = 0;
                        break L6;
                      } else {
                        stackIn_14_0 = 1;
                        break L6;
                      }
                    }
                    L7: {


                      if (null != var5.field_f) {

                        stackIn_17_1 = 0;
                        break L7;
                      } else {

                        stackIn_17_1 = 1;
                        break L7;
                      }
                    }
                    if ((stackIn_14_0 ^ stackIn_17_1) != 0) {
                      break L2;
                    } else {
                      L8: {
                        if (this.field_f == null) {
                          break L8;
                        } else {
                          if (this.field_f.a((byte) 87, var5.field_f)) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (this.field_e != null) {
                          stackIn_24_0 = 0;
                          break L9;
                        } else {
                          stackIn_24_0 = 1;
                          break L9;
                        }
                      }
                      L10: {


                        if (null != var5.field_e) {

                          stackIn_27_1 = 0;
                          break L10;
                        } else {

                          stackIn_27_1 = 1;
                          break L10;
                        }
                      }
                      if ((stackIn_24_0 ^ stackIn_27_1) != 0) {
                        break L2;
                      } else {
                        L11: {
                          if (null == this.field_e) {
                            break L11;
                          } else {
                            if (this.field_e.a((byte) 90, var5.field_e)) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (null != this.field_d) {
                            stackIn_34_0 = 0;
                            break L12;
                          } else {
                            stackIn_34_0 = 1;
                            break L12;
                          }
                        }
                        L13: {


                          if (var5.field_d != null) {

                            stackIn_37_1 = 0;
                            break L13;
                          } else {

                            stackIn_37_1 = 1;
                            break L13;
                          }
                        }
                        if ((stackIn_34_0 ^ stackIn_37_1) != 0) {
                          break L2;
                        } else {
                          L14: {
                            if (this.field_d == null) {
                              break L14;
                            } else {
                              if (!this.field_d.a((byte) 124, var5.field_d)) {
                                break L14;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_43_0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_43_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var3);

            stackIn_46_1 = new StringBuilder().append("rsb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L15;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L15;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_43_0 != 0;
    }

    rsb() {
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        tfa var4 = null;
        int var5 = VoidHunters.field_G;
        for (var3 = 0; this.field_c.length > var3; var3++) {
            var4 = (tfa) ((Object) this.field_c[var3]);
            var4.field_b = -1;
        }
        if (param0) {
            this.field_e = (lbb) null;
        }
        this.field_d.a(81, param1);
    }

    static {
    }
}
