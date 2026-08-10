/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private int field_f;
    private int field_a;
    private boolean field_h;
    private int field_i;
    hj field_e;
    hj[] field_b;
    private int field_c;
    static String[] field_d;
    static String field_g;
    private int field_j;

    final sa c(int param0, int param1) {
        if (param1 != 2) {
            return (sa) null;
        }
        this.field_f = param0;
        return (sa) (this);
    }

    final void a(sj param0, int param1, int param2, pj param3, int param4) {
        kc stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        kc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (param4 == 24183) {
                break L1;
              } else {
                this.b(-93, -102);
                break L1;
              }
            }
            L2: {
              ti.a(param3.field_r, 6, param3.field_m, this.field_b, param3.field_s + param2, param3.field_n + param1);
              if (this.field_e != null) {
                L3: {
                  var6_int = param2 + param3.field_s - -this.field_c;
                  if (-2 != (param0.field_h ^ -1)) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_e.field_s + param3.field_m) / 2;
                    break L3;
                  }
                }
                L4: {
                  var7 = this.field_j + (param3.field_n + param1);
                  if (param0.field_c == 1) {
                    var7 = var7 + (-this.field_e.field_t + param3.field_r) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param0.field_h) {
                    var6_int = var6_int + (param3.field_m - this.field_e.field_s);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0.field_c == 2) {
                    var7 = var7 + (param3.field_r + -this.field_e.field_t);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_e.c(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6 = param0.a((byte) -95, param3);
              if (var6 == null) {
                break L7;
              } else {
                if (param0.field_g == null) {
                  break L7;
                } else {
                  if ((this.field_i ^ -1) > -1) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_21_0 = param0.field_g;

                      stackIn_21_1 = (String) (var6);

                      stackIn_21_2 = param3.field_s + (param2 + param0.field_p);

                      if (-2147483648 != this.field_c) {
                        stackIn_22_0 = (kc) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = this.field_c;
                        break L8;
                      } else {
                        stackIn_22_0 = (kc) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) ((Object) stackIn_21_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = 0;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_24_2 = stackIn_22_2 + stackIn_22_3;

                      if (2147483647 != (this.field_j ^ -1)) {
                        stackIn_22_0 = (kc) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = this.field_j;
                        break L9;
                      } else {
                        stackIn_22_0 = (kc) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);
                        stackIn_25_2 = stackIn_24_2;
                        stackIn_25_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_27_3 = stackIn_25_3 + (param0.field_r + (param3.field_n + param1));

                      stackIn_27_4 = -param0.field_i + (param3.field_m - param0.field_p);

                      stackIn_27_5 = -param0.field_r + param3.field_r - param0.field_q;

                      stackIn_27_6 = this.field_i;

                      stackIn_27_7 = this.field_f;

                      if (this.field_a != -2147483648) {
                        stackIn_22_0 = (kc) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = this.field_a;
                        break L10;
                      } else {
                        stackIn_22_0 = (kc) ((Object) stackIn_22_0);
                        stackIn_22_1 = (String) ((Object) stackIn_22_1);

                        stackIn_28_3 = stackIn_27_3;
                        stackIn_28_4 = stackIn_27_4;
                        stackIn_28_5 = stackIn_27_5;
                        stackIn_28_6 = stackIn_27_6;
                        stackIn_28_7 = stackIn_27_7;
                        stackIn_28_8 = 256;
                        break L10;
                      }
                    }
                    ((kc) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_h, param0.field_c, param0.field_t);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("sa.I(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param4 + ')');
        }
    }

    final sa a(byte param0, int param1) {
        if (param0 <= 111) {
            return (sa) null;
        }
        this.field_i = param1;
        return (sa) (this);
    }

    final static void a(int param0, hj[] param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = OrbDefence.field_D ? 1 : 0;
        if (param1 == null || (param3 ^ -1) >= -1) {
            return;
        }
        try {
            var5_int = param1[param0].field_s;
            var6 = param1[2].field_s;
            var7 = param1[1].field_s;
            param1[0].c(param2, param4);
            param1[2].c(param2 + param3 + -var6, param4);
            ul.a(pk.field_F);
            ul.i(param2 + var5_int, param4, -var6 + (param3 + param2), param4 - -param1[1].field_t);
            var8 = var5_int + param2;
            var9 = param2 + param3 - var6;
            for (param2 = var8; param2 < var9; param2 = param2 + var7) {
                param1[1].c(param2, param4);
            }
            ul.b(pk.field_F);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sa.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -57) {
          sa.a((byte) 66, false, false, true);
          field_g = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        int var5;
        var4 = 0;
        var5 = -40 / ((param0 - 32) / 37);
        if (!param3) {
          if (param2) {
            L0: {
              var4 += 2;
              if (param1) {
                var4++;
                break L0;
              } else {
                break L0;
              }
            }
            return pf.field_a[var4];
          } else {
            L1: {
              if (param1) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return pf.field_a[var4];
          }
        } else {
          var4 += 4;
          if (!param2) {
            L2: {
              if (param1) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return pf.field_a[var4];
          } else {
            L3: {
              var4 += 2;
              if (param1) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return pf.field_a[var4];
          }
        }
    }

    final sa a(hj[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              if (param1 == 0) {
                break L1;
              } else {
                this.b(57, -50);
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sa.C(");

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (sa) (this);
    }

    final sa a(int param0, int param1) {
        if (param1 != 0) {
            this.field_a = -45;
            this.field_c = param0;
            return (sa) (this);
        }
        this.field_c = param0;
        return (sa) (this);
    }

    final sa b(int param0, int param1) {
        if (param1 != 2) {
            this.field_f = -48;
            this.field_j = param0;
            return (sa) (this);
        }
        this.field_j = param0;
        return (sa) (this);
    }

    final void a(byte param0, sa param1) {
        try {
            param1.field_i = this.field_i;
            param1.field_e = this.field_e;
            if (param0 != -110) {
                this.field_c = 15;
            }
            param1.field_h = this.field_h;
            param1.field_f = this.field_f;
            param1.field_b = this.field_b;
            param1.field_c = this.field_c;
            param1.field_a = this.field_a;
            param1.field_j = this.field_j;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        this.field_b = null;
        this.field_e = null;
        if (param0 != -31) {
          this.field_e = (hj) null;
          this.field_i = 0;
          this.field_a = 256;
          this.field_c = 0;
          this.field_j = 0;
          this.field_f = -1;
          return;
        } else {
          this.field_i = 0;
          this.field_a = 256;
          this.field_c = 0;
          this.field_j = 0;
          this.field_f = -1;
          return;
        }
    }

    final sa a(boolean param0, byte param1) {
        if (param1 != -57) {
            return (sa) null;
        }
        this.field_h = param0 ? true : false;
        return (sa) (this);
    }

    final void a(boolean param0, int param1, int param2, sa param3, sj param4, pj param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_h) {
                param3.a(param4, param1, param2, param5, 24183);
                param3.b((byte) -31);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 <= this.field_i) {
                param3.field_i = this.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            if (!param0) {
              L3: {
                if (2147483647 == (this.field_j ^ -1)) {
                  break L3;
                } else {
                  param3.field_j = this.field_j;
                  break L3;
                }
              }
              L4: {
                if (this.field_e != null) {
                  param3.field_e = this.field_e;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (null != this.field_b) {
                  param3.field_b = this.field_b;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 < (this.field_f ^ -1)) {
                  break L6;
                } else {
                  param3.field_f = this.field_f;
                  break L6;
                }
              }
              L7: {
                if (-2147483648 == this.field_c) {
                  break L7;
                } else {
                  param3.field_c = this.field_c;
                  break L7;
                }
              }
              if ((this.field_a ^ -1) == 2147483647) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param3.field_a = this.field_a;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("sa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    sa() {
        this.field_h = false;
        this.field_a = -2147483648;
        this.field_i = -2;
        this.field_e = null;
        this.field_f = -2;
        this.field_c = -2147483648;
        this.field_b = null;
        this.field_j = -2147483648;
    }

    static {
        field_d = new String[]{"Welcome to Orb Defence!<br>To toggle this tutorial on or off, just click the question mark button in the top-right of the screen.<br><col=cc88ff>Click on this box</col> to continue.", "Norbs will approach your orbs along the highlighted route. You need to stop them before they get to any of the orbs. Place turrets on the gridded areas either side of the Norbs' route.<br><col=cc88ff>Use the mouse to place ten turrets</col> to continue.", "Notice how some of your turrets are flashing? This means that you can upgrade them. Upgrading costs you energy. You gain energy from destroying Norbs.<br><col=cc88ff>Clicking on a turret's base</col> will upgrade it, as long as you have the required energy.<br><col=cc88ff>Click on this box</col> to continue.", "To start the Norbs attacking and to hurry their attacks later on, you can press <img=2>. Doing this will provide you with more points and energy should you defeat the boss that arrives on every eleventh wave.<br><col=cc88ff>Press <img=2></col> to continue.", "Well done so far! The next wave is a boss wave. Defeating bosses will give you a massive boost to your energy.<br><col=cc88ff>Click on this box</col> to continue.", "As the Norbs attack, they will become more intelligent. Use the <col=cc88ff>arrow keys</col> to scroll around the map and place some turrets to defend your other orbs.<br><col=cc88ff>Click on this box</col> to continue.", "You have lost an orb! Norbs can now spawn where your orb used to stand. Defend your remaining orbs well!<br><col=cc88ff>Click on this box</col> to continue.", "You can now construct big shot turrets. These mighty turrets damage Norbs over an area, but can be easily avoided by the faster Norbs.<br><col=cc88ff>Click on this box</col> to continue.", "You can now construct ice shot turrets. These expensive turrets slow down the attacking Norbs, but are slow to fire and do not deal much damage.<br><col=cc88ff>Click on this box</col> to continue.", "You can now construct the mighty beam blast turret. This massive turret deals large amounts of damage. It cannot hit flybos, however.<br><col=cc88ff>Click on this box</col> to continue.", "Fast blasts can now be upgraded to their maximum power.<br><col=cc88ff>Click on this box</col> to continue.", "Chain shots can now be upgraded to their maximum power.<br><col=cc88ff>Click on this box</col> to continue.", "Big shots can now be upgraded to their maximum power. This will provide them with a greater range and area of effect.<br><col=cc88ff>Click on this box</col> to continue.", "Ice shots can now be upgraded to their maximum power. This will greatly increase their freeze time and area of effect.<br><col=cc88ff>Click on this box</col> to continue.", "Beam blasts can now be upgraded to their maximum power. Good luck in the final waves!<br><col=cc88ff>Click on this box</col> to continue.", "As you defeat the attacking Norbs you will gain access to more turrets. <col=cc88ff>Select different turrets by clicking on the buttons below</col>. The chain shot turret has a longer range when upgraded, but takes up more space than the fast blast.<br><col=cc88ff>Click on this box</col> to continue.", "You can now construct electroshock turrets. You need these to reveal sneakos! Though expensive and slow to charge, these turrets can stun large groups of attacking Norbs.<br><col=cc88ff>Click on this box</col> to continue.", "Electroshocks can now be upgraded to their maximum power. This will greatly increase their damage and area of effect.<br><col=cc88ff>Click on this box</col> to continue.", "Welcome to the new Orb Defence levels!<br>You now start with access to barriers that deter Norbs, but take damage if attacked. Good luck!<br><col=cc88ff>Click on this box</col> to continue."};
        field_g = "Click";
    }
}
