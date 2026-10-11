/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ab {
    private he field_O;
    private String field_M;
    private hl field_K;
    private int field_N;
    static int field_L;
    static String field_J;
    static hl[] field_I;

    pa(he param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, lb.b((byte) -127));
        try {
          this.field_M = param1;
          this.field_O = param0;
          this.a(param2, param4, (byte) 125, param5, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(ue param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -206) {
            field_J = (String) null;
          }
          stackIn_3_0 = param0.a(29741);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 == -200) {
          field_I = null;
          field_J = null;
          return;
        }
        ue var2 = (ue) null;
        pa.a((ue) null, 119);
        field_I = null;
        field_J = null;
    }

    final void a(int param0, int param1, uj param2, int param3) {
        this.field_N = this.field_N + 1;
        if (param0 < 27) {
          return;
        }
        try {
          super.a(84, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static char a(char param0, int param1) {
        int var2;
        if (param1 > -76) {
          return '\001';
        }
        var2 = param0;
        if (32 != var2) {
          if (160 == var2) {
            return '_';
          }
          if (95 != var2) {
            if (var2 == 45) {
              return '_';
            }
            if (var2 == 91) {
              return param0;
            }
            if (93 == var2) {
              return param0;
            }
            if (var2 == 35) {
              return param0;
            }
            if (var2 != 224 &&
              var2 != 225) {
              if (var2 == 226) {
                return 'a';
              }
              if (var2 != 228 &&
                227 != var2 &&
                var2 != 192 &&
                var2 != 193) {
                if (194 == var2) {
                  return 'a';
                }
                if (var2 == 196) {
                  return 'a';
                }
                if (var2 == 195) {
                  return 'a';
                }
                if (var2 != 232 &&
                  var2 != 233) {
                  if (234 == var2) {
                    return 'e';
                  }
                  if (235 != var2 &&
                    var2 != 200 &&
                    201 != var2) {
                    if (var2 == 202) {
                      return 'e';
                    }
                    if (var2 != 203) {
                      if (var2 == 237) {
                        return 'i';
                      }
                      if (238 == var2) {
                        return 'i';
                      }
                      if (var2 == 239) {
                        return 'i';
                      }
                      if (var2 != 205 &&
                        var2 != 206) {
                        if (var2 == 207) {
                          return 'i';
                        }
                        if (var2 == 242) {
                          return 'o';
                        }
                        if (243 == var2) {
                          return 'o';
                        }
                        if (244 == var2) {
                          return 'o';
                        }
                        if (var2 == 246) {
                          return 'o';
                        }
                        if (var2 == 245) {
                          return 'o';
                        }
                        if (var2 == 210) {
                          return 'o';
                        }
                        if (var2 == 211) {
                          return 'o';
                        }
                        if (212 == var2) {
                          return 'o';
                        }
                        if (var2 == 214) {
                          return 'o';
                        }
                        if (213 == var2) {
                          return 'o';
                        }
                        if (var2 == 249) {
                          return 'u';
                        }
                        if (var2 == 250) {
                          return 'u';
                        }
                        if (var2 == 251) {
                          return 'u';
                        }
                        if (var2 == 252) {
                          return 'u';
                        }
                        if (var2 == 217) {
                          return 'u';
                        }
                        if (var2 == 218) {
                          return 'u';
                        }
                        if (var2 == 219) {
                          return 'u';
                        }
                        if (var2 == 220) {
                          return 'u';
                        }
                        if (var2 == 231) {
                          return 'c';
                        }
                        if (var2 == 199) {
                          return 'c';
                        }
                        if (var2 == 255) {
                          return 'y';
                        }
                        if (376 == var2) {
                          return 'y';
                        }
                        if (var2 == 241) {
                          return 'n';
                        }
                        if (var2 == 209) {
                          return 'n';
                        }
                        if (var2 == 223) {
                          return 'b';
                        }
                        return Character.toLowerCase(param0);
                      }
                      return 'i';
                    }
                  }
                }
                return 'e';
              }
            }
            return 'a';
          }
        }
        return '_';
    }

    final String d(int param0) {
        if (param0 == 12606) {
          return null;
        }
        this.field_N = 74;
        return null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        p var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        hl var19;
        hl var20;
        Object var22;
        Object var26;
        Object var31;
        lg var35;
        String var5;
        int var11;
        int var12;
        hl var16;
        hl var21;
        hl var23;
        hl var24;
        hl var25;
        hl var27;
        hl var28;
        hl var29;
        hl var30;
        hl var32;
        hl var33;
        hl var34;
        lg var36;
        lg var37;
        lg var38;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var9Lifetime3;
        int var10Lifetime3;
        int var11Lifetime4;
        int var12Lifetime4;
        p var6Lifetime1;
        p var6Lifetime2;
        var18 = null;
        var22 = null;
        var26 = null;
        var31 = null;
        var13 = StarCannon.field_A;
        var6 = this.field_O.b((byte) -121);
        if (var6 == cg.field_g) {
          var17 = dh.field_b;
          if (!var17.equals(this.field_k)) {
            this.field_k = var17;
            this.f((byte) 114);
            super.a(param0, param1, param2, param3);
            var6 = this.field_O.b((byte) -127);
            var35 = (lg) ((Object) this.field_o);
            var9 = this.field_s + param1;
            var10 = var35.a((byte) -95, (uj) (this), param3) + (var35.a((uj) (this), (byte) -38).a(param2 - 169) >> 1);
            if (var6 != cg.field_g &&
              cd.field_a != var6) {
              if (var6 == sb.field_n) {
                var20 = fi.field_g[2];
                var20.f(var9, var10 - (var20.field_v >> 1), 256);
                return;
              }
              if (bf.field_x != var6) {
                return;
              }
              var19 = fi.field_g[1];
              var19.f(var9, var10 - (var19.field_v >> 1), 256);
              return;
            }
            var21 = fi.field_g[0];
            var11 = var21.field_x << 1;
            var12 = var21.field_q << 1;
            if (this.field_K != null &&
              var11 <= this.field_K.field_u &&
              var12 <= this.field_K.field_v) {
              bc.a(this.field_K, 26095);
              ki.b();
            } else {
              this.field_K = new hl(var11, var12);
              bc.a(this.field_K, 26095);
            }
            var21.b(112, 144, var21.field_x << 4, var21.field_q << 4, -this.field_N << 10, 4096);
            wf.a(-85);
            this.field_K.f(var9 - (var21.field_x >> 1), var10 - var21.field_q, 256);
            return;
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_O.b((byte) -127);
          var36 = (lg) ((Object) this.field_o);
          var9Lifetime3 = this.field_s + param1;
          var10Lifetime3 = var36.a((byte) -95, (uj) (this), param3) + (var36.a((uj) (this), (byte) -38).a(param2 - 169) >> 1);
          if (var6 != cg.field_g &&
            cd.field_a != var6) {
            if (var6 == sb.field_n) {
              var24 = fi.field_g[2];
              var24.f(var9Lifetime3, var10Lifetime3 - (var24.field_v >> 1), 256);
              return;
            }
            if (bf.field_x != var6) {
              return;
            }
            var23 = fi.field_g[1];
            var23.f(var9Lifetime3, var10Lifetime3 - (var23.field_v >> 1), 256);
            return;
          }
          var25 = fi.field_g[0];
          var11Lifetime4 = var25.field_x << 1;
          var12Lifetime4 = var25.field_q << 1;
          if (this.field_K == null) {
            this.field_K = new hl(var11Lifetime4, var12Lifetime4);
            bc.a(this.field_K, 26095);
          } else {
            if (var11Lifetime4 > this.field_K.field_u) {
              this.field_K = new hl(var11Lifetime4, var12Lifetime4);
              bc.a(this.field_K, 26095);
            } else {
              if (var12Lifetime4 > this.field_K.field_v) {
                this.field_K = new hl(var11Lifetime4, var12Lifetime4);
                bc.a(this.field_K, 26095);
              } else {
                bc.a(this.field_K, 26095);
                ki.b();
              }
            }
          }
          var25.b(112, 144, var25.field_x << 4, var25.field_q << 4, -this.field_N << 10, 4096);
          wf.a(-85);
          this.field_K.f(var9Lifetime3 - (var25.field_x >> 1), var10Lifetime3 - var25.field_q, 256);
          return;
        }
        if (cd.field_a != var6) {
          var5 = this.field_O.a(26162);
          if (var5 == null) {
            var5 = this.field_M;
          }
        } else {
          var5 = dh.field_b;
        }
        if (var5.equals(this.field_k)) {
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_O.b((byte) -127);
          var38 = (lg) ((Object) this.field_o);
          var9Lifetime1 = this.field_s + param1;
          var10Lifetime1 = var38.a((byte) -95, (uj) (this), param3) + (var38.a((uj) (this), (byte) -38).a(param2 - 169) >> 1);
          if (var6Lifetime1 != cg.field_g &&
            cd.field_a != var6Lifetime1) {
            if (var6Lifetime1 == sb.field_n) {
              var33 = fi.field_g[2];
              var33.f(var9Lifetime1, var10Lifetime1 - (var33.field_v >> 1), 256);
              return;
            }
            if (bf.field_x != var6Lifetime1) {
              return;
            }
            var32 = fi.field_g[1];
            var32.f(var9Lifetime1, var10Lifetime1 - (var32.field_v >> 1), 256);
            return;
          }
          var34 = fi.field_g[0];
          var11Lifetime1 = var34.field_x << 1;
          var12Lifetime1 = var34.field_q << 1;
          if (this.field_K == null) {
            this.field_K = new hl(var11Lifetime1, var12Lifetime1);
            bc.a(this.field_K, 26095);
          } else {
            if (var11Lifetime1 > this.field_K.field_u) {
              this.field_K = new hl(var11Lifetime1, var12Lifetime1);
              bc.a(this.field_K, 26095);
            } else {
              if (var12Lifetime1 > this.field_K.field_v) {
                this.field_K = new hl(var11Lifetime1, var12Lifetime1);
                bc.a(this.field_K, 26095);
              } else {
                bc.a(this.field_K, 26095);
                ki.b();
              }
            }
          }
          var34.b(112, 144, var34.field_x << 4, var34.field_q << 4, -this.field_N << 10, 4096);
          wf.a(-85);
          this.field_K.f(var9Lifetime1 - (var34.field_x >> 1), var10Lifetime1 - var34.field_q, 256);
          return;
        }
        this.field_k = var5;
        this.f((byte) 114);
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_O.b((byte) -127);
        var37 = (lg) ((Object) this.field_o);
        var9Lifetime2 = this.field_s + param1;
        var10Lifetime2 = var37.a((byte) -95, (uj) (this), param3) + (var37.a((uj) (this), (byte) -38).a(param2 - 169) >> 1);
        if (var6Lifetime2 == cg.field_g) {
          var27 = fi.field_g[0];
          var11Lifetime2 = var27.field_x << 1;
          var12Lifetime2 = var27.field_q << 1;
          if (this.field_K != null &&
            var11Lifetime2 <= this.field_K.field_u &&
            var12Lifetime2 <= this.field_K.field_v) {
            bc.a(this.field_K, 26095);
            ki.b();
          } else {
            this.field_K = new hl(var11Lifetime2, var12Lifetime2);
            bc.a(this.field_K, 26095);
          }
          var27.b(112, 144, var27.field_x << 4, var27.field_q << 4, -this.field_N << 10, 4096);
          wf.a(-85);
          this.field_K.f(var9Lifetime2 - (var27.field_x >> 1), var10Lifetime2 - var27.field_q, 256);
          return;
        }
        if (cd.field_a != var6Lifetime2) {
          if (var6Lifetime2 == sb.field_n) {
            var29 = fi.field_g[2];
            var29.f(var9Lifetime2, var10Lifetime2 - (var29.field_v >> 1), 256);
            return;
          }
          if (bf.field_x != var6Lifetime2) {
            return;
          }
          var28 = fi.field_g[1];
          var28.f(var9Lifetime2, var10Lifetime2 - (var28.field_v >> 1), 256);
          return;
        }
        var30 = fi.field_g[0];
        var16 = var30;
        var11Lifetime3 = var30.field_x << 1;
        var12Lifetime3 = var30.field_q << 1;
        if (this.field_K == null) {
          this.field_K = new hl(var11Lifetime3, var12Lifetime3);
          bc.a(this.field_K, 26095);
        } else {
          if (var11Lifetime3 > this.field_K.field_u) {
            this.field_K = new hl(var11Lifetime3, var12Lifetime3);
            bc.a(this.field_K, 26095);
          } else {
            if (var12Lifetime3 <= this.field_K.field_v) {
              bc.a(this.field_K, 26095);
              ki.b();
            } else {
              this.field_K = new hl(var11Lifetime3, var12Lifetime3);
              bc.a(this.field_K, 26095);
            }
          }
        }
        var30.b(112, 144, var30.field_x << 4, var30.field_q << 4, -this.field_N << 10, 4096);
        wf.a(-85);
        this.field_K.f(var9Lifetime2 - (var30.field_x >> 1), var10Lifetime2 - var30.field_q, 256);
        return;
    }

    final static void b(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param1 != -31155) {
                field_J = (String) null;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pa.E(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_J = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pa.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_J = "Loading...";
        field_L = 0;
    }
}
