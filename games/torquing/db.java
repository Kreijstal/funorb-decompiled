/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static of[] field_a;
    private int field_c;
    private int field_h;
    int field_i;
    private int field_f;
    private int field_b;
    static String field_d;
    static int field_j;
    boolean field_k;
    int field_g;
    private int field_e;

    final boolean f(byte param0) {
        if (param0 != -60) {
          this.d((byte) 26);
          if (this.field_e != 0) {
            return true;
          }
          if (this.field_h != 84) {
            return 83 == this.field_h ? true : false;
          }
          return true;
        }
        if (this.field_e != 0) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (83 != this.field_h) {
          return false;
        }
        return true;
    }

    final void a(int param0) {
        this.field_e = param0;
        this.field_h = 0;
        this.field_c = 0;
        if (this.field_b == 0 &&
          98 == e.field_f) {
          if (0 >= this.field_g) {
            this.field_g = this.field_i;
          }
          this.field_g = this.field_g - 1;
          this.field_k = false;
        }
        if (this.field_b == 0) {
          this.field_h = e.field_f;
        }
        if (this.field_b != 0) {
          return;
        }
        if (99 != e.field_f) {
          return;
        }
        this.field_g = this.field_g + 1;
        this.field_k = false;
        if (this.field_g < this.field_i) {
          return;
        }
        this.field_g = 0;
    }

    final void a(int param0, int param1) {
        if (param1 == ~this.field_b) {
          this.field_k = false;
          this.field_g = param0;
        }
    }

    final void a(boolean param0) {
        this.field_e = 0;
        if (param0) {
          return;
        }
        this.field_c = 0;
        this.field_h = 0;
        if (this.field_b == 0) {
          this.field_h = e.field_f;
        }
        if (0 == this.field_b &&
          e.field_f == 96) {
          if (this.field_g <= 0) {
            this.field_g = this.field_i;
          }
          this.field_k = false;
          this.field_g = this.field_g - 1;
        }
        if (this.field_b != 0) {
          return;
        }
        if (e.field_f != 97) {
          return;
        }
        this.field_g = this.field_g + 1;
        this.field_k = false;
        if (this.field_i > this.field_g) {
          return;
        }
        this.field_g = 0;
    }

    final boolean c(int param0) {
        if (param0 != -97) {
          this.f((byte) -87);
          if (this.field_c != 0) {
            return true;
          }
          if (this.field_h != 84) {
            return this.field_h == 83 ? true : false;
          }
          return true;
        }
        if (this.field_c != 0) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final void a(byte param0, int param1) {
        this.field_c = 0;
        this.field_h = 0;
        this.field_e = 0;
        if (this.field_b != 0) {
          if (this.field_b == 0) {
            this.field_h = e.field_f;
            if (0 == this.field_b &&
              e.field_f == 97) {
              this.field_g = this.field_g + 1;
              if (this.field_g >= this.field_i) {
                this.field_g = 0;
              }
              this.field_k = false;
            }
            if (param0 <= 44) {
              this.d((byte) -58);
            }
            if (this.field_b == 0) {
              if (e.field_f != 98 &&
                99 != e.field_f) {
                return;
              }
              this.field_k = false;
              if (this.field_g < 0) {
                this.field_g = param1;
              }
            }
            return;
          }
          if (0 == this.field_b) {
            if (e.field_f != 97) {
              if (param0 <= 44) {
                this.d((byte) -58);
              }
              if (this.field_b == 0) {
                if (e.field_f != 98 &&
                  99 != e.field_f) {
                  return;
                }
                this.field_k = false;
                if (this.field_g < 0) {
                  this.field_g = param1;
                }
              }
              return;
            }
            this.field_g = this.field_g + 1;
            if (this.field_g >= this.field_i) {
              this.field_g = 0;
              this.field_k = false;
              if (param0 <= 44) {
                this.d((byte) -58);
              }
              if (this.field_b == 0) {
                if (e.field_f != 98 &&
                  99 != e.field_f) {
                  return;
                }
                this.field_k = false;
                if (this.field_g < 0) {
                  this.field_g = param1;
                }
              }
              return;
            }
            this.field_k = false;
          }
          if (param0 <= 44) {
            this.d((byte) -58);
            if (this.field_b == 0) {
              if (e.field_f != 98 &&
                99 != e.field_f) {
                return;
              }
              this.field_k = false;
              if (this.field_g < 0) {
                this.field_g = param1;
              }
            }
            return;
          }
          if (this.field_b != 0) {
            return;
          }
          if (e.field_f == 98) {
            this.field_k = false;
            if (this.field_g >= 0) {
              return;
            }
            this.field_g = param1;
            return;
          }
          if (99 != e.field_f) {
            return;
          }
          this.field_k = false;
          if (this.field_g < 0) {
            this.field_g = param1;
          }
          return;
        }
        if (e.field_f == 96) {
          if (this.field_g <= 0) {
            this.field_g = this.field_i;
          }
          this.field_k = false;
          this.field_g = this.field_g - 1;
        }
        if (this.field_b == 0) {
          this.field_h = e.field_f;
          if (0 != this.field_b) {
            if (param0 <= 44) {
              this.d((byte) -58);
            }
            if (this.field_b == 0) {
              if (e.field_f != 98 &&
                99 != e.field_f) {
                return;
              }
              this.field_k = false;
              if (this.field_g < 0) {
                this.field_g = param1;
              }
            }
            return;
          }
          if (e.field_f == 97) {
            this.field_g = this.field_g + 1;
            if (this.field_g < this.field_i) {
              this.field_k = false;
              if (param0 <= 44) {
                this.d((byte) -58);
              }
              if (this.field_b == 0) {
                if (e.field_f != 98 &&
                  99 != e.field_f) {
                  return;
                }
                this.field_k = false;
                if (this.field_g < 0) {
                  this.field_g = param1;
                }
              }
              return;
            }
            this.field_g = 0;
            this.field_k = false;
          }
          if (param0 > 44) {
            if (this.field_b == 0) {
              if (e.field_f != 98 &&
                99 != e.field_f) {
                return;
              }
              this.field_k = false;
              if (this.field_g < 0) {
                this.field_g = param1;
              }
            }
            return;
          }
          this.d((byte) -58);
          if (this.field_b == 0) {
            if (e.field_f != 98 &&
              99 != e.field_f) {
              return;
            }
            this.field_k = false;
            if (this.field_g < 0) {
              this.field_g = param1;
            }
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (0 == this.field_b) {
          if (e.field_f != 97) {
            if (param0 <= 44) {
              this.d((byte) -58);
            }
            if (this.field_b == 0) {
              if (e.field_f != 98 &&
                99 != e.field_f) {
                return;
              }
              this.field_k = false;
              if (this.field_g < 0) {
                this.field_g = param1;
              }
            }
            return;
          }
          this.field_g = this.field_g + 1;
          if (this.field_g >= this.field_i) {
            this.field_g = 0;
            this.field_k = false;
            if (param0 <= 44) {
              this.d((byte) -58);
              if (this.field_b == 0) {
                if (e.field_f != 98 &&
                  99 != e.field_f) {
                  return;
                }
                this.field_k = false;
                if (this.field_g < 0) {
                  this.field_g = param1;
                }
              }
              return;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_k = false;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (param0 <= 44)) {
          this.d((byte) -58);
        }
        if (this.field_b != 0) {
          return;
        }
        if (e.field_f != 98 &&
          99 != e.field_f) {
          return;
        }
        this.field_k = false;
        if (this.field_g >= 0) {
          return;
        }
        this.field_g = param1;
    }

    final boolean e(byte param0) {
        int var2 = -109 % ((-67 - param0) / 33);
        return this.field_h == 102 ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 != -108) {
          this.field_i = -104;
          if (this.field_c != 2) {
            return this.field_h == 96 ? true : false;
          }
          return true;
        }
        if (this.field_c == 2) {
          return true;
        }
        if (this.field_h != 96) {
          return false;
        }
        return true;
    }

    final void b(boolean param0) {
        this.field_c = 0;
        this.field_h = 0;
        if (!param0) {
          this.field_k = false;
          this.field_e = 0;
          if (this.field_b == 0) {
            this.field_h = e.field_f;
            return;
          }
          return;
        }
        this.field_e = 0;
        if (this.field_b != 0) {
          return;
        }
        this.field_h = e.field_f;
    }

    final boolean b(int param0) {
        if (param0 < 81) {
          return true;
        }
        if (1 == this.field_c) {
          return true;
        }
        if (this.field_h == 97) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 == 7632) {
          return this.field_h == 97 ? true : false;
        }
        String var3 = (String) null;
        db.a((String) null, -6);
        return this.field_h == 97 ? true : false;
    }

    public static void d(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != -98) {
          String var2 = (String) null;
          db.a((String) null, 63);
        }
    }

    final boolean d(byte param0) {
        if (param0 == 106) {
          return this.field_h == 103 ? true : false;
        }
        this.field_g = 90;
        return this.field_h == 103 ? true : false;
    }

    final boolean a(byte param0) {
        if (param0 == -116) {
          return 0 != this.field_b ? true : false;
        }
        this.field_b = -116;
        return 0 != this.field_b ? true : false;
    }

    final void a(boolean param0, int param1, int param2) {
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.field_i <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_h = 0;
        this.field_e = 0;
        this.field_c = 0;
        if (ta.field_o == 0) {
          if (this.field_b != 0) {
            if (ul.field_d == 0) {
              if (ta.field_o == 0 &&
                0 == ul.field_d) {
                this.field_b = 0;
              }
              if (!param0) {
                return;
              }
              if (0 == this.field_b) {
                if (!this.field_k &&
                  !he.field_a) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_k) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_g = param1;
                    this.field_k = true;
                  } else {
                    this.field_g = param1;
                    this.field_k = true;
                  }
                }
              }
              return;
            }
            if (this.field_f <= 0) {
              this.field_f = bp.field_d;
              this.field_c = this.field_b;
            }
            this.field_f = this.field_f - 1;
          }
          if (ta.field_o == 0) {
            if (0 != ul.field_d) {
              if (!param0) {
                return;
              }
              if (0 == this.field_b) {
                if (!this.field_k &&
                  !he.field_a) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_k) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_g = param1;
                    this.field_k = true;
                  } else {
                    this.field_g = param1;
                    this.field_k = true;
                  }
                }
              }
              return;
            }
            this.field_b = 0;
          }
          if (!param0) {
            return;
          }
          if (0 != this.field_b) {
            return;
          }
          if (this.field_k) {
            if (param1 < 0) {
              if (!this.field_k) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_k = true;
            return;
          }
          if (!he.field_a) {
            return;
          }
          if (param1 < 0) {
            if (this.field_k) {
              this.field_g = -1;
            }
          } else {
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_k = true;
          }
          return;
        }
        this.field_b = ta.field_o;
        this.field_c = ta.field_o;
        this.field_e = ta.field_o;
        this.field_g = param2;
        this.field_f = cm.field_n;
        this.field_k = true;
        if (this.field_b != 0) {
          if (ul.field_d == 0) {
            if (ta.field_o != 0) {
              if (!param0) {
                return;
              }
              if (0 == this.field_b) {
                if (!this.field_k &&
                  !he.field_a) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_k) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_g = param1;
                    this.field_k = true;
                  } else {
                    this.field_g = param1;
                    this.field_k = true;
                  }
                }
              }
              return;
            }
            if (0 == ul.field_d) {
              this.field_b = 0;
            }
            if (!param0) {
              return;
            }
            if (0 != this.field_b) {
              return;
            }
            if (this.field_k) {
              if (param1 < 0) {
                if (this.field_k) {
                  this.field_g = -1;
                }
              } else {
                if (this.field_g == param1) {
                }
                this.field_g = param1;
                this.field_k = true;
              }
            } else {
              if (he.field_a) {
                if (param1 < 0) {
                  if (this.field_k) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                  }
                  this.field_g = param1;
                  this.field_k = true;
                }
              }
            }
            return;
          }
          if (this.field_f <= 0) {
            this.field_f = bp.field_d;
            this.field_c = this.field_b;
          }
          this.field_f = this.field_f - 1;
        }
        if (ta.field_o == 0) {
          if (0 != ul.field_d) {
            if (!param0) {
              return;
            }
            if (0 != this.field_b) {
              return;
            }
            if (!this.field_k &&
              !he.field_a) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_k) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_k = true;
            return;
          }
          this.field_b = 0;
        }
        if (!param0) {
          return;
        }
        if (0 != this.field_b) {
          return;
        }
        if (this.field_k) {
          if (param1 >= 0) {
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_k = true;
            return;
          }
          if (!this.field_k) {
            return;
          }
          this.field_g = -1;
        } else {
          if (he.field_a) {
            if (param1 < 0) {
              if (!this.field_k) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_k = true;
            return;
          }
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 != 31108) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 - 1 + var2_int] = param0.charAt(var4);
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("db.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, boolean param2, int param3) {
        int var5 = -25 / ((param1 + 9) / 58);
        this.field_k = param2 ? true : false;
        this.field_b = 0;
        if (!this.field_k) {
          this.field_g = param3;
          return;
        }
        this.field_g = param0;
    }

    final boolean c(byte param0) {
        if (param0 > 31) {
          return this.field_h == 96 ? true : false;
        }
        this.a(81);
        return this.field_h == 96 ? true : false;
    }

    db(int param0) {
        this.field_k = false;
        this.field_g = 0;
        this.field_i = param0;
    }

    static {
        field_d = "Loading graphics";
    }
}
