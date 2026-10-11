/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_b;
    private boolean field_g;
    static lj field_c;
    private int field_d;
    static qd field_a;
    int field_i;
    int field_h;
    private int field_k;
    private int field_l;
    static im field_f;
    static uj field_e;
    static int field_j;

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 <= 80) {
              return;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              mg.field_f = (int)(var3.longValue() / 1048576L) + 1;
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return 103 == this.field_k ? true : false;
        }
        field_c = (lj) null;
        return 103 == this.field_k ? true : false;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_e = null;
          field_f = null;
          field_c = null;
          field_a = null;
          return;
        }
        field_e = (uj) null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_a = null;
    }

    final void e(byte param0) {
        this.field_k = 0;
        this.field_d = 0;
        if (this.field_b == 0) {
          this.field_k = ob.field_K;
          if (this.field_b != 0) {
            if (this.field_b != 0) {
              if (param0 == -74) {
                return;
              }
              this.a((byte) 14);
              return;
            }
            if (ob.field_K != 99) {
              if (param0 != -74) {
                this.a((byte) 14);
                return;
              }
              return;
            }
            this.field_h = this.field_h + 1;
            if (this.field_h >= this.field_i) {
              this.field_h = 0;
            }
            this.field_g = false;
            if (param0 != -74) {
              this.a((byte) 14);
              return;
            }
            return;
          }
          if (ob.field_K == 98) {
            if (this.field_h <= 0) {
              this.field_h = this.field_i;
            }
            this.field_h = this.field_h - 1;
            this.field_g = false;
          }
          if (this.field_b != 0) {
            if (param0 != -74) {
              this.a((byte) 14);
              return;
            }
            return;
          }
          if (ob.field_K == 99) {
            this.field_h = this.field_h + 1;
            if (this.field_h >= this.field_i) {
              this.field_h = 0;
            }
            this.field_g = false;
          }
          if (param0 != -74) {
            this.a((byte) 14);
            return;
          }
          return;
        }
        if (this.field_b == 0) {
          if (ob.field_K != 98) {
            if (this.field_b == 0 &&
              ob.field_K == 99) {
              this.field_h = this.field_h + 1;
              if (this.field_h >= this.field_i) {
                this.field_h = 0;
              }
              this.field_g = false;
            }
            if (param0 != -74) {
              this.a((byte) 14);
              return;
            }
            return;
          }
          if (this.field_h <= 0) {
            this.field_h = this.field_i;
          }
          this.field_h = this.field_h - 1;
          this.field_g = false;
        }
        if (this.field_b == 0 &&
          ob.field_K == 99) {
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_i) {
            this.field_h = 0;
          }
          this.field_g = false;
        }
        if (param0 != -74) {
          this.a((byte) 14);
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = -37 / ((75 - param0) / 42);
        return this.field_k == 97 ? true : false;
    }

    final boolean a(byte param0) {
        if (param0 != -1) {
          this.field_h = -91;
          if (0 != this.field_d) {
            return true;
          }
          if (this.field_k != 84) {
            return this.field_k == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_d) {
          return true;
        }
        if (this.field_k == 84) {
          return true;
        }
        if (this.field_k != 83) {
          return false;
        }
        return true;
    }

    final static boolean b(int param0) {
        int var1 = 64 % ((-35 - param0) / 46);
        if (null == b.field_n) {
          return false;
        }
        if (b.field_n.k(3469) != null) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1) {
        if (this.field_b == 0) {
          this.field_h = param1;
          this.field_g = false;
          if (param0 != 0) {
            field_f = (im) null;
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        field_f = (im) null;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_i <= param2) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        this.field_k = 0;
        this.field_d = 0;
        if (gi.field_e != 0) {
          this.field_d = gi.field_e;
          this.field_b = gi.field_e;
          this.field_h = param0;
          this.field_l = aj.field_c;
          this.field_g = true;
        }
        if (this.field_b == 0) {
          if (~gi.field_e == param1) {
            if (of.field_G != 0) {
              if (this.field_b == 0) {
                if (!this.field_g &&
                  !kd.field_d) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_g) {
                    this.field_h = -1;
                  }
                } else {
                  if (param2 != this.field_h) {
                    this.field_h = param2;
                    this.field_g = true;
                  } else {
                    this.field_h = param2;
                    this.field_g = true;
                  }
                }
              }
              return;
            }
            this.field_b = 0;
          }
        } else {
          if (0 != of.field_G) {
            if (this.field_l <= 0) {
              this.field_l = va.field_c;
            }
            this.field_l = this.field_l - 1;
          }
          if (~gi.field_e == param1 &&
            of.field_G == 0) {
            this.field_b = 0;
          }
        }
        if (this.field_b != 0) {
          return;
        }
        if (!this.field_g &&
          !kd.field_d) {
          return;
        }
        if (param2 < 0) {
          if (!this.field_g) {
            return;
          }
          this.field_h = -1;
          return;
        }
        if (param2 != this.field_h) {
        }
        this.field_h = param2;
        this.field_g = true;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_g = param3 ? true : false;
        this.field_b = param2;
        if (this.field_g) {
          this.field_h = param1;
          return;
        }
        this.field_h = param0;
    }

    final boolean e(int param0) {
        if (param0 >= 99) {
          return 96 == this.field_k ? true : false;
        }
        this.d(58);
        return 96 == this.field_k ? true : false;
    }

    final void d(byte param0) {
        int var2;
        this.field_d = 0;
        this.field_k = 0;
        var2 = 82 / ((-64 - param0) / 49);
        if (this.field_b == 0) {
          this.field_k = ob.field_K;
        }
        if (this.field_b == 0 &&
          ob.field_K == 96) {
          if (this.field_h <= 0) {
            this.field_h = this.field_i;
          }
          this.field_g = false;
          this.field_h = this.field_h - 1;
        }
        if (this.field_b != 0) {
          return;
        }
        if (ob.field_K != 97) {
          return;
        }
        this.field_h = this.field_h + 1;
        this.field_g = false;
        if (this.field_h < this.field_i) {
          return;
        }
        this.field_h = 0;
    }

    final boolean c(byte param0) {
        int var2 = 26 / ((81 - param0) / 35);
        return this.field_b != 0 ? true : false;
    }

    final void b(int param0, int param1) {
        this.field_k = 0;
        this.field_d = 0;
        if (param0 != 27163) {
          return;
        }
        if (0 != this.field_b) {
          if (0 == this.field_b) {
            this.field_k = ob.field_K;
          }
          if (this.field_b != 0) {
            if (this.field_b != 0) {
              return;
            }
            if (ob.field_K != 98 &&
              ob.field_K != 99) {
              return;
            }
            this.field_g = false;
            if (this.field_h < 0) {
              this.field_h = param1;
              return;
            }
            return;
          }
          if (ob.field_K != 97) {
            if (this.field_b != 0) {
              return;
            }
            if (ob.field_K != 98 &&
              ob.field_K != 99) {
              return;
            }
            this.field_g = false;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
            return;
          }
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_i) {
            this.field_h = 0;
          }
          this.field_g = false;
          if (this.field_b == 0) {
            if (ob.field_K != 98 &&
              ob.field_K != 99) {
              return;
            }
            this.field_g = false;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
          }
          return;
        }
        if (ob.field_K != 96) {
          if (0 == this.field_b) {
            this.field_k = ob.field_K;
          }
          if (this.field_b == 0 &&
            ob.field_K == 97) {
            this.field_h = this.field_h + 1;
            if (this.field_h >= this.field_i) {
              this.field_h = 0;
            }
            this.field_g = false;
          }
          if (this.field_b == 0) {
            if (ob.field_K != 98 &&
              ob.field_K != 99) {
              return;
            }
            this.field_g = false;
            if (this.field_h >= 0) {
              return;
            }
            this.field_h = param1;
          }
          return;
        }
        if (0 >= this.field_h) {
          this.field_h = this.field_i;
        } else {
          this.field_h = this.field_h - 1;
          this.field_g = false;
          if (0 == this.field_b) {
            this.field_k = ob.field_K;
          }
          if (this.field_b == 0 &&
            ob.field_K == 97) {
            this.field_h = this.field_h + 1;
            if (this.field_h >= this.field_i) {
              this.field_h = 0;
            }
            this.field_g = false;
          }
          if (this.field_b == 0) {
            if (ob.field_K == 98) {
              this.field_g = false;
              if (this.field_h >= 0) {
                return;
              }
              this.field_h = param1;
              return;
            }
            if (ob.field_K == 99) {
              this.field_g = false;
              if (this.field_h >= 0) {
                return;
              }
              this.field_h = param1;
              return;
            }
            return;
          }
          return;
        }
        this.field_h = this.field_h - 1;
        this.field_g = false;
        if (0 == this.field_b) {
          this.field_k = ob.field_K;
        }
        if (this.field_b == 0 &&
          ob.field_K == 97) {
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_i) {
            this.field_h = 0;
          }
          this.field_g = false;
        }
        if (this.field_b == 0) {
          if (ob.field_K != 98 &&
            ob.field_K != 99) {
            return;
          }
          this.field_g = false;
          if (this.field_h >= 0) {
            return;
          }
          this.field_h = param1;
        }
    }

    final void d(int param0) {
        this.field_d = param0;
        this.field_k = 0;
        if (this.field_b == 0) {
          this.field_k = ob.field_K;
        }
    }

    final boolean c(int param0) {
        if (param0 < -89) {
          return this.field_k == 102 ? true : false;
        }
        this.field_i = -67;
        return this.field_k == 102 ? true : false;
    }

    ml(int param0) {
        this.field_g = false;
        this.field_h = 0;
        this.field_i = param0;
    }

    static {
        field_a = new qd();
        field_f = new im();
    }
}
