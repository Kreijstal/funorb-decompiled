/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGame extends UiComponent {
    int field_Fc;
    boolean field_wc;
    int field_mc;
    UiComponent field_hc;
    int field_Yb;
    byte[] settings;
    String[] playerNames;
    UiComponent field_Lb;
    int field_ac;
    UiComponent field_jc;
    UiComponent field_cc;
    UiComponent field_xc;
    static boolean field_Ac;
    boolean field_Dc;
    UiComponent field_Rb;
    UiComponent field_nc;
    boolean field_ic;
    static int field_yc;
    UiComponent field_Sb;
    long field_Zb;
    String field_Ob;
    static int field_Pb;
    UiComponent field_Bc;
    static int field_vc;
    int field_Mb;
    UiComponent field_kc;
    boolean field_Xb;
    static int field_oc;
    int field_pc;
    UiComponent field_Tb;
    UiComponent field_Ec;
    UiComponent field_zc;
    static TableScene field_gc;
    static boolean[] field_rc;
    boolean field_Qb;
    UiComponent field_lc;
    boolean field_ec;
    long field_sc;
    boolean field_fc;
    UiComponent[] field_Ub;
    UiComponent field_Cc;
    int field_Nb;
    static int field_Gc;
    UiComponent field_dc;
    int field_qc;
    static UiComponent field_Vb;
    static int field_Wb;
    static int field_uc;

    final static short[] a(int param0, short[] param1, byte param2, CipherPacketBuffer param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        short[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 <= 88) {
            var8 = (CipherPacketBuffer) null;
            LobbyGame.a(8, (short[]) null, (byte) 40, (CipherPacketBuffer) null);
          }
          var4_int = param3.readBits(param0, 89);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param3.readBits(4, 45);
          var6 = (short)param3.readBits(16, 18);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param3.readBits(var5, 103));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          }
          stackIn_17_0 = (short[]) (param1);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void f(byte param0) {
        int var1;
        int var2;
        int var3;
        var3 = Pool.field_O;
        NetworkGameClient.field_z = false;
        ClientException.field_d = null;
        var1 = -42 % ((-1 - param0) / 38);
        if (!ro.field_e) {
          var2 = Js5Transport.field_l;
          if (var2 > 0) {
            if (1 == var2) {
              ClientException.field_d = DialRenderer.ticketingOneunread;
            } else {
              ClientException.field_d = AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(var2)}, -1, sa.ticketingXunread);
            }
            ClientException.field_d = aq.joinTextParts(-54, new CharSequence[]{(CharSequence) ((Object) ClientException.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) CacheEntry.ticketingGotowebsite)});
          }
          d.field_d.dismissDialog(17);
          DebugTuningSlider.d((byte) -126);
        } else {
          d.field_d.m((byte) -33);
        }
    }

    final boolean isUnindexed(int param0) {
        if (param0 != -14144) {
          field_Gc = -5;
        }
        return !this.d(param0 ^ -14186) ? true : false;
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_6_0 = false;
        if (param1 <= 18) {
          return false;
        }
        stackIn_6_0 = (param0 >= 48) && (57 >= param0);
        return stackIn_6_0;
    }

    LobbyGame(int param0) {
        super(0L, (UiComponent) null);
        this.settings = new byte[param0];
    }

    public static void releaseStatics(byte param0) {
        field_rc = null;
        field_gc = null;
        field_Vb = null;
        if (param0 != -124) {
          field_Vb = (UiComponent) null;
        }
    }

    final static boolean a(int param0, MeshBuilder param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        MeshBuilder stackIn_6_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pool.field_O;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0 == -3) {
                            statePc = 4;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                stackIn_3_0 = 1;
                                statePc = 3;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue scanLoop1;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    stackIn_6_0 = (MeshBuilder) (param1);
                    statePc = 6;
                    continue scanLoop1;
                }
                case 5: {
                    try {
                        stackIn_6_0 = (MeshBuilder) (param1);
                        statePc = 6;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue scanLoop1;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0.faceCount <= var3_int) {
                            /* Inlined CFG state: 17. */
                            {
                                stackIn_18_0 = 0;
                                statePc = 18;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 7. */
                            {
                                if (param1.field_Q == null) {
                                    statePc = 10;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 8. */
                                    {
                                        if (param1.field_Q[var3_int] == 2) {
                                            statePc = 16;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 9. */
                                            {
                                                statePc = 10;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue scanLoop1;
                    }
                }
                case 10: {
                    try {
                        if (param2 == param1.faceVertexA[var3_int]) {
                            statePc = 14;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                if (param2 == param1.faceVertexB[var3_int]) {
                                    statePc = 14;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 12. */
                                    {
                                        if (param2 != param1.faceVertexC[var3_int]) {
                                            statePc = 16;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 13. */
                                            {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue scanLoop1;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue scanLoop1;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3_int++;
                        statePc = 5;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_16) {
                        statePc = ((Object) stateCaught_16 instanceof RuntimeException ? 19 : -1);
                        if (statePc == -1) {
                            throw LobbyGame.<RuntimeException>$cfr$sneakyThrow(stateCaught_16);
                        }
                        caughtException = stateCaught_16;
                        continue scanLoop1;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var3);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("kh.F(").append(param0).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue scanLoop1;
                }
                case 20: {
                    stackIn_22_0 = stackIn_20_0;
                    stackIn_22_1 = stackIn_20_1;
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue scanLoop1;
                }
                case 21: {
                    stackIn_22_0 = stackIn_21_0;
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue scanLoop1;
                }
                case 22: {
                    throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static IndexedSprite a(int param0, int param1, byte param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -89 / ((-33 - param2) / 51);
          if (TextLineLayout.a(param1, param3, param0, (byte) 121)) {
            return KeyHandler.a((byte) -23);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("kh.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int getGameId(int param0) {
        if (param0 != 20872) {
          this.field_Dc = true;
        }
        return (int)this.a(-127);
    }

    final boolean comesBeforeGame(LobbyGame param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_25_0 = false;
        boolean stackIn_32_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_39_1 = 0;
        boolean stackIn_44_0 = false;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_67_0 = false;
        boolean stackIn_71_0 = false;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param1) {
            this.field_Zb = 52L;
          }
          if (!this.field_Xb) {
            stackIn_8_0 = (6 == this.field_Fc) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var3_int = stackIn_8_0;
          if (!param0.field_Xb) {
            stackIn_14_0 = (param0.field_Fc == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          stackIn_17_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_17_0 == var3_int) {
            stackIn_19_0 = var3_int;
            return stackIn_19_0 != 0;
          }
          if (var3_int == 0) {
            if (this.field_ic != param0.field_ic) {
              stackIn_25_0 = this.field_ic;
              return stackIn_25_0;
            }
            if (this.field_ic &&
              this.field_ac != param0.field_ac) {
              stackIn_32_0 = !(this.field_ac >= param0.field_ac);
              return stackIn_32_0;
            }
          }
          stackIn_36_0 = (param0.field_ec) ? 0 : 1;
          if (this.field_ec) {
            stackIn_39_1 = 0;
          } else {
            stackIn_39_1 = 1;
          }
          if (stackIn_36_0 != stackIn_39_1) {
            stackIn_44_0 = !(this.field_ec);
            return stackIn_44_0;
          }
          if (!this.field_ec) {
            stackIn_71_0 = !(this.field_sc >= param0.field_sc);
            return stackIn_71_0;
          }
          if (this.field_Dc) {
            stackIn_52_0 = 1;
          } else {
            stackIn_52_0 = (2 == this.field_Yb) ? 1 : 0;
          }
          var5 = stackIn_52_0;
          if (!param0.field_Dc) {
            stackIn_58_0 = (2 == param0.field_Yb) ? 1 : 0;
          } else {
            stackIn_58_0 = 1;
          }
          var6 = stackIn_58_0;
          stackIn_61_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_61_0 != var5) {
            stackIn_67_0 = !(this.field_sc <= param0.field_sc);
            return stackIn_67_0;
          }
          stackIn_63_0 = var5;
          return stackIn_63_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("kh.E(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, TextLineLayout param1, int param2, int param3, BitmapFont param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          var5_int = 0;
          if (param2 != 6110) {
            LobbyGame.releaseStatics((byte) -86);
          }
          var6 = -1;
          for (var7 = 1; param0.length() > var7; var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param1.caretXs[0] + param4.b(param0.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param1.caretXs[var7] = param1.caretXs[0] + (var5_int >> 8) + param4.b(param0.substring(0, 1 + var7)) - param4.measureCharacterAdvance((char) var8);
            } else {
              param1.caretXs[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("kh.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_vc = 450;
        field_oc = 4;
        field_Pb = 200;
        field_Gc = -1;
        field_Vb = null;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
