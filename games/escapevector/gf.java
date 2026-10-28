/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    int field_j;
    private int field_h;
    int field_k;
    private int field_i;
    static fd field_e;
    int field_m;
    private int field_c;
    private int field_l;
    private int field_d;
    private int field_f;
    static DraggableWidget field_b;
    static int field_a;
    int field_g;
    private boolean field_n;

    private final int a(int param0) {
        int var2 = mj.field_d >= this.field_l ? 0 : -mj.field_d + this.field_l;
        if (param0 < -40) {
          return var2;
        }
        return 14;
    }

    final static int a(byte param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        qk.field_g = null;
        NameSuggestionsPanel.field_I = null;
        ke.field_b = 0;
        int var2 = AgeValidator.field_n;
        AgeValidator.field_n = SeekerPulseStream.field_l;
        SeekerPulseStream.field_l = var2;
        if (param0 != -78) {
          String var4 = (String) null;
          gf.a((String) null, (byte) 43);
          SelfDestructEffects.field_j.field_g = SelfDestructEffects.field_j.field_g + 1;
          if (param1 == 51) {
            SelfDestructEffects.field_j.field_d = 2;
            if (SelfDestructEffects.field_j.field_g < 2) {
              if (SelfDestructEffects.field_j.field_g >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (SelfDestructEffects.field_j.field_g < 4) {
                return -1;
              }
              return 1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (SelfDestructEffects.field_j.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.field_g < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 50) {
            SelfDestructEffects.field_j.field_d = 5;
            if (SelfDestructEffects.field_j.field_g < 2) {
              if (SelfDestructEffects.field_j.field_g >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (SelfDestructEffects.field_j.field_g < 4) {
                return -1;
              }
              return 1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (SelfDestructEffects.field_j.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.field_g < 4) {
              return -1;
            }
            return 1;
          }
          SelfDestructEffects.field_j.field_d = 1;
          if (SelfDestructEffects.field_j.field_g < 2) {
            if (SelfDestructEffects.field_j.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (SelfDestructEffects.field_j.field_g >= 4) {
              return 1;
            }
            return -1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.field_g >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (SelfDestructEffects.field_j.field_g < 4) {
            return -1;
          }
          return 1;
        }
        SelfDestructEffects.field_j.field_g = SelfDestructEffects.field_j.field_g + 1;
        if (param1 == 51) {
          SelfDestructEffects.field_j.field_d = 2;
          if (SelfDestructEffects.field_j.field_g >= 2 &&
            param1 == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.field_g >= 2) {
            if (param1 != 50) {
              if (SelfDestructEffects.field_j.field_g >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (SelfDestructEffects.field_j.field_g >= 4) {
            return 1;
          }
          return -1;
        }
        if (param1 == 50) {
          SelfDestructEffects.field_j.field_d = 5;
          if (SelfDestructEffects.field_j.field_g >= 2 &&
            param1 == 51) {
            return 2;
          }
          if (SelfDestructEffects.field_j.field_g >= 2) {
            if (param1 != 50) {
              if (SelfDestructEffects.field_j.field_g >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (SelfDestructEffects.field_j.field_g >= 4) {
            return 1;
          }
          return -1;
        }
        SelfDestructEffects.field_j.field_d = 1;
        if (SelfDestructEffects.field_j.field_g >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (SelfDestructEffects.field_j.field_g >= 2) {
          if (param1 != 50) {
            if (SelfDestructEffects.field_j.field_g >= 4) {
              return 1;
            }
            return -1;
          }
          return 5;
        }
        if (SelfDestructEffects.field_j.field_g >= 4) {
          return 1;
        }
        return -1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_i = param3;
        if (param0 == 15135) {
          this.field_d = param1;
          this.field_f = param2;
          return;
        }
        this.field_k = 79;
        this.field_d = param1;
        this.field_f = param2;
    }

    private final int a(byte param0) {
        int var2 = this.a(-73);
        if (param0 == -57) {
          int var3 = this.field_l > var2 ? (-var2 + this.field_l) * this.field_h / this.field_l : 0;
          return var3;
        }
        this.field_h = 59;
        int var3Lifetime1 = this.field_l > var2 ? (-var2 + this.field_l) * this.field_h / this.field_l : 0;
        return var3Lifetime1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 <= -127) {
          this.a(15135, param4, param2, param0);
          this.field_h = param3;
          this.field_c = param1;
          this.field_n = true;
          return;
        }
        this.a(98, -122, -22, -60, -56, (byte) -128);
        this.a(15135, param4, param2, param0);
        this.field_h = param3;
        this.field_c = param1;
        this.field_n = true;
    }

    final static tg a(String param0, byte param1) {
        String stackIn_21_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (null == ml.field_a) {
            Object stackIn_3_0 = null;
            return (tg) (stackIn_3_0);
          }
          CharSequence var6 = (CharSequence) ((Object) param0);
          String var2 = sf.a(-104, var6);
          if (var2 == null) {
            var2 = param0;
          }
          tg var3 = (tg) (ml.field_a.a(-82, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              int var4 = -98 / ((param1 + 63) / 57);
              Object stackIn_17_0 = null;
              return (tg) (stackIn_17_0);
            }
            CharSequence var7 = (CharSequence) ((Object) var3.field_ob);
            String var4_ref_String = sf.a(-75, var7);
            if (var4_ref_String == null) {
              var4_ref_String = var3.field_ob;
            }
            if (!var4_ref_String.equals(var2)) {
              var3 = (tg) (ml.field_a.a((byte) -36));
              continue;
            }
            break;
          }
          tg stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var2_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("gf.F(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0) {
        int var2 = this.field_g + this.field_j;
        if (param0 < 32) {
          this.field_c = -56;
          int var3 = this.field_m + this.field_k;
          int var4 = this.a(-41);
          if (!this.field_n) {
            fc.a(var4, this.field_j, var2, var3, true, 29788, false, this.field_d, this.field_i, this.field_f, this.field_k, true);
            return;
          }
          int var5 = this.a((byte) -57);
          GameAppletShell.a(var5, this.field_j, this.field_k, this.field_i, this.field_f, var3, -3, var2, this.field_d, this.field_c, var4);
          return;
        }
        int var3Lifetime1 = this.field_m + this.field_k;
        int var4Lifetime1 = this.a(-41);
        if (!this.field_n) {
          fc.a(var4Lifetime1, this.field_j, var2, var3Lifetime1, true, 29788, false, this.field_d, this.field_i, this.field_f, this.field_k, true);
          return;
        }
        int var5Lifetime1 = this.a((byte) -57);
        GameAppletShell.a(var5Lifetime1, this.field_j, this.field_k, this.field_i, this.field_f, var3Lifetime1, -3, var2, this.field_d, this.field_c, var4Lifetime1);
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        if (guard != 12474) {
          field_a = -26;
          field_b = null;
          return;
        }
        field_b = null;
    }

    gf(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param1;
        this.field_j = param0;
        this.field_l = param4;
        this.field_g = param2;
        this.field_m = param3;
    }

    static {
    }
}
