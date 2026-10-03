/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_c;
    static String[] field_b;
    static boolean field_a;

    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_33_0 = 0;
            boolean stackIn_45_0 = false;
            boolean stackIn_48_0 = false;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_102_0 = 0;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            String stackIn_106_2 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_109_2 = null;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            var9 = Geoblox.field_C;
            try {
              if (null == oc.field_e) {
                if (!w.a(param0, 52)) {
                  stackIn_5_0 = -1;
                  return stackIn_5_0;
                }
              }
              if (PacketBuffer.field_l == gi.field_d) {
                if (!param0) {
                  ih.field_a = vf.a(false, param1, param4, false);
                } else {
                  var11 = (String) null;
                  ih.field_a = SecondaryDeque.a(true, oa.field_c, (String) null, param1, false);
                }
                fj.field_q.position = 0;
                fj.field_q.writeByte((byte) -102, 14);
                fj.field_q.writeByte((byte) -78, ih.field_a.a((byte) -32).field_c);
                cm.a(-1, -1);
                PacketBuffer.field_l = oe.field_T;
              }
              if (oe.field_T == PacketBuffer.field_l) {
                if (el.b(30000, 1)) {
                  var6_int = eh.field_d.readUnsignedByte((byte) 34);
                  eh.field_d.position = 0;
                  if (var6_int != 0) {
                    p.field_k = -1;
                    PacketBuffer.field_l = ac.field_v;
                    ScorePopup.field_l = var6_int;
                  } else {
                    PacketBuffer.field_l = f.field_hb;
                  }
                }
              }
              if (f.field_hb == PacketBuffer.field_l) {
                if (el.b(30000, 8)) {
                  ak.field_a = eh.field_d.readLongBE(2901);
                  eh.field_d.position = 0;
                  uk.a(26, param2, param0, ih.field_a, param3);
                  PacketBuffer.field_l = da.field_g;
                }
              }
              if (param5 != 0) {
                var10 = (String) null;
                ri.a(false, (String) null, 95, false, (String) null, 13);
              }
              L6: {
                if (da.field_g == PacketBuffer.field_l) {
                  if (el.b(30000, 1)) {
                    var6_int = eh.field_d.readUnsignedByte((byte) 34);
                    eh.field_d.position = 0;
                    fl.field_b = null;
                    ScorePopup.field_l = var6_int;
                    if (var6_int != 0) {
                      if (var6_int != 1) {
                        if (var6_int != 8) {
                          PacketBuffer.field_l = ac.field_v;
                          p.field_k = -1;
                          break L6;
                        }
                        Bzip2DecoderState.a((byte) -116);
                        ck.field_e = false;
                        stackIn_33_0 = var6_int;
                        return stackIn_33_0;
                      }
                    }
                    p.field_k = -1;
                    PacketBuffer.field_l = da.field_f;
                  }
                }
              }
              if (da.field_f == PacketBuffer.field_l) {
                if (TriangleMesh.a(false)) {
                  oa.field_c = eh.field_d.readLongBE(2901);
                  oc.field_f = eh.field_d.readUnsignedByte((byte) 34);
                  eh.field_d.readUnsignedByte((byte) 34);
                  og.field_n = eh.field_d.readUnsignedShortBE(true);
                  var6 = eh.field_d.readNullableNullTerminatedText((byte) 53);
                  var7 = eh.field_d.readUnsignedByte((byte) 34);
                  if ((1 & var7) != 0) {
                    ic.a((byte) 65);
                  }
                  if (!param0) {
                    stackIn_45_0 = !((var7 & 4) == 0);
                    GzipInflater.field_b = stackIn_45_0;
                    stackIn_48_0 = !((var7 & 8) == 0);
                    fb.field_l = stackIn_48_0;
                    if (!fb.field_l) {
                    }
                  }
                  L13: {
                    if (ll.field_e) {
                      eh.field_d.readUnsignedByte((byte) 34);
                      eh.field_d.readUnsignedByte((byte) 34);
                      eh.field_d.readIntBE((byte) -48);
                      PacketBuffer.field_n = eh.field_d.readUnsignedShortBE(true);
                      hc.field_K = new byte[PacketBuffer.field_n];
                      for (var8 = 0; PacketBuffer.field_n > var8; var8++) {
                        hc.field_K[var8] = eh.field_d.readSignedByte((byte) 72);
                      }
                      break L13;
                    }
                  }
                  SecondaryDeque.field_f = eh.field_d.readNullTerminatedText((byte) 105);
                  var12 = (CharSequence) ((Object) SecondaryDeque.field_f);
                  vg.field_b = oe.a(var12, 12);
                  ik.field_a = eh.field_d.readUnsignedByte((byte) 34);
                  PacketBuffer.field_l = eh.field_b;
                  if (ih.field_a.a((byte) -32) != ej.field_b) {
                    if (ih.field_a.a((byte) -32) == Geoblox.field_B) {
                      rl.field_W.a(k.c(108), 0);
                    }
                  } else {
                    mb.field_b.a(k.c(122), 0);
                  }
                  ck.field_e = false;
                  if (var6 != null) {
                    tc.a(100, var6, k.c(112));
                  }
                  L17: {
                    if (og.field_n <= 0) {
                      if (!GzipInflater.field_b) {
                        try {
                          wk.a((byte) -6, k.c(107), "unzap");
                        } catch (java.lang.Throwable decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var8_ref_Throwable = decompiledCaughtException;
                        }
                        break L17;
                      }
                    }
                    try {
                      wk.a(-14882, new Object[]{fh.a(oa.field_c, param5 + 97)}, k.c(param5 + 119), "zap");
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var8_ref_Throwable = decompiledCaughtException;
                    }
                  }
                  if (og.field_n > 0) {
                    rb.field_c = true;
                  }
                  fj.field_q.initializeCipher(hl.field_D, false);
                  for (var8 = 0; var8 < 4; var8++) {
                    hl.field_D[var8] = hl.field_D[var8] + 50;
                  }
                  eh.field_d.initializeCipher(hl.field_D, false);
                  stackIn_78_0 = ScorePopup.field_l;
                  return stackIn_78_0;
                }
              }
              if (PacketBuffer.field_l == ac.field_v) {
                if (TriangleMesh.a(false)) {
                  Bzip2DecoderState.a((byte) -118);
                  if (ScorePopup.field_l == 7) {
                    if (!ck.field_e) {
                      ck.field_e = true;
                      stackIn_86_0 = -1;
                      return stackIn_86_0;
                    }
                  }
                  if (ScorePopup.field_l == 7) {
                    ScorePopup.field_l = 3;
                  }
                  kh.field_a = eh.field_d.readNullTerminatedText((byte) 101);
                  ck.field_e = false;
                  stackIn_91_0 = ScorePopup.field_l;
                  return stackIn_91_0;
                }
              }
              if (null == oc.field_e) {
                if (ck.field_e) {
                  if (30000L >= ll.a((byte) 12)) {
                    kh.field_a = uj.loginMessage2Text;
                  } else {
                    kh.field_a = IntrusiveNode.loginMessage3Text;
                  }
                  ck.field_e = false;
                  stackIn_99_0 = 3;
                  return stackIn_99_0;
                }
                var6_int = NetworkArchiveRequest.field_x;
                NetworkArchiveRequest.field_x = ac.field_s;
                ac.field_s = var6_int;
                ck.field_e = true;
              }
              stackIn_102_0 = -1;
              return stackIn_102_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_105_0 = (RuntimeException) (var6_ref);
              stackIn_105_1 = new StringBuilder().append("ri.B(").append(param0).append(',');
              if (param1 == null) {
                stackIn_106_2 = "null";
              } else {
                stackIn_106_2 = "{...}";
              }
              stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param2).append(',').append(param3).append(',');
              if (param4 == null) {
                stackIn_109_2 = "null";
              } else {
                stackIn_109_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param5).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 2 + (i.avatarMaskRaster.fullWidth >> 1);
        if (param2 != 29497) {
            return;
        }
        int var4 = (i.avatarMaskRaster.fullHeight >> 1) + 2;
        fc.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(param0 - var3, param1 - var4, rj.avatarTintColor);
        vh.avatarMouthFrames[nd.avatarFeedbackModeId].drawGrayModulated(-var3 + param0, -var4 + param1, rj.avatarTintColor);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 5366) {
            field_b = (String[]) null;
        }
        field_b = null;
    }

    static {
        field_a = false;
        field_b = new String[]{"Clear 3 geoblox of the same colour and shape", "Clear the geoblox avatar", "Finish a stage with the avatar clear of geoblox", "Achieve a 6x bonus multiplier", "Achieve a 7x bonus multiplier", "Achieve an 8x bonus multiplier", "Destroy 5 black orbs", "Destroy 3 black orbs with one shock", "Pass the sun stage", "Pass the sweet stage", "Pass the jewellery stage", "Pass the germ stage", "Pass the space stage", "Pass the sport stage", "Pass the bakery stage", "Get past all stages twice!", "Score 7,000 points during Halloween"};
    }
}
