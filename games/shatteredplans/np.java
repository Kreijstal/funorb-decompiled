/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    static int field_j;
    private int field_k;
    private int field_g;
    private int field_i;
    private int field_n;
    static fb field_a;
    int field_b;
    private boolean field_e;
    static int field_o;
    static String field_l;
    static int[] field_f;
    int field_c;
    private int field_h;
    static String field_d;
    static boolean field_m;

    final boolean d(int param0) {
        if (param0 != -1) {
          this.field_h = 80;
          if (this.field_h != 0) {
            return true;
          }
          if (84 != this.field_i) {
            return this.field_i == 83 ? true : false;
          }
          return true;
        }
        if (this.field_h != 0) {
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

    final void e(int param0) {
        this.field_h = 0;
        this.field_g = 0;
        this.field_i = 0;
        if (param0 <= 2) {
          return;
        }
        if (0 == this.field_n) {
          this.field_i = oq.field_j;
        }
        if (0 == this.field_n &&
          96 == oq.field_j) {
          if (this.field_c <= 0) {
            this.field_c = this.field_b;
          }
          this.field_e = false;
          this.field_c = this.field_c - 1;
        }
        if (0 != this.field_n) {
          return;
        }
        if (97 != oq.field_j) {
          return;
        }
        this.field_c = this.field_c + 1;
        if (this.field_c >= this.field_b) {
          this.field_c = 0;
        }
        this.field_e = false;
    }

    final void b(int param0) {
        this.field_i = param0;
        this.field_h = 0;
        this.field_g = 0;
        if (0 == this.field_n &&
          oq.field_j == 98) {
          if (this.field_c <= 0) {
            this.field_c = this.field_b;
          }
          this.field_e = false;
          this.field_c = this.field_c - 1;
        }
        if (this.field_n == 0) {
          this.field_i = oq.field_j;
        }
        if (this.field_n != 0) {
          return;
        }
        if (99 != oq.field_j) {
          return;
        }
        this.field_c = this.field_c + 1;
        this.field_e = false;
        if (this.field_b > this.field_c) {
          return;
        }
        this.field_c = 0;
    }

    final boolean a(int param0) {
        if (param0 == -1) {
          return 102 == this.field_i ? true : false;
        }
        this.a(126);
        return 102 == this.field_i ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != -97) {
          return true;
        }
        return this.field_i == 96 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 >= -38) {
          return false;
        }
        return 97 == this.field_i ? true : false;
    }

    public static void b(boolean param0) {
        field_l = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (!param0) {
          java.net.URL var2 = (java.net.URL) null;
          np.a((String) null, -42, (String) null, true, (java.net.URL) null);
        }
    }

    final boolean b(byte param0) {
        if (param0 < -34) {
          return this.field_n != 0 ? true : false;
        }
        this.field_b = 69;
        return this.field_n != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_b <= param2) {
          throw new IllegalArgumentException();
        }
        if (this.field_b <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_h = 0;
        this.field_i = 0;
        this.field_g = 0;
        if (0 == je.field_d) {
          if (~this.field_n != param0 &&
            0 != rf.field_n) {
            if (0 >= this.field_k) {
              this.field_k = eo.field_Y;
              this.field_h = this.field_n;
              this.field_k = this.field_k - 1;
              if (je.field_d == 0 &&
                0 == rf.field_n) {
                this.field_n = 0;
              }
              if (this.field_n == 0) {
                if (!this.field_e &&
                  !r.field_d) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_e) {
                    this.field_c = -1;
                  }
                } else {
                  if (param2 != this.field_c) {
                    this.field_c = param2;
                    this.field_e = true;
                  } else {
                    this.field_c = param2;
                    this.field_e = true;
                  }
                }
              }
              return;
            }
            this.field_k = this.field_k - 1;
          }
          if (je.field_d == 0) {
            if (0 != rf.field_n) {
              if (this.field_n == 0) {
                if (!this.field_e &&
                  !r.field_d) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_e) {
                    this.field_c = -1;
                  }
                } else {
                  if (param2 != this.field_c) {
                    this.field_c = param2;
                    this.field_e = true;
                  } else {
                    this.field_c = param2;
                    this.field_e = true;
                  }
                }
              }
              return;
            }
            this.field_n = 0;
          }
          if (this.field_n != 0) {
            return;
          }
          if (this.field_e) {
            if (param2 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_c = -1;
              return;
            }
            if (param2 != this.field_c) {
            }
            this.field_c = param2;
            this.field_e = true;
            return;
          }
          if (!r.field_d) {
            return;
          }
          if (param2 < 0) {
            if (this.field_e) {
              this.field_c = -1;
            }
          } else {
            if (param2 != this.field_c) {
            }
            this.field_c = param2;
            this.field_e = true;
          }
          return;
        }
        this.field_k = ne.field_j;
        this.field_c = param1;
        this.field_h = je.field_d;
        this.field_g = je.field_d;
        this.field_n = je.field_d;
        this.field_e = true;
        if (~this.field_n == param0) {
          if (je.field_d == 0) {
            if (0 != rf.field_n) {
              if (this.field_n == 0) {
                if (!this.field_e &&
                  !r.field_d) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_e) {
                    this.field_c = -1;
                  }
                } else {
                  if (param2 != this.field_c) {
                    this.field_c = param2;
                    this.field_e = true;
                  } else {
                    this.field_c = param2;
                    this.field_e = true;
                  }
                }
              }
              return;
            }
            this.field_n = 0;
          }
          if (this.field_n != 0) {
            return;
          }
          if (this.field_e) {
            if (param2 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_c = -1;
              return;
            }
            if (param2 != this.field_c) {
            }
            this.field_c = param2;
            this.field_e = true;
            return;
          }
          if (!r.field_d) {
            return;
          }
          if (param2 < 0) {
            if (this.field_e) {
              this.field_c = -1;
            }
          } else {
            if (param2 != this.field_c) {
            }
            this.field_c = param2;
            this.field_e = true;
          }
          return;
        }
        if (0 == rf.field_n) {
          boolean decompiledFrameRemainder0 = true;
          if (je.field_d == 0) {
            if (0 != rf.field_n) {
              if (this.field_n != 0) {
                return;
              }
              if (!this.field_e &&
                !r.field_d) {
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
            if (!this.field_e &&
              !r.field_d) {
              return;
            }
          }
          if (param2 < 0) {
            if (!this.field_e) {
              return;
            }
            this.field_c = -1;
            return;
          }
          if (param2 != this.field_c) {
          }
          this.field_c = param2;
          this.field_e = true;
          return;
        }
        if (0 >= this.field_k) {
          this.field_k = eo.field_Y;
          this.field_h = this.field_n;
          this.field_k = this.field_k - 1;
          if (je.field_d != 0) {
            if (this.field_n == 0) {
              if (!this.field_e &&
                !r.field_d) {
                return;
              }
              if (param2 < 0) {
                if (this.field_e) {
                  this.field_c = -1;
                }
              } else {
                if (param2 != this.field_c) {
                  this.field_c = param2;
                  this.field_e = true;
                } else {
                  this.field_c = param2;
                  this.field_e = true;
                }
              }
            }
            return;
          }
          if (0 == rf.field_n) {
            this.field_n = 0;
          }
          if (this.field_n == 0) {
            if (!this.field_e &&
              !r.field_d) {
              return;
            }
            if (param2 < 0) {
              if (this.field_e) {
                this.field_c = -1;
              }
            } else {
              if (param2 != this.field_c) {
                this.field_c = param2;
                this.field_e = true;
              } else {
                this.field_c = param2;
                this.field_e = true;
              }
            }
          }
          return;
        }
        this.field_k = this.field_k - 1;
        if (je.field_d == 0) {
          if (0 != rf.field_n) {
            if (this.field_n == 0) {
              if (!this.field_e &&
                !r.field_d) {
                return;
              }
              if (param2 >= 0) {
                if (param2 != this.field_c) {
                  this.field_c = param2;
                  this.field_e = true;
                  return;
                }
                this.field_c = param2;
                this.field_e = true;
                return;
              }
              if (!this.field_e) {
                return;
              }
              this.field_c = -1;
            }
            return;
          }
          this.field_n = 0;
        }
        if (this.field_n == 0) {
          if (this.field_e) {
            if (param2 >= 0) {
              if (param2 != this.field_c) {
              }
              this.field_c = param2;
              this.field_e = true;
              return;
            }
            if (!this.field_e) {
              return;
            }
            this.field_c = -1;
          } else {
            if (r.field_d) {
              if (param2 < 0) {
                if (!this.field_e) {
                  return;
                }
                this.field_c = -1;
                return;
              }
              if (param2 != this.field_c) {
              }
              this.field_c = param2;
              this.field_e = true;
              return;
            }
          }
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, boolean param3, java.net.URL param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_44_0 = null;
          java.net.URL stackIn_46_0 = null;
          RuntimeException stackIn_49_0 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          StringBuilder stackIn_55_1 = null;
          String stackIn_56_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var5 = param4.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                decompiledFrameRemainder0 = !(var7_int >= 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((0 <= var7_int) &&
                    (decompiledFrameRemainder0 = (param0 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param1 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param1));
                  }
                  if (param0 != null &&
                    param0.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param0);
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param2);
                  }
                  if (var5.length() > var6) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  if (param3) {
                    field_d = (String) null;
                  }
                  try {
                    stackIn_44_0 = new java.net.URL(param4, var7.toString());
                    return stackIn_44_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_46_0 = (java.net.URL) (param4);
                    return stackIn_46_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_49_0 = var5_ref;
            stackIn_49_1 = new StringBuilder().append("np.G(");
            if (param0 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_56_2 = "null";
            } else {
              stackIn_56_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 31 % ((param3 - 0) / 42);
        this.field_n = 0;
        this.field_e = param2 ? true : false;
        if (!this.field_e) {
          this.field_c = param1;
          return;
        }
        this.field_c = param0;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_i == 103 ? true : false;
        }
        field_f = (int[]) null;
        return this.field_i == 103 ? true : false;
    }

    final boolean a(byte param0) {
        int var2 = -16 / ((param0 - 2) / 34);
        if (this.field_g != 0) {
          return true;
        }
        if (this.field_i == 84) {
          return true;
        }
        if (this.field_i != 83) {
          return false;
        }
        return true;
    }

    np(int param0) {
        this.field_e = false;
        this.field_c = 0;
        this.field_b = param0;
    }

    static {
        field_l = "Opposing fleets destroyed.";
        field_o = 5;
        field_d = "Skip Intro";
    }
}
