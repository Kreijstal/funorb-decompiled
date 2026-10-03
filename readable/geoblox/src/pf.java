/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf extends ee implements ga, pl {
    private String field_L;
    static ResourceArchive field_O;
    private dj field_P;
    private boolean field_C;
    private hk field_G;
    private static gk field_K;
    static boolean field_D;
    private boolean field_I;
    private hk field_M;
    private dj field_J;
    private hk field_E;
    static String js5CrcErrorText;
    private boolean field_N;

    final static boolean a(int param0, char param1) {
        PacketBuffer var3;
        boolean stackIn_13_0 = false;
        if (param0 != -123) {
          var3 = (PacketBuffer) null;
          pf.a(-108, (PacketBuffer) null);
        }
        if (!((param1 >= 48) &&
              (param1 <= 57)) &&
            !((param1 >= 65) &&
              (param1 <= 90)) &&
            !((param1 >= 97) &&
              (param1 <= 122))) {
          stackIn_13_0 = false;
        } else {
          stackIn_13_0 = true;
        }
        return stackIn_13_0;
    }

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ea var4_ref_ea = null;
        se var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        PacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            var9 = eh.field_d;
            var2 = var9.readUnsignedByte((byte) 34);
            var3 = var9.readUnsignedByte((byte) 34);
            if (0 == var2) {
              var4_ref_ea = (ea) ((Object) ea.field_g.firstForIteration(0));
              if (var4_ref_ea == null) {
                Bzip2DecoderState.a((byte) -116);
                return;
              }
              var5_int = -var9.position + p.field_k;
              var11 = var4_ref_ea.field_h;
              var10 = var11;
              var6 = var10;
              if (var5_int > var11.length << 2) {
                var5_int = var11.length << 2;
              }
              for (var7 = 0; var5_int > var7; var7++) {
                var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte((byte) 34) << cd.andInt(var7 << 8, 768));
              }
              var4_ref_ea.unlinkNode(false);
              break L0;
            }
            if (var2 == 1) {
              var4 = var9.readSignedSmart(76);
              var5 = (se) ((Object) sj.field_g.firstForIteration(0));
              while (true) {
                if (var5 != null) {
                  if (!((var5.field_g == var3) &&
                      (var5.field_j == var4))) {
                    var5 = (se) ((Object) sj.field_g.nextForIteration(1));
                    continue;
                  }
                }
                if (var5 != null) {
                  var5.unlinkNode(false);
                  break L0;
                }
                Bzip2DecoderState.a((byte) -116);
                return;
              }
            }
            gi.a((Throwable) null, "LR1: " + og.e(55), (byte) 125);
            Bzip2DecoderState.a((byte) -123);
          }
          if (param0 >= -95) {
            field_O = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "pf.K(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        js5CrcErrorText = null;
        field_K = null;
        field_O = null;
        if (param0 >= -18) {
            pf.a((byte) -108);
        }
    }

    public final void a(dj param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_J) {
            this.field_P.a((byte) -69, (el) (this));
          }
          if (this.field_P == param0) {
            this.g(param1 ^ -18649);
          }
          if (param1 != -18649) {
            field_O = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);
          stackIn_10_1 = new StringBuilder().append("pf.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        dj var3 = null;
        String var4 = null;
        try {
            var3 = this.field_J;
            var4 = param0;
            var3.a(param1 ^ 2, var4, false);
            if (param1 != 0) {
                this.i(114);
            }
            this.field_P.i((byte) 110);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(this.field_L == null)) {
            ng.field_F.drawParagraph(this.field_L, this.field_v + param0 + 20, 15 + this.field_m + param1, -40 + this.field_r, this.field_h, 16777215, -1, 1, 0, ng.field_F.maxAscent);
        }
        if (null != this.field_M) {
            SoftwareRasterizer.drawHorizontalLine(10 + param0, 134 + param1, -20 + this.field_r, 4210752);
        }
        int var5 = 20 / ((param2 - 1) / 43);
        super.a(param0, param1, (byte) -48, param3);
    }

    public final void a(dj param0, byte param1) {
        try {
            if (param1 != 74) {
                js5CrcErrorText = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pf.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.a(7305, param3);
            return stackIn_5_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param3, -109);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("pf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String h(int param0) {
        if (null == this.field_J.field_s) {
            return "";
        }
        if (param0 < 62) {
            el var3 = (el) null;
            this.a(28, 70, '"', (el) null);
        }
        return this.field_J.field_s;
    }

    final static int a(int param0, int param1, mb param2, mb param3, String param4, boolean param5, int param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        ByteArrayBuffer stackIn_9_0 = null;
        String stackIn_10_1 = null;
        ByteArrayBuffer stackIn_12_0 = null;
        String stackIn_13_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        String var13 = null;
        CharSequence var14 = null;
        try {
          var13 = param2.b(16925);
          var8 = param3.b(16925);
          if ((oc.field_e == null) &&
              (!w.a(false, 52))) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (gi.field_d == PacketBuffer.field_l) {
            fj.field_q.position = 0;
            fi.field_b = null;
            if (param4 != null) {
              var9 = 0;
              fc.field_d.position = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              fc.field_d.writeIntBE((byte) 95, bh.field_d.nextInt());
              fc.field_d.writeIntBE((byte) 95, bh.field_d.nextInt());
              fc.field_d.writeZeroPrefixedNullTerminatedText(var13, (byte) -126);
              fc.field_d.writeZeroPrefixedNullTerminatedText(var8, (byte) -126);
              var14 = (CharSequence) ((Object) param4);
              fc.field_d.writeZeroPrefixedNullTerminatedText(sl.a(var14, 48), (byte) -126);
              fc.field_d.writeShortBE(param0, 28695);
              fc.field_d.writeByte((byte) -94, param1);
              fc.field_d.writeByte((byte) 123, var9);
              fj.field_q.writeByte((byte) 127, 18);
              fj.field_q.position = fj.field_q.position + 2;
              var10 = fj.field_q.position;
              var11_ref_String = s.a(-1, k.c(105));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              fj.field_q.writeNullTerminatedText(var11_ref_String, 0);
              el.a(false, fc.field_d, fj.field_q, ld.field_c, InstrumentPatch.field_l);
              fj.field_q.backpatchLengthShortBE(-var10 + fj.field_q.position, true);
            } else {
              fc.field_d.position = 0;
              fc.field_d.writeIntBE((byte) 95, bh.field_d.nextInt());
              fc.field_d.writeIntBE((byte) 95, bh.field_d.nextInt());
              stackIn_9_0 = fc.field_d;
              if (!param2.a((byte) 97)) {
                stackIn_10_1 = "";
              } else {
                stackIn_10_1 = (String) (var13);
              }
              ((ByteArrayBuffer) (Object) stackIn_9_0).writeZeroPrefixedNullTerminatedText(stackIn_10_1, (byte) -126);
              stackIn_12_0 = fc.field_d;
              if (!param3.a((byte) 126)) {
                stackIn_13_1 = "";
              } else {
                stackIn_13_1 = (String) (var8);
              }
              ((ByteArrayBuffer) (Object) stackIn_12_0).writeZeroPrefixedNullTerminatedText(stackIn_13_1, (byte) -126);
              fj.field_q.writeByte((byte) 124, 16);
              fj.field_q.position = fj.field_q.position + 1;
              var9 = fj.field_q.position;
              el.a(false, fc.field_d, fj.field_q, ld.field_c, InstrumentPatch.field_l);
              fj.field_q.backpatchLengthByte(11700, fj.field_q.position - var9);
            }
            cm.a(-1, -1);
            PacketBuffer.field_l = field_K;
          }
          L7: {
            if ((field_K == PacketBuffer.field_l) &&
                (el.b(30000, 1))) {
              var9 = eh.field_d.readUnsignedByte((byte) 34);
              eh.field_d.position = 0;
              if ((var9 >= 100) &&
                  (var9 <= 105)) {
                PacketBuffer.field_l = v.field_l;
                si.field_i = new String[var9 - 100];
                break L7;
              }
              if (var9 == 248) {
                sj.a(k.c(124), (byte) 123);
                kh.field_a = ph.createUnableText;
                Bzip2DecoderState.a((byte) -124);
                ck.field_e = false;
                stackIn_31_0 = var9;
                return stackIn_31_0;
              }
              if (99 != var9) {
                PacketBuffer.field_l = qh.field_F;
                p.field_k = -1;
                ScorePopup.field_l = var9;
              } else {
                el.b(30000, DualLinkNode.d(112));
                fi.field_b = new Boolean(Bzip2DecoderState.a(eh.field_d, 0));
                eh.field_d.position = 0;
              }
            }
          }
          if (PacketBuffer.field_l == v.field_l) {
            var9 = 2;
            if (el.b(30000, var9)) {
              var10 = eh.field_d.readUnsignedShortBE(true);
              eh.field_d.position = 0;
              if (el.b(30000, var10)) {
                var11 = si.field_i.length;
                for (var12 = 0; var12 < var11; var12++) {
                  si.field_i[var12] = eh.field_d.readZeroPrefixedNullTerminatedText(27425);
                }
                Bzip2DecoderState.a((byte) -114);
                ck.field_e = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if ((PacketBuffer.field_l == qh.field_F) &&
              (TriangleMesh.a(false))) {
            if (ScorePopup.field_l != 255) {
              kh.field_a = eh.field_d.readNullTerminatedText((byte) 98);
            } else {
              var9_ref_String = eh.field_d.readNullableNullTerminatedText((byte) 53);
              if (var9_ref_String != null) {
                tc.a(-128, var9_ref_String, k.c(106));
              }
            }
            Bzip2DecoderState.a((byte) -114);
            ck.field_e = false;
            stackIn_54_0 = ScorePopup.field_l;
            return stackIn_54_0;
          }
          if (param6 < 56) {
            field_K = (gk) null;
          }
          if (oc.field_e == null) {
            if (ck.field_e) {
              if (ll.a((byte) 12) <= 30000L) {
                kh.field_a = uj.loginMessage2Text;
              } else {
                kh.field_a = IntrusiveNode.loginMessage3Text;
              }
              ck.field_e = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9 = NetworkArchiveRequest.field_x;
            NetworkArchiveRequest.field_x = ac.field_s;
            ck.field_e = true;
            ac.field_s = var9;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = (RuntimeException) (var7);
          stackIn_69_1 = new StringBuilder().append("pf.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 != -20) {
            this.field_E = (hk) null;
          }
          if (this.field_E == param4) {
            this.g(0);
          } else {
            if (this.field_M == param4) {
              jf.a((byte) 108);
            } else {
              if (this.field_G == param4) {
                if (!this.field_N) {
                  if (!this.field_I) {
                    hg.b(param1 - 23718);
                  } else {
                    ByteArrayBuffer.g(0);
                  }
                } else {
                  NetworkArchiveRequest.h(param1 ^ -60);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var6);
          stackIn_17_1 = new StringBuilder().append("pf.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        try {
            int var6 = 0;
            int var11_int = 0;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_68_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            Object var11 = null;
            ObjectInputStream var12 = null;
            eg var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            eg var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            try {
              var13 = (eg) ((Object) sl.field_k.firstForIteration(0));
              var17 = var13;
              if (var17 == null) {
                return;
              }
              var4 = 2 % ((param0 + 26) / 62);
              var3 = 0;
              for (var5 = 0; var5 < var17.field_f; var5++) {
                if (var13.field_n[var5] != null) {
                  if (var13.field_n[var5].status == 2) {
                    var13.field_j[var5] = -5;
                  }
                  if (var13.field_n[var5].status == 0) {
                    var3 = 1;
                  }
                }
                if (var13.field_i[var5] != null) {
                  if (2 == var13.field_i[var5].status) {
                    var13.field_j[var5] = -6;
                  }
                  if (var13.field_i[var5].status == 0) {
                    var3 = 1;
                  }
                }
              }
              if (var3 != 0) {
                return;
              }
              var5 = param1.position;
              param1.writeIntBE((byte) 95, var17.field_m);
              for (var6 = 0; var6 < var17.field_f; var6++) {
                if (var13.field_j[var6] != 0) {
                  param1.writeByte((byte) 6, var13.field_j[var6]);
                } else {
                  try {
                    var7_int = var13.field_k[var6];
                    if (var7_int == 0) {
                      var15 = (java.lang.reflect.Field) (var13.field_n[var6].result);
                      var9 = var15.getInt((Object) null);
                      param1.writeByte((byte) 3, 0);
                      param1.writeIntBE((byte) 95, var9);
                    } else {
                      if (var7_int == 1) {
                        var14 = (java.lang.reflect.Field) (var13.field_n[var6].result);
                        var8 = var14;
                        var14.setInt((Object) null, var13.field_g[var6]);
                        param1.writeByte((byte) 124, 0);
                      } else {
                        if (2 == var7_int) {
                          var25 = (java.lang.reflect.Field) (var13.field_n[var6].result);
                          var9 = var25.getModifiers();
                          param1.writeByte((byte) 126, 0);
                          param1.writeIntBE((byte) 95, var9);
                        }
                      }
                    }
                    if (var7_int == 3) {
                      var27 = (java.lang.reflect.Method) (var13.field_i[var6].result);
                      var24 = var13.field_o[var6];
                      var10 = new Object[var24.length];
                      for (var11_int = 0; var11_int < var24.length; var11_int++) {
                        var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var11_int])));
                        var10[var11_int] = var12.readObject();
                      }
                      var11 = var27.invoke((Object) null, var10);
                      if (var11 == null) {
                        param1.writeByte((byte) -88, 0);
                      } else if (var11 instanceof Number) {
                        param1.writeByte((byte) 126, 1);
                        param1.writeLongBE((byte) 116, ((Number) (var11)).longValue());
                      } else if (!(var11 instanceof String)) {
                        param1.writeByte((byte) -86, 4);
                      } else {
                        param1.writeByte((byte) 121, 2);
                        param1.writeNullTerminatedText((String) (var11), 0);
                      }
                    } else {
                      if (var7_int == 4) {
                        var26 = (java.lang.reflect.Method) (var13.field_i[var6].result);
                        var9 = var26.getModifiers();
                        param1.writeByte((byte) 123, 0);
                        param1.writeIntBE((byte) 95, var9);
                      }
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 122, -10);
                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) -101, -11);
                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 124, -12);
                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) -78, -13);
                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 4, -14);
                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                    decompiledCaughtException = decompiledCaughtParameter5;
                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 11, -15);
                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                    decompiledCaughtException = decompiledCaughtParameter6;
                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) -127, -16);
                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                    decompiledCaughtException = decompiledCaughtParameter7;
                    var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 126, -17);
                  } catch (java.io.IOException decompiledCaughtParameter8) {
                    decompiledCaughtException = decompiledCaughtParameter8;
                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) 121, -18);
                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                    decompiledCaughtException = decompiledCaughtParameter9;
                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                    param1.writeByte((byte) -100, -19);
                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                    decompiledCaughtException = decompiledCaughtParameter10;
                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                    param1.writeByte((byte) -74, -20);
                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                    decompiledCaughtException = decompiledCaughtParameter11;
                    var7_ref11 = decompiledCaughtException;
                    param1.writeByte((byte) -37, -21);
                  }
                }
              }
              param1.appendCrc32(8, var5);
              var17.unlinkNode(false);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_67_0 = (RuntimeException) (var2);
              stackIn_67_1 = new StringBuilder().append("pf.M(").append(param0).append(',');
              if (param1 == null) {
                stackIn_68_2 = "null";
              } else {
                stackIn_68_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        if ((!(!SpriteState.e(param0)) ||
            (!(this.field_J.field_s.length() <= 0) &&
              !(0 >= this.field_P.field_s.length())))) {
          ef.a(this.field_P.field_s, (byte) 66, this.field_J.field_s);
        }
    }

    pf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (dh) null);
        hd dupTemp$0 = null;
        hd dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        hk stackIn_18_1 = null;
        hk stackIn_18_2 = null;
        hk stackIn_19_1 = null;
        hk stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        od var9 = null;
        hd var12 = null;
        hd var13 = null;
        try {
          if (!param3) {
            stackIn_4_1 = false;
          } else {
            stackIn_4_1 = true;
          }
          ((pf) (this)).field_C = stackIn_4_1;
          this.field_L = param1;
          if (!param2) {
            stackIn_7_1 = false;
          } else {
            stackIn_7_1 = true;
          }
          ((pf) (this)).field_N = stackIn_7_1;
          if (!param4) {
            stackIn_10_1 = false;
          } else {
            stackIn_10_1 = true;
          }
          ((pf) (this)).field_I = stackIn_10_1;
          if (this.field_N) {
            if (!((!this.field_C) &&
                (!this.field_I))) {
              throw new IllegalStateException();
            }
          }
          this.field_J = (dj) ((Object) new hc(param0, (bb) (this), 100));
          this.field_P = (dj) ((Object) new hc("", (bb) (this), 20));
          if (!this.field_N) {
            this.field_E = new hk(k.loginText, (bb) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_I) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ok.justPlayText;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ll.backText;
            }
            ((pf) (this)).field_G = new hk(stackIn_19_3, (bb) null);
            if (this.field_C) {
              this.field_M = new hk(se.createAnAccountText, (bb) (this));
            }
          } else {
            this.field_E = new hk(a.retryText, (bb) null);
            this.field_G = new hk(rj.quitToWebsiteText, (bb) null);
            this.field_J.field_D = false;
          }
          this.field_J.field_q = (dh) ((Object) new ac(10000536));
          this.field_P.field_q = (dh) ((Object) new uh(10000536));
          var6 = new ml();
          this.field_E.field_q = (dh) ((Object) var6);
          if (this.field_G != null) {
            this.field_G.field_q = (dh) ((Object) var6);
          }
          if (this.field_M != null) {
            this.field_M.field_q = (dh) ((Object) var6);
          }
          this.field_J.field_j = SocketArchiveNetworkClient.loginUsernameTooltipText;
          if (null != this.field_M) {
            this.field_M.field_j = ic.loginCreateTooltipText;
          }
          if (this.field_N) {
            this.field_G.field_j = j.quitWarningText;
          } else {
            if (!this.field_I) {
              this.field_G.field_q = (dh) ((Object) new fh());
            } else {
              this.field_G.field_j = vi.loginJustPlayTooltipText;
              this.field_G.field_q = (dh) ((Object) new fh());
            }
          }
          this.field_m = 15;
          var7 = ng.field_F;
          if (this.field_L != null) {
            this.field_m = this.field_m + (var7.measureWrappedHeight(this.field_L, this.field_r - 40, var7.maxAscent) + 5);
          }
          var8 = jj.loginUsernameEmailText;
          var9 = th.a(k.c(120), 200);
          if (var9 != mb.field_b) {
            if (var9 == rl.field_W) {
              var8 = bk.loginUsernameText;
            }
          } else {
            var8 = sl.loginEmailText;
          }
          dupTemp$0 = new hd(10, this.field_m, -20 + this.field_r, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) -110, dupTemp$0);
          this.field_m = this.field_m + (((el) ((Object) var12)).field_h + 5);
          dupTemp$1 = new hd(10, this.field_m, this.field_r - 20, 25, this.field_P, false, 80, 3, var7, 16777215, LoginPayloadKind.createPasswordText);
          var13 = dupTemp$1;
          this.b((byte) -120, dupTemp$1);
          this.field_E.field_u = (bb) (this);
          this.field_m = this.field_m + (((el) ((Object) var13)).field_h + 5);
          if (this.field_M != null) {
            this.field_M.field_u = (bb) (this);
          }
          if (this.field_G != null) {
            this.field_G.field_u = (bb) (this);
          }
          if (this.field_M != null) {
            this.field_E.a(30, this.field_r - 95, (byte) -92, this.field_m, 85);
            this.field_m = this.field_m + 60;
          } else {
            this.field_E.a(30, -10 + this.field_r - 6, (byte) -33, this.field_m, 8);
            this.field_m = this.field_m + 35;
          }
          if (this.field_M != null) {
            this.field_M.a(30, -10 + this.field_r - 6, (byte) -42, this.field_m, 8);
            this.field_m = this.field_m + 35;
          }
          L17: {
            if (this.field_G != null) {
              if ((!this.field_N) &&
                  (!this.field_I)) {
                this.field_G.a(20, 40, (byte) -55, this.field_m, 8);
                this.field_m = this.field_m + 25;
                break L17;
              }
              this.field_G.a(30, -10 + (this.field_r - 6), (byte) -64, this.field_m, 8);
              this.field_m = this.field_m + 35;
            }
          }
          this.a(3 + this.field_m, this.field_r, (byte) -17, 0, 0);
          this.b((byte) -83, this.field_E);
          if (null != this.field_M) {
            this.b((byte) -111, this.field_M);
          }
          if (this.field_G != null) {
            this.b((byte) -127, this.field_G);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = (RuntimeException) (var6_ref);
          stackIn_59_1 = new StringBuilder().append("pf.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static mb h(byte param0) {
        if (param0 != -42) {
            pf.h((byte) -98);
        }
        return new mb(vh.f(100), jg.d(7));
    }

    final void i(int param0) {
        this.field_J.i((byte) 48);
        this.field_P.i((byte) 116);
        int var2 = 40 % ((param0 - 17) / 38);
    }

    static {
        field_D = false;
        js5CrcErrorText = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_K = new gk();
    }
}
