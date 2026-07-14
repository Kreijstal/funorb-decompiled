/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsb extends tja implements ntb, utb {
    lbb field_e;
    tr field_f;
    pe field_g;
    nwa field_d;

    public final void b(faa param0, int param1) {
        super.b(param0, -128);
        if (!(vq.a(param0, -90, ((rsb) this).field_g == null ? true : false))) {
            ((rsb) this).field_g.b(param0, -113);
        }
        if (!(vq.a(param0, 46, null == ((rsb) this).field_f ? true : false))) {
            ((rsb) this).field_f.b(param0, -128);
        }
        if (vq.a(param0, 62, null != ((rsb) this).field_e ? true : false)) {
            ((rsb) this).field_e.b(param0, -110);
        }
        if (param1 > -109) {
            ((rsb) this).field_g = null;
        }
        if (!(vq.a(param0, -93, ((rsb) this).field_d == null ? true : false))) {
            ((rsb) this).field_d.b(param0, -125);
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var7 = VoidHunters.field_G;
        if (-1 < (param0 ^ -1)) {
          return false;
        } else {
          if (param0 <= 1) {
            var12 = new int[2];
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var4 = var8;
            var5 = 0;
            L0: while (true) {
              if ((var5 ^ -1) <= (((rsb) this).field_c.length ^ -1)) {
                L1: {
                  if (param2 < param1) {
                    break L1;
                  } else {
                    if (param2 < var12.length) {
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
                  if ((var6 ^ -1) <= (var12.length ^ -1)) {
                    L3: {
                      if ((var5 ^ -1) > (var12[param0] ^ -1)) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L3;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L3;
                      }
                    }
                    var6 = stackIn_27_0;
                    return var6 != 0;
                  } else {
                    L4: {
                      if (var5 > var12[var6]) {
                        var5 = var12[var6];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  L6: {
                    if (((rsb) this).field_c[var5].field_a) {
                      break L6;
                    } else {
                      if (-2 == (foa.field_p ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6 = ((tfa) (Object) ((rsb) this).field_c[var5]).field_h;
                  if (0 > var6) {
                    break L5;
                  } else {
                    if ((var12.length ^ -1) < (var6 ^ -1)) {
                      var8[var6] = var8[var6] + 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5++;
                continue L0;
              }
            }
          } else {
            return false;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4 = VoidHunters.field_G;
        super.a(param0, param1);
        if (kv.a(false, param0)) {
            if (((rsb) this).field_g == null) {
                ((rsb) this).field_g = new pe();
            }
            ((rsb) this).field_g.a(param0, false);
        } else {
            ((rsb) this).field_g = null;
        }
        if (!kv.a(param1, param0)) {
            ((rsb) this).field_f = null;
        } else {
            if (!(null != ((rsb) this).field_f)) {
                ((rsb) this).field_f = new tr();
            }
            ((rsb) this).field_f.a(param0, param1);
        }
        if (kv.a(param1, param0)) {
            if (!(((rsb) this).field_e != null)) {
                ((rsb) this).field_e = new lbb();
            }
            ((rsb) this).field_e.a(param0, false);
        } else {
            ((rsb) this).field_e = null;
        }
        if (!kv.a(false, param0)) {
            ((rsb) this).field_d = null;
        } else {
            if (!(((rsb) this).field_d != null)) {
                ((rsb) this).field_d = new nwa();
            }
            ((rsb) this).field_d.a(param0, false);
        }
    }

    final void a(int param0, int param1) {
        super.a(param0, 122);
        if (param1 <= 93) {
            Object var4 = null;
            ((rsb) this).a((faa) null, -44);
        }
        ((rsb) this).field_g = new pe(param0);
        ((rsb) this).field_f = new tr();
        ((rsb) this).field_e = new lbb();
        ((rsb) this).field_d = new nwa();
    }

    final tfa a(int param0, byte param1) {
        if (param1 != 59) {
            Object var4 = null;
            ((rsb) this).a((tv) null, -70);
        }
        if (param0 < 0) {
            return null;
        }
        if (param0 >= ((rsb) this).field_c.length) {
            return null;
        }
        return (tfa) (Object) ((rsb) this).field_c[param0];
    }

    public final void b(byte param0, tv param1) {
        int var4 = VoidHunters.field_G;
        super.b((byte) 115, param1);
        rsb var6 = (rsb) (Object) param1;
        rsb var7 = var6;
        if (null == var6.field_g) {
            var6.field_g = null;
        } else {
            if (!(null != var7.field_g)) {
                var7.field_g = new pe();
            }
            var6.field_g.b((byte) 125, (tv) (Object) var7.field_g);
        }
        if (var6.field_f == null) {
            var7.field_f = null;
        } else {
            if (!(var7.field_f != null)) {
                var7.field_f = new tr();
            }
            var6.field_f.b((byte) 96, (tv) (Object) var7.field_f);
        }
        if (param0 <= 54) {
            Object var5 = null;
            ((rsb) this).b((faa) null, 64);
        }
        if (null == var6.field_e) {
            var7.field_e = null;
        } else {
            if (null == var7.field_e) {
                var7.field_e = new lbb();
            }
            var6.field_e.b((byte) 91, (tv) (Object) var7.field_e);
        }
        if (var6.field_d != null) {
            if (!(null != var7.field_d)) {
                var7.field_d = new nwa();
            }
            var6.field_d.b((byte) 87, (tv) (Object) var7.field_d);
        } else {
            var7.field_d = null;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        rsb var5 = null;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        L0: {
          super.a(param0, -68);
          var5 = (rsb) (Object) param0;
          if (var5.field_g == null) {
            break L0;
          } else {
            if (null == var5.field_g) {
              break L0;
            } else {
              var5.field_g.a((tv) (Object) var5.field_g, -97);
              break L0;
            }
          }
        }
        L1: {
          if (var5.field_f == null) {
            break L1;
          } else {
            if (var5.field_f != null) {
              var5.field_f.a((tv) (Object) var5.field_f, -89);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (null == var5.field_e) {
            break L2;
          } else {
            if (null != var5.field_e) {
              var5.field_e.a((tv) (Object) var5.field_e, -88);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == var5.field_d) {
            break L3;
          } else {
            if (null != var5.field_d) {
              var5.field_d.a((tv) (Object) var5.field_d, -64);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          var4 = 0;
          if (null != var5.field_g) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L4;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L4;
          }
        }
        L5: {
          stackOut_18_0 = stackIn_18_0;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (null != var5.field_g) {
            stackOut_20_0 = stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L5;
          } else {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L5;
          }
        }
        L6: {
          L7: {
            if ((stackIn_21_0 ^ stackIn_21_1) != 0) {
              break L7;
            } else {
              if (var5.field_g == null) {
                break L6;
              } else {
                if (var5.field_g.a((byte) 81, (tv) (Object) var5.field_g)) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
          }
          System.out.println("World world has changed. before=" + var5.field_g + ", now=" + var5.field_g);
          var4 = 1;
          break L6;
        }
        L8: {
          if (null != var5.field_f) {
            stackOut_28_0 = 0;
            stackIn_29_0 = stackOut_28_0;
            break L8;
          } else {
            stackOut_27_0 = 1;
            stackIn_29_0 = stackOut_27_0;
            break L8;
          }
        }
        L9: {
          stackOut_29_0 = stackIn_29_0;
          stackIn_31_0 = stackOut_29_0;
          stackIn_30_0 = stackOut_29_0;
          if (var5.field_f != null) {
            stackOut_31_0 = stackIn_31_0;
            stackOut_31_1 = 0;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            break L9;
          } else {
            stackOut_30_0 = stackIn_30_0;
            stackOut_30_1 = 1;
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            break L9;
          }
        }
        L10: {
          L11: {
            if ((stackIn_32_0 ^ stackIn_32_1) != 0) {
              break L11;
            } else {
              if (null == var5.field_f) {
                break L10;
              } else {
                if (var5.field_f.a((byte) -103, (tv) (Object) var5.field_f)) {
                  break L11;
                } else {
                  break L10;
                }
              }
            }
          }
          System.out.println("SettingsInstance settings has changed. before=" + var5.field_f + ", now=" + var5.field_f);
          var4 = 1;
          break L10;
        }
        L12: {
          if (var5.field_e != null) {
            stackOut_39_0 = 0;
            stackIn_40_0 = stackOut_39_0;
            break L12;
          } else {
            stackOut_38_0 = 1;
            stackIn_40_0 = stackOut_38_0;
            break L12;
          }
        }
        L13: {
          stackOut_40_0 = stackIn_40_0;
          stackIn_42_0 = stackOut_40_0;
          stackIn_41_0 = stackOut_40_0;
          if (null != var5.field_e) {
            stackOut_42_0 = stackIn_42_0;
            stackOut_42_1 = 0;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            break L13;
          } else {
            stackOut_41_0 = stackIn_41_0;
            stackOut_41_1 = 1;
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            break L13;
          }
        }
        L14: {
          L15: {
            if ((stackIn_43_0 ^ stackIn_43_1) != 0) {
              break L15;
            } else {
              if (null == var5.field_e) {
                break L14;
              } else {
                if (!var5.field_e.a((byte) -88, (tv) (Object) var5.field_e)) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
          }
          var4 = 1;
          System.out.println("MissionState mission_state has changed. before=" + var5.field_e + ", now=" + var5.field_e);
          break L14;
        }
        if (param1 < -19) {
          L16: {
            if (null != var5.field_d) {
              stackOut_52_0 = 0;
              stackIn_53_0 = stackOut_52_0;
              break L16;
            } else {
              stackOut_51_0 = 1;
              stackIn_53_0 = stackOut_51_0;
              break L16;
            }
          }
          L17: {
            stackOut_53_0 = stackIn_53_0;
            stackIn_55_0 = stackOut_53_0;
            stackIn_54_0 = stackOut_53_0;
            if (var5.field_d != null) {
              stackOut_55_0 = stackIn_55_0;
              stackOut_55_1 = 0;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              break L17;
            } else {
              stackOut_54_0 = stackIn_54_0;
              stackOut_54_1 = 1;
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              break L17;
            }
          }
          L18: {
            L19: {
              if ((stackIn_56_0 ^ stackIn_56_1) != 0) {
                break L19;
              } else {
                if (null == var5.field_d) {
                  break L18;
                } else {
                  if (var5.field_d.a((byte) -115, (tv) (Object) var5.field_d)) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
            }
            var4 = 1;
            System.out.println("MessageLog message_log has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L18;
          }
          L20: {
            if (var4 != 0) {
              System.out.println("This instance of MyCarouselSlot has changed");
              break L20;
            } else {
              break L20;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(tja param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        tfa var6 = null;
        int var8 = 0;
        int var7 = VoidHunters.field_G;
        ka.a(param1, param2 ^ -19265);
        ((rsb) this).field_f.a((byte) 125);
        ((rsb) this).field_g.a(1799937864, param3, ((rsb) this).field_d, (tfa[]) (Object) param0.field_c, ((rsb) this).field_e, param1, (tfa[]) (Object) ((rsb) this).field_c);
        ((rsb) this).field_e.a((rsb) this, param1, (byte) -19);
        if (!(param2 != fra.field_a)) {
            for (var5 = 0; (((rsb) this).field_c.length ^ -1) < (var5 ^ -1); var5++) {
                var6 = (tfa) (Object) ((rsb) this).field_c[var5];
                var6.field_f = -17 & var6.field_f;
            }
        }
        if (null != ((rsb) this).field_c) {
            var8 = 0;
            var5 = var8;
            while (((rsb) this).field_c.length > var8) {
                if (!(((rsb) this).field_c[var8] == null)) {
                    ((tfa) (Object) ((rsb) this).field_c[var8]).c((byte) 11);
                }
                var8++;
            }
        }
    }

    public final void a(faa param0, int param1) {
        int var4 = VoidHunters.field_G;
        super.a(param0, false);
        if (param1 != 32) {
            return;
        }
        if (!kv.a(false, param0)) {
            ((rsb) this).field_g = null;
        } else {
            if (null == ((rsb) this).field_g) {
                ((rsb) this).field_g = new pe();
            }
            ((rsb) this).field_g.a(param0, 32);
        }
        if (kv.a(false, param0)) {
            if (null == ((rsb) this).field_f) {
                ((rsb) this).field_f = new tr();
            }
            ((rsb) this).field_f.a(param0, false);
        } else {
            ((rsb) this).field_f = null;
        }
        if (kv.a(false, param0)) {
            if (!(((rsb) this).field_e != null)) {
                ((rsb) this).field_e = new lbb();
            }
            ((rsb) this).field_e.a(param0, false);
        } else {
            ((rsb) this).field_e = null;
        }
        if (!kv.a(false, param0)) {
            ((rsb) this).field_d = null;
        } else {
            if (((rsb) this).field_d == null) {
                ((rsb) this).field_d = new nwa();
            }
            ((rsb) this).field_d.a(param0, false);
        }
    }

    public final void a(faa param0, byte param1) {
        super.b(param0, -118);
        if (!(vq.a(param0, -121, ((rsb) this).field_g == null ? true : false))) {
            ((rsb) this).field_g.a(param0, (byte) -126);
        }
        if (param1 >= -91) {
            return;
        }
        if (vq.a(param0, -53, null != ((rsb) this).field_f ? true : false)) {
            ((rsb) this).field_f.b(param0, -127);
        }
        if (vq.a(param0, -88, ((rsb) this).field_e != null ? true : false)) {
            ((rsb) this).field_e.b(param0, -127);
        }
        if (vq.a(param0, 91, ((rsb) this).field_d != null ? true : false)) {
            ((rsb) this).field_d.b(param0, -125);
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 0;
        rsb var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_43_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          L1: {
            var4 = -114 / ((param0 - 22) / 59);
            var5 = (rsb) (Object) param1;
            if (super.a((byte) -123, param1)) {
              break L1;
            } else {
              L2: {
                if (var5.field_g != null) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              L3: {
                stackOut_4_0 = stackIn_4_0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((rsb) this).field_g != null) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              if ((stackIn_7_0 ^ stackIn_7_1) != 0) {
                break L1;
              } else {
                L4: {
                  if (null == ((rsb) this).field_g) {
                    break L4;
                  } else {
                    if (((rsb) this).field_g.a((byte) -127, (tv) (Object) var5.field_g)) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((rsb) this).field_f != null) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  stackOut_14_0 = stackIn_14_0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (null != var5.field_f) {
                    stackOut_16_0 = stackIn_16_0;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L6;
                  } else {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L6;
                  }
                }
                if ((stackIn_17_0 ^ stackIn_17_1) != 0) {
                  break L1;
                } else {
                  L7: {
                    if (((rsb) this).field_f == null) {
                      break L7;
                    } else {
                      if (((rsb) this).field_f.a((byte) 87, (tv) (Object) var5.field_f)) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (((rsb) this).field_e != null) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L8;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_24_0 = stackIn_24_0;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_25_0 = stackOut_24_0;
                    if (null != var5.field_e) {
                      stackOut_26_0 = stackIn_26_0;
                      stackOut_26_1 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L9;
                    } else {
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      break L9;
                    }
                  }
                  if ((stackIn_27_0 ^ stackIn_27_1) != 0) {
                    break L1;
                  } else {
                    L10: {
                      if (null == ((rsb) this).field_e) {
                        break L10;
                      } else {
                        if (((rsb) this).field_e.a((byte) 90, (tv) (Object) var5.field_e)) {
                          break L1;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (null != ((rsb) this).field_d) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        break L11;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L11;
                      }
                    }
                    L12: {
                      stackOut_34_0 = stackIn_34_0;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var5.field_d != null) {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L12;
                      } else {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L12;
                      }
                    }
                    if ((stackIn_37_0 ^ stackIn_37_1) != 0) {
                      break L1;
                    } else {
                      L13: {
                        if (((rsb) this).field_d == null) {
                          break L13;
                        } else {
                          if (!((rsb) this).field_d.a((byte) 124, (tv) (Object) var5.field_d)) {
                            break L13;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
          stackOut_41_0 = 1;
          stackIn_43_0 = stackOut_41_0;
          break L0;
        }
        return stackIn_43_0 != 0;
    }

    rsb() {
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        tfa var4 = null;
        int var5 = VoidHunters.field_G;
        for (var3 = 0; (((rsb) this).field_c.length ^ -1) < (var3 ^ -1); var3++) {
            var4 = (tfa) (Object) ((rsb) this).field_c[var3];
            var4.field_b = -1;
        }
        if (param0) {
            ((rsb) this).field_e = null;
        }
        ((rsb) this).field_d.a(81, param1);
    }

    static {
    }
}
