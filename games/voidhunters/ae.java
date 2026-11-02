/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    private int field_a;
    private int field_d;
    int field_c;
    static ri field_g;
    private int field_i;
    private int field_h;
    private boolean field_b;
    private int field_e;
    static pr field_f;
    int field_j;

    final boolean a(int param0) {
        if (param0 <= 0) {
          this.a((byte) 66, -23);
          if (this.field_h != 2) {
            return this.field_i == 96 ? true : false;
          }
          return true;
        }
        if (this.field_h == 2) {
          return true;
        }
        if (this.field_i != 96) {
          return false;
        }
        return true;
    }

    final void c(int param0) {
        this.field_a = 0;
        this.field_h = 0;
        this.field_i = 0;
        if (param0 == -19255) {
          if (this.field_d == 0) {
            this.field_i = SetBombletSprayProjectileDamage.field_o;
          }
          return;
        }
        this.a(false, 6);
        if (this.field_d == 0) {
          this.field_i = SetBombletSprayProjectileDamage.field_o;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_c <= param2) {
          throw new IllegalArgumentException();
        }
        if (param1 == 5620) {
          if (param0 >= this.field_c) {
            throw new IllegalArgumentException();
          }
          this.field_i = 0;
          this.field_a = 0;
          this.field_h = 0;
          if (SetDebrisPartitioned.field_o != 0) {
            this.field_e = SetNebulaFadesOutWhenClose.field_p;
            this.field_b = true;
            this.field_h = SetDebrisPartitioned.field_o;
            this.field_a = SetDebrisPartitioned.field_o;
            this.field_j = param0;
            this.field_d = SetDebrisPartitioned.field_o;
          }
          if (this.field_d != 0 &&
            hu.field_b != 0) {
            if (this.field_e > 0) {
              this.field_e = this.field_e - 1;
              if (SetDebrisPartitioned.field_o == 0 &&
                0 == hu.field_b) {
                this.field_d = 0;
              }
              if (0 != this.field_d) {
                return;
              }
              if (!this.field_b &&
                !upb.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.field_j != param2) {
                  this.field_b = true;
                  this.field_j = param2;
                  return;
                }
                this.field_b = true;
                this.field_j = param2;
                return;
              }
              if (this.field_b) {
                this.field_j = -1;
              }
              return;
            }
            this.field_e = GetDebrisGroupColour.field_q;
            this.field_h = this.field_d;
            this.field_e = this.field_e - 1;
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == hu.field_b) {
              this.field_d = 0;
            }
            if (0 != this.field_d) {
              return;
            }
            if (!this.field_b &&
              !upb.field_c) {
              return;
            }
            if (0 <= param2) {
              if (this.field_j != param2) {
                this.field_b = true;
                this.field_j = param2;
                return;
              }
              this.field_b = true;
              this.field_j = param2;
              return;
            }
            if (this.field_b) {
              this.field_j = -1;
            }
            return;
          }
          if (SetDebrisPartitioned.field_o == 0 &&
            0 == hu.field_b) {
            this.field_d = 0;
            if (0 != this.field_d) {
              return;
            }
            if (!this.field_b &&
              !upb.field_c) {
              return;
            }
            if (0 <= param2) {
              if (this.field_j != param2) {
                this.field_b = true;
                this.field_j = param2;
                return;
              }
              this.field_b = true;
              this.field_j = param2;
              return;
            }
            if (this.field_b) {
              this.field_j = -1;
            }
            return;
          }
        } else {
          this.field_i = -16;
          if (param0 >= this.field_c) {
            throw new IllegalArgumentException();
          }
          this.field_i = 0;
          this.field_a = 0;
          this.field_h = 0;
          if (SetDebrisPartitioned.field_o == 0) {
            if (this.field_d != 0 &&
              hu.field_b != 0) {
              if (this.field_e > 0) {
                this.field_e = this.field_e - 1;
                if (SetDebrisPartitioned.field_o == 0 &&
                  0 == hu.field_b) {
                  this.field_d = 0;
                }
                if (0 != this.field_d) {
                  return;
                }
                if (!this.field_b &&
                  !upb.field_c) {
                  return;
                }
                if (0 <= param2) {
                  if (this.field_j != param2) {
                    this.field_b = true;
                    this.field_j = param2;
                    return;
                  }
                  this.field_b = true;
                  this.field_j = param2;
                  return;
                }
                if (this.field_b) {
                  this.field_j = -1;
                }
                return;
              }
              this.field_e = GetDebrisGroupColour.field_q;
              this.field_h = this.field_d;
              this.field_e = this.field_e - 1;
              if (SetDebrisPartitioned.field_o == 0 &&
                0 == hu.field_b) {
                this.field_d = 0;
              }
              if (0 != this.field_d) {
                return;
              }
              if (!this.field_b &&
                !upb.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.field_j != param2) {
                  this.field_b = true;
                  this.field_j = param2;
                  return;
                }
                this.field_b = true;
                this.field_j = param2;
                return;
              }
              if (this.field_b) {
                this.field_j = -1;
              }
              return;
            }
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == hu.field_b) {
              this.field_d = 0;
              if (0 != this.field_d) {
                return;
              }
              if (!this.field_b &&
                !upb.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.field_j != param2) {
                  this.field_b = true;
                  this.field_j = param2;
                  return;
                }
                this.field_b = true;
                this.field_j = param2;
                return;
              }
              if (this.field_b) {
                this.field_j = -1;
              }
              return;
            }
          } else {
            this.field_e = SetNebulaFadesOutWhenClose.field_p;
            this.field_b = true;
            this.field_h = SetDebrisPartitioned.field_o;
            this.field_a = SetDebrisPartitioned.field_o;
            this.field_j = param0;
            this.field_d = SetDebrisPartitioned.field_o;
            if (this.field_d != 0 &&
              hu.field_b != 0) {
              if (this.field_e > 0) {
                this.field_e = this.field_e - 1;
                if (SetDebrisPartitioned.field_o == 0 &&
                  0 == hu.field_b) {
                  this.field_d = 0;
                }
                if (0 != this.field_d) {
                  return;
                }
                if (!this.field_b &&
                  !upb.field_c) {
                  return;
                }
                if (0 <= param2) {
                  if (this.field_j != param2) {
                    this.field_b = true;
                    this.field_j = param2;
                    return;
                  }
                  this.field_b = true;
                  this.field_j = param2;
                  return;
                }
                if (this.field_b) {
                  this.field_j = -1;
                }
                return;
              }
              this.field_e = GetDebrisGroupColour.field_q;
              this.field_h = this.field_d;
              this.field_e = this.field_e - 1;
            }
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == hu.field_b) {
              this.field_d = 0;
            }
          }
        }
        if (0 != this.field_d) {
          return;
        }
        if (!this.field_b &&
          !upb.field_c) {
          return;
        }
        if (0 > param2) {
          if (!this.field_b) {
            return;
          }
          this.field_j = -1;
          return;
        }
        if (this.field_j != param2) {
        }
        this.field_b = true;
        this.field_j = param2;
    }

    final void a(byte param0, int param1) {
        if (param0 != -17) {
          this.a(true);
          if (this.field_d == 0) {
            this.field_b = false;
            this.field_j = param1;
            return;
          }
          return;
        }
        if (this.field_d != 0) {
          return;
        }
        this.field_b = false;
        this.field_j = param1;
    }

    final boolean b(byte param0) {
        int var2 = 41 / ((param0 - 43) / 61);
        return this.field_d != 0 ? true : false;
    }

    final boolean e(byte param0) {
        if (param0 >= -74) {
          this.d(-86);
          if (this.field_a != 0) {
            return true;
          }
          if (84 != this.field_i) {
            return this.field_i == 83 ? true : false;
          }
          return true;
        }
        if (this.field_a != 0) {
          return true;
        }
        if (84 == this.field_i) {
          return true;
        }
        if (this.field_i != 83) {
          return false;
        }
        return true;
    }

    final boolean c(byte param0) {
        if (param0 != -45) {
          return false;
        }
        if (this.field_h == 1) {
          return true;
        }
        if (this.field_i == 97) {
          return true;
        }
        if (this.field_i == 84) {
          return true;
        }
        if (83 != this.field_i) {
          return false;
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        this.field_a = 0;
        this.field_i = 0;
        if (param0) {
          this.field_a = 19;
          this.field_h = 0;
          if (0 == this.field_d) {
            this.field_i = SetBombletSprayProjectileDamage.field_o;
          }
          if (this.field_d != 0) {
            if (this.field_d == 0 &&
              97 == SetBombletSprayProjectileDamage.field_o) {
              this.field_j = this.field_j + 1;
              if (this.field_c <= this.field_j) {
                this.field_j = 0;
              }
              this.field_b = false;
            }
            if (this.field_d == 0) {
              if (SetBombletSprayProjectileDamage.field_o != 98 &&
                SetBombletSprayProjectileDamage.field_o != 99) {
                return;
              }
              this.field_b = false;
              if (0 > this.field_j) {
                this.field_j = param1;
              }
            }
            return;
          }
          if (SetBombletSprayProjectileDamage.field_o == 96) {
            if (0 >= this.field_j) {
              this.field_j = this.field_c;
            }
            this.field_b = false;
            this.field_j = this.field_j - 1;
          }
          if (this.field_d != 0) {
            if (this.field_d == 0) {
              if (SetBombletSprayProjectileDamage.field_o != 98 &&
                SetBombletSprayProjectileDamage.field_o != 99) {
                return;
              }
              this.field_b = false;
              if (0 > this.field_j) {
                this.field_j = param1;
              }
            }
            return;
          }
          if (97 == SetBombletSprayProjectileDamage.field_o) {
            this.field_j = this.field_j + 1;
            if (this.field_c <= this.field_j) {
              this.field_j = 0;
            }
            this.field_b = false;
          }
          if (this.field_d == 0) {
            if (SetBombletSprayProjectileDamage.field_o != 98 &&
              SetBombletSprayProjectileDamage.field_o != 99) {
              return;
            }
            this.field_b = false;
            if (0 > this.field_j) {
              this.field_j = param1;
            }
          }
          return;
        }
        this.field_h = 0;
        if (0 == this.field_d) {
          this.field_i = SetBombletSprayProjectileDamage.field_o;
        }
        if (this.field_d == 0 &&
          SetBombletSprayProjectileDamage.field_o == 96) {
          if (0 >= this.field_j) {
            this.field_j = this.field_c;
          }
          this.field_b = false;
          this.field_j = this.field_j - 1;
        }
        if (this.field_d == 0 &&
          97 == SetBombletSprayProjectileDamage.field_o) {
          this.field_j = this.field_j + 1;
          if (this.field_c <= this.field_j) {
            this.field_j = 0;
          }
          this.field_b = false;
        }
        if (this.field_d != 0) {
          return;
        }
        if (SetBombletSprayProjectileDamage.field_o != 98 &&
          SetBombletSprayProjectileDamage.field_o != 99) {
          return;
        }
        this.field_b = false;
        if (0 <= this.field_j) {
          return;
        }
        this.field_j = param1;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_i == 102 ? true : false;
        }
        this.a((byte) -113, -81);
        return this.field_i == 102 ? true : false;
    }

    final void a(byte param0) {
        this.field_h = 0;
        this.field_i = 0;
        this.field_a = 0;
        if (this.field_d == 0) {
          this.field_i = SetBombletSprayProjectileDamage.field_o;
          if (0 != this.field_d) {
            if (param0 > -37) {
              ae.e(15);
            }
            if (this.field_d == 0 &&
              99 == SetBombletSprayProjectileDamage.field_o) {
              this.field_j = this.field_j + 1;
              if (this.field_j >= this.field_c) {
                this.field_j = 0;
              }
              this.field_b = false;
            }
            return;
          }
          if (98 != SetBombletSprayProjectileDamage.field_o) {
            if (param0 > -37) {
              ae.e(15);
            }
            if (this.field_d == 0 &&
              99 == SetBombletSprayProjectileDamage.field_o) {
              this.field_j = this.field_j + 1;
              if (this.field_j >= this.field_c) {
                this.field_j = 0;
              }
              this.field_b = false;
            }
            return;
          }
          if (this.field_j <= 0) {
            this.field_j = this.field_c;
          }
          this.field_b = false;
          this.field_j = this.field_j - 1;
        } else {
          if (0 == this.field_d &&
            98 == SetBombletSprayProjectileDamage.field_o) {
            if (this.field_j <= 0) {
              this.field_j = this.field_c;
              this.field_b = false;
              this.field_j = this.field_j - 1;
              if (param0 > -37) {
                ae.e(15);
              }
              if (this.field_d == 0) {
                if (99 != SetBombletSprayProjectileDamage.field_o) {
                  return;
                }
                this.field_j = this.field_j + 1;
                if (this.field_j >= this.field_c) {
                  this.field_j = 0;
                }
                this.field_b = false;
              }
              return;
            }
            this.field_b = false;
            this.field_j = this.field_j - 1;
          }
        }
        if (param0 > -37) {
          ae.e(15);
        }
        if (this.field_d != 0) {
          return;
        }
        if (99 != SetBombletSprayProjectileDamage.field_o) {
          return;
        }
        this.field_j = this.field_j + 1;
        if (this.field_j >= this.field_c) {
          this.field_j = 0;
        }
        this.field_b = false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_b = param0 ? true : false;
        this.field_d = 0;
        if (this.field_b) {
          this.field_j = param3;
          if (param1 != -1) {
            this.field_j = -82;
            return;
          }
          return;
        }
        this.field_j = param2;
        if (param1 != -1) {
          this.field_j = -82;
          return;
        }
    }

    final static Ship a(int[] param0, byte param1) {
        Ship var2 = null;
        RuntimeException var2_ref = null;
        Ship stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new Ship();
          var2.chassis = SetSniperCannonProjectileLife.a(1, param0);
          var2.e((byte) 119);
          var2.chassis.a(true, 0, 0, 0, 0, var2.getBoundingbox((byte) -123));
          var2.chassis.a((byte) 21, (ShipBody) (var2));
          if (param1 <= 21) {
            field_g = (ri) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ae.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 == -1) {
          field_f = null;
          field_g = null;
          return;
        }
        int[] var2 = (int[]) null;
        ae.a((int[]) null, (byte) -13);
        field_f = null;
        field_g = null;
    }

    final boolean d(byte param0) {
        if (param0 != -7) {
          return true;
        }
        return this.field_i == 96 ? true : false;
    }

    final boolean d(int param0) {
        if (param0 == 12465) {
          return this.field_i == 103 ? true : false;
        }
        this.a((byte) 108, -98);
        return this.field_i == 103 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 <= -79) {
          return 97 == this.field_i ? true : false;
        }
        this.field_i = -15;
        return 97 == this.field_i ? true : false;
    }

    ae(int param0) {
        this.field_b = false;
        this.field_j = 0;
        this.field_c = param0;
    }

    static {
        field_g = new ri(12, 0, 1, 0);
    }
}
