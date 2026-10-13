/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_l;
    static RgbSprite field_h;
    static int field_g;
    private int field_e;
    int field_r;
    static dj field_b;
    private int field_c;
    static int[] field_q;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_o;
    static RgbSprite field_k;
    private boolean field_d;
    static String[] field_p;
    static mh field_m;
    private int field_n;
    int field_j;

    public static void b(byte param0) {
        if (param0 == -60) {
          field_h = null;
          field_m = null;
          field_a = null;
          field_f = null;
          field_b = null;
          field_q = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    final void a(int param0, int param1) {
        this.field_l = 0;
        this.field_e = 0;
        this.field_c = 0;
        if (~this.field_n == param1) {
          this.field_e = dc.field_b;
        }
        if (0 != this.field_n) {
          if (this.field_n == 0 &&
            dc.field_b == 97) {
            this.field_j = this.field_j + 1;
            this.field_d = false;
            if (this.field_r <= this.field_j) {
              this.field_j = 0;
            }
          }
        } else {
          if (96 != dc.field_b) {
            if (this.field_n != 0) {
              if (this.field_n == 0) {
                if (dc.field_b != 98 &&
                  dc.field_b != 99) {
                  return;
                }
                this.field_d = false;
                if (0 > this.field_j) {
                  this.field_j = param0;
                }
              }
              return;
            }
            if (dc.field_b != 97) {
              if (this.field_n == 0) {
                if (dc.field_b != 98 &&
                  dc.field_b != 99) {
                  return;
                }
                this.field_d = false;
                if (0 > this.field_j) {
                  this.field_j = param0;
                }
              }
              return;
            }
            this.field_j = this.field_j + 1;
            this.field_d = false;
            if (this.field_r <= this.field_j) {
              this.field_j = 0;
            }
            if (this.field_n == 0) {
              if (dc.field_b != 98 &&
                dc.field_b != 99) {
                return;
              }
              this.field_d = false;
              if (0 > this.field_j) {
                this.field_j = param0;
              }
            }
            return;
          }
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
            this.field_d = false;
            if (this.field_n == 0 &&
              dc.field_b == 97) {
              this.field_j = this.field_j + 1;
              this.field_d = false;
              if (this.field_r <= this.field_j) {
                this.field_j = 0;
              }
            }
            if (this.field_n == 0) {
              if (dc.field_b != 98 &&
                dc.field_b != 99) {
                return;
              }
              this.field_d = false;
              if (0 > this.field_j) {
                this.field_j = param0;
              }
            }
            return;
          }
          this.field_j = this.field_r;
          this.field_j = this.field_j - 1;
          this.field_d = false;
          if (this.field_n != 0) {
            if (this.field_n != 0) {
              return;
            }
            if (dc.field_b == 98) {
              this.field_d = false;
              if (0 <= this.field_j) {
                return;
              }
              this.field_j = param0;
              return;
            }
            if (dc.field_b != 99) {
              return;
            }
            this.field_d = false;
            if (0 > this.field_j) {
              this.field_j = param0;
            }
            return;
          }
          if (dc.field_b != 97) {
            if (this.field_n != 0) {
              return;
            }
            if (dc.field_b == 98) {
              this.field_d = false;
              if (0 <= this.field_j) {
                return;
              }
              this.field_j = param0;
              return;
            }
            if (dc.field_b != 99) {
              return;
            }
            this.field_d = false;
            if (0 > this.field_j) {
              this.field_j = param0;
            }
            return;
          }
          this.field_j = this.field_j + 1;
          this.field_d = false;
          if (this.field_r > this.field_j) {
            if (this.field_n == 0) {
              if (dc.field_b != 98 &&
                dc.field_b != 99) {
                return;
              }
              this.field_d = false;
              if (0 > this.field_j) {
                this.field_j = param0;
              }
            }
            return;
          }
          this.field_j = 0;
        }
        if (this.field_n != 0) {
          return;
        }
        if (dc.field_b != 98 &&
          dc.field_b != 99) {
          return;
        }
        this.field_d = false;
        if (0 <= this.field_j) {
          return;
        }
        this.field_j = param0;
    }

    final void d(int param0) {
        this.field_l = 0;
        this.field_c = 0;
        this.field_e = 0;
        if (this.field_n == 0) {
          this.field_e = dc.field_b;
        }
        if (param0 == ~this.field_n &&
          dc.field_b == 98) {
          if (this.field_j <= 0) {
            this.field_j = this.field_r;
          }
          this.field_d = false;
          this.field_j = this.field_j - 1;
        }
        if (this.field_n != 0) {
          return;
        }
        if (dc.field_b != 99) {
          return;
        }
        this.field_j = this.field_j + 1;
        if (this.field_r <= this.field_j) {
          this.field_j = 0;
        }
        this.field_d = false;
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        this.field_d = param2 ? true : false;
        this.field_n = 0;
        if (param3 >= -126) {
          field_k = (RgbSprite) null;
          if (!this.field_d) {
            this.field_j = param1;
            return;
          }
          this.field_j = param0;
          return;
        }
        if (!this.field_d) {
          this.field_j = param1;
          return;
        }
        this.field_j = param0;
    }

    final static void f(byte param0) {
        RuntimeException runtimeException = null;
        int var2 = 0;
        wj var3_ref_wj = null;
        int var3 = 0;
        int var4_int = 0;
        ln var4 = null;
        Object var5 = null;
        int var6 = 0;
        BitPacketBuffer var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != -71) {
            return;
          }
          var9 = jl.field_e;
          var2 = var9.readUnsignedByte(255);
          if (0 != var2) {
            if (var2 == 1) {
              var3 = var9.readInt(255);
              var4 = (ln) (ie.field_v.first(-37));
              while (var4 != null) {
                if (var3 != var4.field_m) {
                  var4 = (ln) (ie.field_v.next((byte) 116));
                  continue;
                }
                break;
              }
              if (var4 == null) {
                hn.a((byte) 104);
                return;
              }
              var4.unlink((byte) 111);
              return;
            }
            rk.a("A1: " + eq.c((byte) -101), (Throwable) null, 123);
            hn.a((byte) 60);
          } else {
            var3_ref_wj = (wj) (uc.field_q.first(-110));
            if (var3_ref_wj == null) {
              hn.a((byte) 76);
              return;
            }
            var4_int = var9.readUnsignedByte(255);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4_int];
              var9.readBytes(0, var13, 116, var4_int);
            }
            var9.position = var9.position + 4;
            if (!var9.verifyCrc32((byte) -27)) {
              hn.a((byte) 86);
              return;
            }
            var3_ref_wj.unlink((byte) 111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "re.P(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 == -98) {
          return this.field_e == 97 ? true : false;
        }
        field_k = (RgbSprite) null;
        return this.field_e == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_r <= param0) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_r) {
          throw new IllegalArgumentException();
        }
        this.field_e = 0;
        this.field_l = 0;
        if (param1 != 27479) {
          this.field_l = -88;
          this.field_c = 0;
          if (ki.field_e != 0) {
            this.field_o = vd.field_c;
            this.field_j = param2;
            this.field_l = ki.field_e;
            this.field_c = ki.field_e;
            this.field_n = ki.field_e;
            this.field_d = true;
          }
          if (0 == this.field_n) {
            if (ki.field_e == 0 &&
              cb.field_q == 0) {
              this.field_n = 0;
            }
            if (this.field_n == 0) {
              if (!this.field_d &&
                !kb.field_Xb) {
                return;
              }
              if (param0 < 0) {
                if (this.field_d) {
                  this.field_j = -1;
                }
              } else {
                if (param0 != this.field_j) {
                  this.field_d = true;
                  this.field_j = param0;
                } else {
                  this.field_d = true;
                  this.field_j = param0;
                }
              }
            }
            return;
          }
          if (cb.field_q == 0) {
            if (ki.field_e == 0 &&
              cb.field_q == 0) {
              this.field_n = 0;
            }
            if (this.field_n == 0) {
              if (!this.field_d &&
                !kb.field_Xb) {
                return;
              }
              if (param0 < 0) {
                if (this.field_d) {
                  this.field_j = -1;
                }
              } else {
                if (param0 != this.field_j) {
                  this.field_d = true;
                  this.field_j = param0;
                } else {
                  this.field_d = true;
                  this.field_j = param0;
                }
              }
            }
            return;
          }
          if (this.field_o <= 0) {
            this.field_l = this.field_n;
            this.field_o = pe.field_q;
          }
          this.field_o = this.field_o - 1;
          if (ki.field_e == 0 &&
            cb.field_q == 0) {
            this.field_n = 0;
          }
          if (this.field_n == 0) {
            if (!this.field_d &&
              !kb.field_Xb) {
              return;
            }
            if (param0 < 0) {
              if (this.field_d) {
                this.field_j = -1;
              }
            } else {
              if (param0 != this.field_j) {
                this.field_d = true;
                this.field_j = param0;
              } else {
                this.field_d = true;
                this.field_j = param0;
              }
            }
          }
          return;
        }
        this.field_c = 0;
        if (ki.field_e != 0) {
          this.field_o = vd.field_c;
          this.field_j = param2;
          this.field_l = ki.field_e;
          this.field_c = ki.field_e;
          this.field_n = ki.field_e;
          this.field_d = true;
        }
        if (0 == this.field_n) {
          boolean decompiledFrameRemainder1 = true;
          if (ki.field_e == 0) {
            if (cb.field_q != 0) {
              if (this.field_n != 0) {
                return;
              }
              if (!this.field_d &&
                !kb.field_Xb) {
                return;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              this.field_n = 0;
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.field_n != 0) {
              return;
            }
            if (!this.field_d &&
              !kb.field_Xb) {
              return;
            }
          }
          if (param0 < 0) {
            if (!this.field_d) {
              return;
            }
            this.field_j = -1;
            return;
          }
          if (param0 != this.field_j) {
          }
          this.field_d = true;
          this.field_j = param0;
          return;
        }
        if (cb.field_q == 0) {
          boolean decompiledFrameRemainder0 = true;
          if (ki.field_e == 0) {
            if (cb.field_q != 0) {
              if (this.field_n != 0) {
                return;
              }
              if (!this.field_d &&
                !kb.field_Xb) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_n = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_n != 0) {
              return;
            }
            if (!this.field_d &&
              !kb.field_Xb) {
              return;
            }
          }
          if (param0 < 0) {
            if (!this.field_d) {
              return;
            }
            this.field_j = -1;
            return;
          }
          if (param0 != this.field_j) {
          }
          this.field_d = true;
          this.field_j = param0;
          return;
        }
        if (this.field_o <= 0) {
          this.field_l = this.field_n;
          this.field_o = pe.field_q;
        }
        this.field_o = this.field_o - 1;
        if (ki.field_e == 0) {
          if (cb.field_q != 0) {
            if (this.field_n == 0) {
              if (!this.field_d &&
                !kb.field_Xb) {
                return;
              }
              if (param0 >= 0) {
                if (param0 != this.field_j) {
                  this.field_d = true;
                  this.field_j = param0;
                  return;
                }
                this.field_d = true;
                this.field_j = param0;
                return;
              }
              if (!this.field_d) {
                return;
              }
              this.field_j = -1;
            }
            return;
          }
          this.field_n = 0;
        }
        if (this.field_n == 0) {
          if (this.field_d) {
            if (param0 >= 0) {
              if (param0 != this.field_j) {
              }
              this.field_d = true;
              this.field_j = param0;
              return;
            }
            if (!this.field_d) {
              return;
            }
            this.field_j = -1;
          } else {
            if (kb.field_Xb) {
              if (param0 < 0) {
                if (!this.field_d) {
                  return;
                }
                this.field_j = -1;
                return;
              }
              if (param0 != this.field_j) {
              }
              this.field_d = true;
              this.field_j = param0;
              return;
            }
          }
        }
    }

    final void d(byte param0) {
        if (param0 != -124) {
          field_b = (dj) null;
          this.field_e = 0;
          this.field_l = 0;
          this.field_c = 0;
          if (this.field_n == 0) {
            this.field_e = dc.field_b;
            return;
          }
          return;
        }
        this.field_e = 0;
        this.field_l = 0;
        this.field_c = 0;
        if (this.field_n != 0) {
          return;
        }
        this.field_e = dc.field_b;
    }

    final static int e(byte param0) {
        if (param0 <= 28) {
          re.b((byte) 56);
          return 256;
        }
        return 256;
    }

    final boolean c(byte param0) {
        int var2 = 77 % ((44 - param0) / 51);
        if (this.field_l != 0) {
          return true;
        }
        if (84 == this.field_e) {
          return true;
        }
        if (83 != this.field_e) {
          return false;
        }
        return true;
    }

    final boolean a(int param0) {
        if (param0 != -1) {
          return false;
        }
        return this.field_e == 103 ? true : false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_n != 0 ? true : false;
        }
        this.d(-91);
        return this.field_n != 0 ? true : false;
    }

    final boolean g(byte param0) {
        if (param0 == -57) {
          return this.field_e == 96 ? true : false;
        }
        this.field_j = 105;
        return this.field_e == 96 ? true : false;
    }

    final void a(boolean param0, int param1) {
        if (this.field_n == 0) {
          this.field_j = param1;
          this.field_d = false;
          if (param0) {
            this.field_e = -38;
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        this.field_e = -38;
    }

    final boolean b(int param0) {
        if (param0 == -103) {
          return this.field_e == 102 ? true : false;
        }
        this.a(-49, -52, false, (byte) 110);
        return this.field_e == 102 ? true : false;
    }

    final boolean a(byte param0) {
        if (param0 != 113) {
          return true;
        }
        if (0 != this.field_c) {
          return true;
        }
        if (84 == this.field_e) {
          return true;
        }
        if (this.field_e != 83) {
          return false;
        }
        return true;
    }

    re(int param0) {
        this.field_j = 0;
        this.field_d = false;
        this.field_r = param0;
    }

    static {
        field_f = "<%0> is not a member, and cannot play with the current options.";
        field_a = "No";
        field_p = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
